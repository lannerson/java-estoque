/**
 * Classe responsável por fornecer uma instância do Usuario, gerenciar a
 * persistencia do Usuario e controlar as regras de negócio referente ao
 * Usuario
 * @author Martins Pereira
 */
package sgps.controle;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import sgps.classeMapeada.Usuario;

public class UsuarioControle extends ControleAbstrato<Usuario, Integer> {

    /** Construtor da classe UsuarioControle. */
    public UsuarioControle() {
        super(Usuario.class);

    }

    /**
     * Método responsável por retornar uma instância de Usuario.
     * @return Usuario - Instância de Usuario
     */
    public Usuario getInstanciaUsuario() {
        return new Usuario();
    }

    public Usuario buscaUsuarioSenha(String login, String senha) {
        Usuario us = new Usuario();
        EntityManager em = super.getEntityManager();
        Query query;
        query = em.createNamedQuery("Usuario.verificaLogin");
        query.setParameter("nomeusuario", login);
        query.setParameter("senhausuario", senha);
        us = (Usuario) query.getSingleResult();
        return us;
    }

    public List<Usuario> buscaUsuarioSenhaList(String login, String senha) {
        Usuario us = new Usuario();
        EntityManager em = super.getEntityManager();
        Query query;
        query = em.createNamedQuery("Usuario.verificaLogin");
        query.setParameter("nomeusuario", login);
        query.setParameter("senhausuario", senha);
        List<Usuario> lus = new ArrayList<Usuario>();
        lus = query.getResultList();
        return lus;

    }
}
