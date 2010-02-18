package br.com.Persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Daniel Vilas Boas
 * Janeiro 2010
 */
public class PersistenciaConexao {

    private static final EntityManagerFactory entityManagerFactory;
    private static final ThreadLocal<EntityManager> entityManagerThreadLocal = new ThreadLocal<EntityManager>();

    static {
        entityManagerFactory = Persistence.createEntityManagerFactory("siscomjava");
    }

    public static EntityManager entityManager() {
        if (entityManagerThreadLocal.get() == null) {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManagerThreadLocal.set(entityManager);
        }

        return entityManagerThreadLocal.get();
    }

    public static void closeEntityManager() {
        EntityManager entityManager = entityManagerThreadLocal.get();
        if (entityManager != null && entityManager.isOpen()) {
            entityManager.close();
        }

        entityManagerThreadLocal.set(null);
    }
}

