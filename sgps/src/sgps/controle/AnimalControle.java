/**
 * Classe responsável por fornecer uma instância do Animal, gerenciar a
 * persistencia do Animal e controlar as regras de negócio referente ao
 * Animal
 * @author Daniel Vilas Boas
 */
package sgps.controle;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.Query;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import sgps.classeMapeada.Animal;
import sgps.classeMapeada.Cliente;
import sgps.classeMapeada.Especie;
import sgps.classeMapeada.Raca;
import sgps.conexao.Conexao;

public class AnimalControle extends ControleAbstrato<Animal, Integer> {

    private List<Especie> listaEspecie;
    private List<Raca> listaRaca;
    private Raca raca;

    /** Construtor da classe AnimalControle. */
    public AnimalControle() {
        super(Animal.class);
        atualizaListaEspecie();
    }

    /**
     * Método responsável por atualizar a lista de espécies.
     */
    public void atualizaListaEspecie(){
        listaEspecie = Consulta("Especie.findAll").getResultList();
    }

    /**
     * Método para retorno do ID da Espécie de Animal.
     * @param indiceCombo int - Índice do item do ComboBox.
     * @return int - ID da espécie.
     */
    public int getIdEspecie(int indiceCombo) {
        try {
            if (listaEspecie != null) {
                for (int i = 0; i <= listaEspecie.size(); i++) {
                    if (indiceCombo == i) {
                        return listaEspecie.get(i).getIdespecie();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * Método responsável por retornar uma instância de Animal.
     * @return Animal - Instância de Animal
     */
    public Animal getInstanciaAnimal() {
        return new Animal();
    }

    /**
     * Método para retorno de instância da Raça do Animal.
     * @param indiceCombo int - Índice do item do ComboBox.
     * @return Raça - Retorno do objeto Raça.
     */
    public Raca getInstaciaRaca(int indiceCombo) {

        if (raca == null) {
            raca = new Raca();
        }

        try {
            if (listaRaca != null) {
                for (int i = 0; i <= listaRaca.size(); i++) {
                    if (indiceCombo == i) {
                        raca = listaRaca.get(i);                        
                        return raca;
                    }
                }
            }
        } catch  (Exception e) {
            e.printStackTrace();
        }
        return raca;
    }

    /**
     * Método responsável por preencher um Combobox com os tipos de Espécies
     * cadastradas no banco de dados.
     * @param nomeComboBox JComboBox - Objeto que receberá as informações.
     */
    public void popularComboEspecie(JComboBox nomeComboBox) {
        try {
            if (listaEspecie != null) {
                nomeComboBox.removeAllItems();
                for (Especie especie : listaEspecie) {
                    nomeComboBox.addItem(especie.getNomeespecie());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Método responsável por preencher o Combobox com os tipos de Raças
     * cadastradas no banco de dados.
     * @param nomeComboBox JComboBox - Objeto que receberá as informações.
     * @param codigoEspecie int - Índice do item da ComboBox.
     * @return Boolean - retornar true se obteve sucesso na pesquisa.
     */
    public boolean popularComboRaca(JComboBox nomeComboBox, Integer codigoEspecie) {
        try {
            Query query = em.createQuery("SELECT r FROM Raca r WHERE "
                    + "r.idespecie.idespecie"
                    + " = :idEspecie").setParameter("idEspecie", codigoEspecie);

            listaRaca = query.getResultList();
            if (listaRaca != null) {
                nomeComboBox.removeAllItems();
                for (Raca raca : listaRaca) {
                    nomeComboBox.addItem(raca.getNomeraca());
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Método para retorno de instância de Cliente.
     * @param CodigoCliente int - ID do Cliente.
     * @return Cliente - Retorno do Objeto Cliente.
     */
    public Cliente getInstaciaCliente(int CodigoCliente) {
        Cliente cliente = new Cliente();
        try {
            cliente = em.find(Cliente.class, CodigoCliente);
        } catch (Exception e) {
            cliente = null;
            e.printStackTrace();
        }
        return cliente;
    }    
}
