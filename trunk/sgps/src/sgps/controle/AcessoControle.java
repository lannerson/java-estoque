/**
 * Classe responsável por fornecer uma instância do Controle de acesso do usuario, gerenciar a
 * persistencia do controle de Acesso e controlar as regras de negócio referente ao
 * controle de acesso
 * @author Martins Pereira
 */
package sgps.controle;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import sgps.classeMapeada.Acessousuario;
import sgps.classeMapeada.Usuario;

public class AcessoControle extends ControleAbstrato<Acessousuario, Integer> {

    /** Construtor da classe AcessoControle. */
    public AcessoControle() {
        super(Acessousuario.class);

    }

    /**
     * Método responsável por retornar uma instância de Acessousuario.
     * @return Acessousuario - Instância de Acessousuario
     */
    public Acessousuario getInstanciaAcessousuario() {
        return new Acessousuario();
    }

    /**
     * Método responsável por retornar do banco de dados uma lista de acessos 
     * que o usuario possui.
     * @param senha - senha do usuário
     * @param login  - nome do usuario
     * @return listaAcesso - lista de acesso de usuario
     */
    public List<Acessousuario> listaDeAcesso(String senha, String login) {//este métado ainda não foi implementado

        List<Acessousuario> listaAcesso = new ArrayList<Acessousuario>();

        return listaAcesso;
    }

    /**
     * Método responsável por liberar um acesso ao usuário
     * @param idUsuario  - chave primária da tabela usuario
     * @param idTelaSistema  - chave primária da tabela TelaSistema
     * @return true - se conseguir pesistir os dados
     * caso contrário irá disparar uma excessão.
     *
     */
    public boolean consederAcesso(int idUsuario, int idTelaSistema) {
        Acessousuario acessousuario = new Acessousuario(idUsuario, idTelaSistema);
        acessousuario.setFlagtipoacesso(true);
        salvar(acessousuario);
        return true;
    }

    public boolean verificaLogin(String login, String senha) {
        UsuarioControle usuarioControle = new UsuarioControle();
        Usuario us = usuarioControle.getInstanciaUsuario();
        EntityManager em = usuarioControle.getEntityManager();
        Query query;
        query = em.createNamedQuery("Usuario.verificaLogin");
        query.setParameter("nomeusuario", login);
        query.setParameter("senhausuario", senha);
        List<Usuario> lus = new ArrayList<Usuario>();
        lus = query.getResultList();
        if (lus.size() > 0) {
            return true;
        } else {
            return false;
        }



    }
}
