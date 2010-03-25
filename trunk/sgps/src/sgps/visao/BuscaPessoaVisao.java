/**
 *
 */
package sgps.visao;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import sgps.classeMapeada.Cliente;
import sgps.classeMapeada.Fornecedor;
import sgps.classeMapeada.Funcionario;
import sgps.conexao.Conexao;
import sgps.tabelaModelo.TabelaModeloNomeCliente;

/**
 *
 * @author Daniel
 */
public class BuscaPessoaVisao extends javax.swing.JDialog {

    private Cliente cliente;
    Funcionario funcionario;
    Fornecedor fornecedor;
    private String tipoPessoa = "";
    private List<Cliente> lista;

    /** Creates new form BuscaPessoaVisao */
    public BuscaPessoaVisao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ConfiguraFormulario();

    }

    public void setObjeto(Class classe, Object NomeObj) {

        if (classe.getSimpleName().equals("Cliente")) {
            // Seta ao título do fomulário
            this.cliente = (Cliente) NomeObj;
            this.setTitle("Consulta de Cliente");
        }

        if (classe.getSimpleName().equals("Funcionario")) {
            // Seta ao título do fomulário
            this.setTitle("Consulta de Funcionario");
        }

        if (classe.getSimpleName().equals("Fornecedor")) {
            // Seta ao título do fomulário
            this.setTitle("Consulta de Fornecedor");
        }
    }

    private void ConfiguraFormulario() {
        // Captura o tamanho do formulário
        Dimension tamnhoForm = this.getSize();
        // Captura a resolução da Tela
        Dimension screenSize = this.getToolkit().getScreenSize();
        // Centraliza o formulário na Tela
        this.setLocation((screenSize.width - tamnhoForm.width) / 2,
                (screenSize.height - tamnhoForm.height - 180) / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFundoPrincipal = new javax.swing.JPanel();
        jpDadosDaPesquisa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPessoas = new javax.swing.JTable();
        button1 = new java.awt.Button();
        jpDadosPesquisa = new javax.swing.JPanel();
        jftNomePessoa = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jbConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName(""); // NOI18N

        jpFundoPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpFundoPrincipal.setLayout(new java.awt.BorderLayout());

        jpDadosDaPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        jpDadosDaPesquisa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpDadosDaPesquisa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtPessoas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtPessoas);
        jtPessoas.getColumnModel().getColumn(0).setMinWidth(65);
        jtPessoas.getColumnModel().getColumn(0).setPreferredWidth(65);
        jtPessoas.getColumnModel().getColumn(0).setMaxWidth(65);
        jtPessoas.getColumnModel().getColumn(1).setResizable(false);

        jpDadosDaPesquisa.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 29, -1, 150));

        button1.setLabel("button1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jpDadosDaPesquisa.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jpFundoPrincipal.add(jpDadosDaPesquisa, java.awt.BorderLayout.CENTER);

        jpDadosPesquisa.setBackground(new java.awt.Color(173, 216, 230));
        jpDadosPesquisa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpDadosPesquisa.setPreferredSize(new java.awt.Dimension(374, 65));
        jpDadosPesquisa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpDadosPesquisa.add(jftNomePessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 320, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setText("Nome");
        jpDadosPesquisa.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, -1, -1));

        jbConsultar.setFont(new java.awt.Font("Tahoma", 0, 10));
        jbConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgps/imagens/Pesquisar.png"))); // NOI18N
        jbConsultar.setText("Consultar");
        jbConsultar.setFocusable(false);
        jbConsultar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarActionPerformed(evt);
            }
        });
        jpDadosPesquisa.add(jbConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 29, 95, -1));

        jpFundoPrincipal.add(jpDadosPesquisa, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFundoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFundoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed

        EntityManager em = Conexao.getEntityManager();
        lista = em.createNamedQuery("Cliente.findAll").getResultList();
        //JOptionPane.showMessageDialog(null, lista.size());
        TabelaModeloNomeCliente tabelaModeloNomeCliente = new TabelaModeloNomeCliente(lista);
        jtPessoas.setModel(tabelaModeloNomeCliente);

    }//GEN-LAST:event_jbConsultarActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed

        this.cliente1 = lista.get(jtPessoas.getSelectedRow());
        this.dispose();
    }//GEN-LAST:event_button1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                BuscaPessoaVisao dialog = new BuscaPessoaVisao(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JFormattedTextField jftNomePessoa;
    private javax.swing.JPanel jpDadosDaPesquisa;
    private javax.swing.JPanel jpDadosPesquisa;
    private javax.swing.JPanel jpFundoPrincipal;
    private javax.swing.JTable jtPessoas;
    // End of variables declaration//GEN-END:variables
    private Cliente cliente1;

    public void setObjeto1(Cliente cli) {
        this.cliente1 = cli;
    }
}
