package sgps.tabelaModelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import sgps.classeMapeada.Cliente;

/**
 *
 * @author Daniel
 */

public class TabelaModeloNomeCliente extends AbstractTableModel {

    private List<Cliente> list;
    private Cliente cliente;
    private static final String[] columnNames = {"Codigo", "Nome do Cliente"};
    private static final Class[] columnClasses = {Integer.class, String.class};

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return list.size();
    }

    public Object getValueAt(int linha, int coluna) {
        cliente = list.get(linha);
        switch (coluna) {
            case 0:
                return cliente.getPessoa().getIdpessoa();
            case 1:
                return cliente.getPessoa().getNomepessoa();
            default:
                return "";
        }
    }

    public String getColumnName(int coluna) {
        return columnNames[coluna];
    }

    public Cliente getCliente(int linha) {
        cliente = list.get(linha);
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        list.add(cliente);
    }

    public void removeOpcao(int linha) {
        list.remove(linha);
    }

    public TabelaModeloNomeCliente(List<Cliente> list) {
        this.list = list;
    }

   public void limparDados() {
        list = new ArrayList<Cliente>();
    }


}
