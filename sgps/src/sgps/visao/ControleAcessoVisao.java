/**
 * Classe responsável por disponiblizar os campos/informações dos animais
 * a serem preechidas/visualizadas e manipulados pelo usuário
 * Criado em Criado em 15/02/2010
 * @author Daniel Vilas Boas
 *
 */
package sgps.visao;

import sgps.util.MensagemRodape;
import sgps.util.MenusTreeModel;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import sgps.classeMapeada.Animal;
import sgps.classeMapeada.Usuario;
import sgps.controle.AnimalControle;
import sgps.controle.UsuarioControle;
import sgps.tabelaModelo.TabelaModeloUsuario;


public class ControleAcessoVisao extends javax.swing.JInternalFrame {
    
    /** Construtor do formulário AnimalVisao */
    public ControleAcessoVisao() {
        initComponents();
       
        ConfigurarOpcoesMenu();
        ConfiguraFormulario("Manutenção de Animais");
        MensagemRodape.setMensagemRodape(1,jpRodape, mensagemPadrao);
        animalControle = new AnimalControle();

        //inicializa a jtable listando todos os usuários já cadastrados no sistema

        UsuarioControle usuarioControle = new UsuarioControle();
        Usuario us = usuarioControle.getInstanciaUsuario();
        EntityManager em= usuarioControle.getEntityManager();
        List<Usuario> lus = new ArrayList<Usuario>();
        lus = usuarioControle.findAll();
        TabelaModeloUsuario tabelaUsuario = new TabelaModeloUsuario(lus);
        jtbListaUsuarios.setModel(tabelaUsuario);
        
    }
    
    /**
     * Método responsável pela configuração do Formulário (tamanho, título e
     * centralização)
     * @param TituloForm Valor String
     */
    private void ConfiguraFormulario(String TituloForm) {
        // Seta ao título do fomulário
        this.setTitle(TituloForm);
        // Captura o tamanho do formulário
        Dimension tamnhoForm = this.getSize();
        // Captura a resolução da Tela
        Dimension screenSize = this.getToolkit().getScreenSize();
        // Centraliza o formulário na Tela
        this.setLocation((screenSize.width - tamnhoForm.width) / 2,
                (screenSize.height - tamnhoForm.height - 180) / 2);
    }
    
    /**
     * Método responsável por criar as opções do Menu de Opções (JTree)
     */
    private void ConfigurarOpcoesMenu() {
       root = new DefaultMutableTreeNode("Menu de Opções");
        consulta = new DefaultMutableTreeNode("Consulta");
        manutencao = new DefaultMutableTreeNode("Manutenção");
        arvoreOpcoesMenu = new MenusTreeModel(root);
        arvoreOpcoesMenu.adicionaNoRoot(consulta);
        arvoreOpcoesMenu.adicionaNoRoot(manutencao);
        arvoreOpcoesMenu.adicionaNo(root, new DefaultMutableTreeNode("Sair"));
        
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        jpRodape = new javax.swing.JPanel();
        jlTextoMsgFeedback = new javax.swing.JLabel();
        jpSecundário = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtbListaUsuarios = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Controle de Acesso");

        jpPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpPrincipal.setLayout(new java.awt.BorderLayout());

        jpRodape.setBackground(java.awt.Color.lightGray);
        jpRodape.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlTextoMsgFeedback.setFont(new java.awt.Font("Tahoma", 0, 12));
        jlTextoMsgFeedback.setText("Nenhuma mensagem gerada.");
        jlTextoMsgFeedback.setName("Mensagem"); // NOI18N
        jpRodape.add(jlTextoMsgFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 580, -1));

        jpPrincipal.add(jpRodape, java.awt.BorderLayout.CENTER);

        jpSecundário.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpSecundário.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTree1.setBackground(new java.awt.Color(173, 216, 230));
        jScrollPane2.setViewportView(jTree1);

        jpSecundário.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, 90, 394));

        jButton1.setText("Conceder");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpSecundário.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 345, -1, -1));

        jButton2.setText("Retirar");
        jpSecundário.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 345, -1, -1));

        jPanel1.setBackground(new java.awt.Color(173, 216, 230));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        jpSecundário.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 640, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cod. Usuário", "Usuário", "Tela "
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jpSecundário.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 211, 637, 100));

        jButton3.setText("Confirmar");
        jpSecundário.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 345, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setText("Níveis pré-definidos");
        jpSecundário.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Operacional", "Administrativo", "Gerencial", "Customizado" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jpSecundário.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 375, 120, -1));

        jtbListaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cod. Usuário", "Nome Usuário", "Login Usuário", "Senha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbListaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbListaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jtbListaUsuarios);

        jpSecundário.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 640, 100));

        jpPrincipal.add(jpSecundário, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*
         * NivelAcesso ne = new NivelAcesso();
    entityManager.persist(ne);
    int index = jTable1.getSelectedRow();
    ne.setCodFunc(funcionarioList.get(index).getCodFuncionario());
    ne.setNomeModulo(jTree1.getLastSelectedPathComponent().toString());
    nivelAcessoList.add(ne);
         */


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jComboBox1ActionPerformed

    private void jtbListaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbListaUsuariosMouseClicked

       
    }//GEN-LAST:event_jtbListaUsuariosMouseClicked
                
    /**
     * Método que controla as opções selecionadas com o duplo clique do
     * mouse, no Menu de Opções
     * @param evt
     */            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel jlTextoMsgFeedback;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpRodape;
    private javax.swing.JPanel jpSecundário;
    private javax.swing.JTable jtbListaUsuarios;
    // End of variables declaration//GEN-END:variables
    
    /** Variáveis para manipulação do Menu de Opções (Jtree)   */
    private DefaultMutableTreeNode root, consulta, manutencao;
    private MenusTreeModel arvoreOpcoesMenu;
    String mensagemPadrao = "Nenhuma mensagem foi gerada.";
    Animal animal;
    AnimalControle animalControle;
    
}

