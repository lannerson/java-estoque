/**
 * Classe que define os métodos abstrados a serem herdados pelas as classes
 * de controles.
 * @author Daniel Vilas Boas
 */

package sgps.controle;

import sgps.conexao.Conexao;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.swing.JOptionPane;


public abstract class ControleAbstrato<T, PK extends Serializable> implements ControleAbstratoInterface<T, PK> {

    private final Class<T> objClass;
    protected EntityManager em;

    public ControleAbstrato(final Class<T> objClass) {
        this.objClass = objClass;
        em = Conexao.getEntityManager();
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
            Conexao.log("Método Salvar da classe: "+objClass.getSimpleName(),
                    Level.INFO, null);
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
            Conexao.log("Registro da classe "+objClass.getSimpleName()+
                    " salvo com Sucesso", Level.INFO, null);
            return true;
        } catch (Exception e) {
            try {
                Conexao.log("Erro ao salvar registro da classe "
                        +objClass.getSimpleName(), Level.INFO, e);
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
            Conexao.log("Método Alterar da classe: "+objClass.getSimpleName(),
                    Level.INFO, null);
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
            Conexao.log("Registro da classe "+objClass.getSimpleName()+
                    " alterado com Sucesso", Level.INFO, null);
            return true;
        } catch (Exception e) {
            try {
                Conexao.log("Erro ao Alterar registro da classe "
                        +objClass.getSimpleName(), Level.INFO, e);
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
            Conexao.log("Método Excluir da classe: "+objClass.getSimpleName(),
                    Level.INFO, null);
            T t;
            t = (T) localizar(primaryKey);
            em.getTransaction().begin();
            if (t == null) {
                throw new PersistenceException("persistencia");
            }
            em.merge(t);
            em.remove(t);
            em.getTransaction().commit();
            Conexao.log("Registro da classe "+objClass.getSimpleName()+
                    " excluído com Sucesso", Level.INFO, null);
            return true;
        } catch (PersistenceException pe) {
            try {
                Conexao.log("Erro ao Excluir registro da classe "
                        +objClass.getSimpleName(), Level.INFO, pe);
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
            Conexao.log("Método Localizar da classe: "+objClass.getSimpleName(),
                    Level.INFO, null);
            em.getTransaction().begin();
            T t;

            t = em.find(objClass, primaryKey);
            if (t == null) {
                throw new Exception("Não localizado");
            }
            em.getTransaction().commit();
            Conexao.log("Método localizar da classe "+objClass.getSimpleName()+
                    " executado com Sucesso", Level.INFO, null);
            return t;
        } catch (Exception e) {
            try {
                Conexao.log("Erro no método Localizar da classe "
                        +objClass.getSimpleName(), Level.INFO, e);
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
            Conexao.log("Método getBusca da classe: "+objClass.getSimpleName(),
                    Level.INFO, null);
            em.getTransaction().begin();
            Query query =
                    em.createNamedQuery(objClass.getSimpleName() + ".findById").
                    setParameter("id", primaryKey);
            T t = (T) query.getSingleResult();
            em.getTransaction().commit();
            Conexao.log("Método getBusca da classe "+objClass.getSimpleName()+
                    " executado com Sucesso", Level.INFO, null);
            return t;
        } catch (Exception e) {
            try {
                Conexao.log("Erro no método GetBusca da classe "
                        +objClass.getSimpleName(), Level.INFO, e);
                em.getTransaction().rollback();
            } catch (Exception ex1) {
                e.printStackTrace();
            }
            return null;
        }

    }

    @Override
    public List<T> find(T example) {
        Conexao.log("Método find da classe: "+objClass.getSimpleName(),
                    Level.INFO, null);
        List<T> list = null;
        try {
            em.getTransaction().begin();
            Query query =
                    (Query) em.createNamedQuery(objClass.getSimpleName() + ".findByExemple").
                    setParameter("exemple", example);
            list = query.getResultList();
            em.getTransaction().commit();
            Conexao.log("Método Find da classe "+objClass.getSimpleName()+
                    " executado com Sucesso", Level.INFO, null);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            try {
                Conexao.log("Erro no método Find da classe "
                        +objClass.getSimpleName(), Level.INFO, e);
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
        Conexao.log("Método FindAll da classe: "+objClass.getSimpleName(),
                    Level.INFO, null);
        try {
            em.getTransaction().begin();
            Query query =
                    em.createNamedQuery(objClass.getSimpleName() + ".findAll");
            list = query.getResultList();
            em.getTransaction().commit();
            Conexao.log("Método FindAll da classe "+objClass.getSimpleName()+
                    " executado com Sucesso", Level.INFO, null);
            return list;
        } catch (Exception e) {
            try {
                Conexao.log("Erro no método FindAll da classe "
                        +objClass.getSimpleName(), Level.INFO, e);
                em.getTransaction().rollback();
            } catch (Exception ex1) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Query Consulta(String NomeConsulta) {
        try {
            Conexao.log("Método Consulta da classe: "+objClass.getSimpleName(),
                    Level.INFO, null);
            em.getTransaction().begin();
            Query query = (Query) em.createNamedQuery(NomeConsulta);
            em.getTransaction().commit();
            Conexao.log("Método Consulta da classe "+objClass.getSimpleName()+
                    " executado com Sucesso", Level.INFO, null);
            return query;
        } catch (Exception e) {
            try {
                Conexao.log("Erro no método Consulta da classe "
                        +objClass.getSimpleName(), Level.INFO, e);
                em.getTransaction().rollback();
            } catch (Exception ex1) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public void camposObrigatorios(T objeto) throws Exception {
    }

    @Override
    public void formatoCampos(T objeto) throws Exception {
    }
}// FIM CLASSE

