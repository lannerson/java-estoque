package br.com.Controle;

import br.com.ClassesPersistentes.Produto;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Vilas Boas
 * Janeiro 2010
 */
public class ProdutoControle extends Controle<Produto, String> {

    public ProdutoControle() {
        super(Produto.class);
    }

    public String CalcularQualquerCoisa(){
        return "Ok, está funcionando...";
    }

    @Override
    public boolean salvar(Produto obj) {

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

    
}//  fim da classe
