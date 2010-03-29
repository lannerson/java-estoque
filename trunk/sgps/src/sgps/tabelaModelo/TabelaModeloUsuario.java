package sgps.tabelaModelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import sgps.classeMapeada.Usuario;

/**
 *
 * @author Daniel
 */

public class TabelaModeloUsuario extends AbstractTableModel {
    
    private List<Usuario> list;
    private Usuario Usuario;
    private static final String[] columnNames = {"Codigo", "Nome do Usuario", "Login", "Senha"};
    private static final Class[] columnClasses = {Integer.class, String.class};
    
    public int getColumnCount() {
        return columnNames.length;
    }
    
    public int getRowCount() {
        return list.size();
    }
    
    public Object getValueAt(int linha, int coluna) {
        Usuario = list.get(linha);
        switch (coluna) {
            case 0:
                return Usuario.getIdusuario();
            case 1:
                return Usuario.getNomeusuariocompleto();
            case 2:
                return Usuario.getNomeusuario();
            case 3:
                return Usuario.getSenhausuario();
            default:
                return "";
        }
    }
    
    public String getColumnName(int coluna) {
        return columnNames[coluna];
    }
    
    public Usuario getUsuario(int linha) {
        Usuario = list.get(linha);
        return Usuario;
    }
    
    
    public void setUsuario(Usuario Usuario) {
        list.add(Usuario);
    }
    
    public void removeOpcao(int linha) {
        list.remove(linha);
    }
    
    public TabelaModeloUsuario(List<Usuario> list) {
        this.list = list;
    }
    
    public void limparDados() {
        list = new ArrayList<Usuario>();
    }
    
    
}
