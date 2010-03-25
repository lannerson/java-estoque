/**
 * Classe responsável por fornecer a conexão com o Banco de Dados.
 * @author Daniel Vilas Boas
 */
package sgps.conexao;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Conexao {

    static final String PERSISTENCE_UNIT = "SGPSPU"; 
    private static final EntityManagerFactory factory;
    private static final ThreadLocal<EntityManager> threadLocal;
    private static final Logger logger; 

    static {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        threadLocal = new ThreadLocal<EntityManager>();
        logger = Logger.getLogger(PERSISTENCE_UNIT);
        logger.setLevel(Level.ALL);        
    }

    public static EntityManager getEntityManager() {

        EntityManager manager = threadLocal.get();
        if (manager == null || !manager.isOpen()) {
            manager = factory.createEntityManager();
            threadLocal.set(manager);
        }
        return manager;     
    }

    public static void closeEntityManager() {

        EntityManager manager = threadLocal.get();
        threadLocal.set(null);
        if (manager != null) {
            manager.close();
        }
        
    }

    public static void beginTransaction() {
        getEntityManager().getTransaction().begin();
    }

    public static void commit() {
        getEntityManager().getTransaction().commit();
    }

    public static Query createQuery(String query) {
        return getEntityManager().createQuery(query);
    }

    public static void log(String info, Level level, Throwable ex) {
        logger.log(level, info, ex);
    }
}

