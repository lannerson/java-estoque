/**
 * Classe responsável por fornecer uma instância do Usuario, gerenciar a
 * persistencia do Usuario e controlar as regras de negócio referente ao
 * Usuario
 * @author Martins Pereira
 */
package sgps.controle;

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

}
