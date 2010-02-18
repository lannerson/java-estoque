/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ModeloTabela;

import br.com.ClassesPersistentes.Produto;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Daniel
 */
public class ProdutoModeloTabela extends AbstractTableModel {

    private static final long serialVersionUID = 1L;
    //public final List<Produto> ListProduto = new ArrayList<Produto>();
    List ListProduto;

    public ProdutoModeloTabela(List lista) {
        ListProduto = lista;
    }

    public int getRowCount() {
        return ListProduto.size();
    }

    public int getColumnCount() {
        return 4;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto prod = (Produto) ListProduto.get(rowIndex);

        DecimalFormat df = new DecimalFormat("#,###.00");
        switch (columnIndex) {
            case 0:
                return prod.getCodProduto();
            case 1:
                return prod.getDescricaoProduto();
            case 2:
                return df.format(prod.getVlrVendaProduto());
            case 3:
                return prod.getCodUnidade().getDescricaoUnidade();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Código Cliente";
            case 1:
                return "Descriçã Produto";
            case 2:
                return "Valor Venda";
            case 3:
                return "Unidade Medida";
            default:
                return null;
        }

    }
}
