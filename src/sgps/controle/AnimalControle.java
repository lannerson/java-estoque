/**
 * Classe responsável por fornecer uma instância do Animal, gerenciar a
 * persistencia do Animal e por controlar as regras de negócio referente ao
 * Animal
 */
package sgps.controle;

import java.io.Serializable;
import javax.swing.JOptionPane;
import sgps.classeMapeada.Animal;



public class AnimalControle extends ControleAbstrato<Animal, Integer> {

    Animal animal;

    public AnimalControle() {
        super(Animal.class);
    }

    public Animal getInstanciaAnimal(){
        if (animal == null){
            animal = new Animal();
        }else{
            animal = null;
            animal = new Animal();
        }
        return animal;         
    }

    @Override
    public boolean salvar(Animal obj) {

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
