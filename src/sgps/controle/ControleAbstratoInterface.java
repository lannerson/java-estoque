package sgps.controle;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Daniel Vilas Boas
 * Janeiro 2010
 */
public interface ControleAbstratoInterface<T, PK extends Serializable> {

    public abstract Class<T> getObjClass();

    public abstract boolean salvar(final T obj);

    public abstract boolean alterar(final T obj);

    public abstract boolean excluir(PK primaryKey);

    public abstract T localizar(PK primaryKey);

    public abstract T getBusca(PK primaryKey);

    public abstract List<T> find(T example);

    public abstract List<T> findAll();

    public void camposObrigatorios(T objeto) throws Exception;

    public void formatoCampos(T objeto) throws Exception;
}

