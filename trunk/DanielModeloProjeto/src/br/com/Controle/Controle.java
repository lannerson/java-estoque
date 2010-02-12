package br.com.Controle;
import br.com.Persistencia.PersistenciaConexao;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Vilas Boas
 * Janeiro 2010
 */

public abstract class Controle<T, PK extends Serializable> implements ControleInterface<T, PK> {

    private final Class<T> objClass;
    protected EntityManager em;

    public Controle(final Class<T> objClass) {
        this.objClass = objClass;
        em = PersistenciaConexao.entityManager();
    }

    public EntityManager getEntityManager() {
        return em;
    }

    @Override
    public Class<T> getObjClass() {
        return this.getObjClass();
    }

    @Override
    public boolean salvar(final T obj) {
        try {
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            try {
                em.getTransaction().rollback();
            } catch (Exception ex1) {
                e.printStackTrace();
            }
            return false;
        }
    }

    @Override
    public boolean alterar(final T obj) {
        try {
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            try {
                em.getTransaction().rollback();
            } catch (PersistenceException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "verifique a integridade");
            } catch (Exception ex1) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Ocorreu uma exceção");
            }
            return false;
        }
    }

    @Override
    public boolean excluir(PK primaryKey) {
        try {
            //JOptionPane.showMessageDialog(null, this.objClass);
            T t;
            t = (T) localizar(primaryKey);

            em.getTransaction().begin();
            if (t == null) {
                throw new PersistenceException("persistencia");
            }
            em.merge(t);
            em.remove(t);
            em.getTransaction().commit();
            return true;
        } catch (PersistenceException pe) {
            try {
                pe.printStackTrace();
                JOptionPane.showMessageDialog(null, pe.getMessage());
                em.getTransaction().rollback();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "nullo");
                em.getTransaction().rollback();
            }
            return false;
        }
    }

    @Override
    public T localizar(PK primaryKey) {
        try {
            em.getTransaction().begin();
            T t;
            //t = (T) em.find(objClass, primaryKey);
            t = em.find(objClass, primaryKey);
            if (t == null) {
                throw new Exception("Não localizado");
            }
            em.getTransaction().commit();
            return t;
        } catch (Exception e) {
            try {
                JOptionPane.showMessageDialog(null, e.getMessage());
                em.getTransaction().rollback();
            } catch (NullPointerException npe) {
                npe.printStackTrace();
                JOptionPane.showMessageDialog(null, npe.getMessage());
            } catch (PersistenceException pe) {
                pe.printStackTrace();
                JOptionPane.showMessageDialog(null, "verifique a integridade");
            }
            return null;
        }
    }

    @Override
    public T getBusca(final PK primaryKey) {
        try {
            em.getTransaction().begin();
            Query query =
            em.createNamedQuery(objClass.getSimpleName() + ".findById").
            setParameter("id", primaryKey);
            T t = (T) query.getSingleResult();
            em.getTransaction().commit();
            return t;
        } catch (Exception e) {
            try {
                em.getTransaction().rollback();
            } catch (Exception ex1) {
                e.printStackTrace();
            }
            return null;
        }

    }

    @Override
    public List<T> find(T example) {
        List<T> list = null;
        try {
            em.getTransaction().begin();
            Query query =
                    (Query) em.createNamedQuery(objClass.getSimpleName() + ".findByExemple").
                    setParameter("exemple", example);
            list = query.getResultList();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            try {
                em.getTransaction().rollback();
            } catch (Exception ex1) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public List<T> findAll() {
        List<T> list = null;
        try {
            em.getTransaction().begin();
            Query query =
                    em.createNamedQuery(objClass.getSimpleName() + ".findAll");
            list = query.getResultList();
            em.getTransaction().commit();

            return list;
        } catch (Exception e) {
            try {
                em.getTransaction().rollback();

            } catch (Exception ex1) {
                e.printStackTrace();
            }
        }
        return null;
    }
}// FIM CLASSE

