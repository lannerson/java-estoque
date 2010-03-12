/**
 * Classe responsável por fornecer uma instância do Usuario, gerenciar a
 * persistencia do Usuario e por controlar as regras de negócio referente ao
 * Usuario
 */
package sgps.controle;
import javax.swing.JOptionPane;
import sgps.classeMapeada.Usuario;



public class UsuarioControle extends ControleAbstrato<Usuario, Integer> {
    
    Usuario Usuario;
    
    public UsuarioControle() {
        super(Usuario.class);
    }
    
    public Usuario getInstanciaUsuario(){
        if (Usuario == null){
            Usuario = new Usuario();
        }else{
            Usuario = null;
            Usuario = new Usuario();
        }
        return Usuario;
    }
    
    @Override
    public boolean salvar(Usuario obj) {
        
        JOptionPane.showMessageDialog(null, "Irei Reescrever o metodo Salvar");
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
}
