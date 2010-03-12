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
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import sgps.classeMapeada.Animal;
import sgps.controle.AnimalControle;


public class AnimalVisao extends javax.swing.JInternalFrame {

    /** Construtor do formulário AnimalVisao */
    public AnimalVisao() {
        initComponents();
        jtblConsulta.getSelectionModel().addListSelectionListener(selecaoDaTabela);
        jtblConsulta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ConfigurarOpcoesMenu();
        ConfiguraFormulario("Manutenção de Animais");
        MensagemRodape.setMensagemRodape(1,jpRodape, mensagemPadrao);
        animalControle = new AnimalControle();
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
        jtMenu.setModel(null);
        root = new DefaultMutableTreeNode("Menu de Opções");
        consulta = new DefaultMutableTreeNode("Consulta");
        manutencao = new DefaultMutableTreeNode("Manutenção");
        arvoreOpcoesMenu = new MenusTreeModel(root);
        arvoreOpcoesMenu.adicionaNoRoot(consulta);
        arvoreOpcoesMenu.adicionaNoRoot(manutencao);
        arvoreOpcoesMenu.adicionaNo(root, new DefaultMutableTreeNode("Sair"));
        jtMenu.setModel(arvoreOpcoesMenu);
    }

    /**
     *  Método responsável por controla a linha selecionada da tabela
     */
    private ListSelectionListener selecaoDaTabela = new ListSelectionListener() {

        public void valueChanged(ListSelectionEvent e) {
            int linha = jtblConsulta.getSelectedRow();
            JOptionPane.showMessageDialog(null, linha);
        }
    };

    /**
     * Método que recebe o nome do painel a ser selecionado
     * @param nome String
     */
    private void mostrarTela(String nome) {
        CardLayout card = (CardLayout) jpFormulario.getLayout();
        card.show(jpFormulario, nome);
    }

    /**
     * Método que controla os botões que estão disponíveis para utilização.
     */
    private void BotoesPadrao() {
        MensagemRodape.setMensagemRodape(1,jpRodape, mensagemPadrao);
        jbNovo.setEnabled(false);
        jbAlterar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbSalvar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbImprimir.setEnabled(false);
        jbExportar.setEnabled(false);
        if (jtMenu.getLastSelectedPathComponent().toString().equalsIgnoreCase("manutenção")) {
            jbNovo.setEnabled(true);
        }
    }

    /**
     * Método responsável por desabilitar o Menu de Opções (Jtree)
     */
    private void DesabilitaMenu() {
        jtMenu.setEnabled(false);
    }

    /**
     * Método responsável por habilitar o Menu de Opções (Jtree)
     */
    private void HabilitaMenu() {
        jtMenu.setEnabled(true);
    }

    /**
     * Método que controla as ações a serem executadas na Inseção de um novo
     * registro
     */
    private void Novo() {
        DesabilitaMenu();
        jbNovo.setEnabled(false);
        jbCancelar.setEnabled(true);
        jbSalvar.setEnabled(true);
        MensagemRodape.setMensagemRodape(1,jpRodape, mensagemPadrao);
    }

    /**
     * Método que controla as ações a serem executadas no Cancelamento de
     * um registro
     */
    private void Cancelar() {
        HabilitaMenu();
        BotoesPadrao();
        MensagemRodape.setMensagemRodape(3,jpRodape, "Operação efetuada com Sucesso");
    }

    /**
     * Método que controla as ações a serem executadas na Gravação de um
     * registro
     */
    private void Salvar() {
        HabilitaMenu();
        BotoesPadrao();
        MensagemRodape.setMensagemRodape(3,jpRodape, "Operação efetuada com Sucesso");
    }

    /**
     * Método que controla as ações a serem executadas na Alteração de
     * registro
     */
    private void Alterar() {
    }

    /**
     * Método que controla as ações a serem executadas na Exclusão de um
     * registro
     */
    private void Excluir() {
        HabilitaMenu();
        BotoesPadrao();
    }

    /**
     * Método responsável por limpar os campos do formulário.
     */
    private void Limpar(){
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        jpRodape = new javax.swing.JPanel();
        jlTextoMsgFeedback = new javax.swing.JLabel();
        jpSecundário = new javax.swing.JPanel();
        jpFormulario = new javax.swing.JPanel();
        jpConsulta = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblConsulta = new javax.swing.JTable();
        jpPesquisaConsulta = new javax.swing.JPanel();
        jcomboColunas = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jftPesquisaDescriao = new javax.swing.JFormattedTextField();
        jbPesquisar = new javax.swing.JButton();
        jpManutencao = new javax.swing.JPanel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        pnMenu = new javax.swing.JPanel();
        jtBotoes = new javax.swing.JPanel();
        jbNovo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbImprimir = new javax.swing.JButton();
        jbExportar = new javax.swing.JButton();
        jtArvore = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMenu = new javax.swing.JTree();

        setClosable(true);
        setIconifiable(true);

        jpPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpPrincipal.setLayout(new java.awt.BorderLayout());

        jpRodape.setBackground(java.awt.Color.lightGray);
        jpRodape.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlTextoMsgFeedback.setFont(new java.awt.Font("Tahoma", 0, 12));
        jlTextoMsgFeedback.setText("Nenhuma mensagem gerada.");
        jlTextoMsgFeedback.setName("Mensagem"); // NOI18N
        jpRodape.add(jlTextoMsgFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 3, 580, -1));

        jpPrincipal.add(jpRodape, java.awt.BorderLayout.CENTER);

        jpSecundário.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jpFormulario.setBackground(new java.awt.Color(255, 255, 255));
        jpFormulario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        jpFormulario.setForeground(new java.awt.Color(255, 255, 255));
        jpFormulario.setLayout(new java.awt.CardLayout());

        jpConsulta.setBackground(new java.awt.Color(255, 255, 255));
        jpConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta de Dados"));
        jpConsulta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Título 1"
            }
        ));
        jScrollPane2.setViewportView(jtblConsulta);

        jpConsulta.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 110, 590, 200));

        jpPesquisaConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jpPesquisaConsulta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcomboColunas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Razão Social", "Nome Cliente" }));
        jpPesquisaConsulta.add(jcomboColunas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 11));
        jLabel2.setText("Informação a Pesquisar:");
        jpPesquisaConsulta.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 11));
        jLabel1.setText("Descriçao da Informação:");
        jpPesquisaConsulta.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 14, -1, -1));
        jLabel1.getAccessibleContext().setAccessibleName("");

        jpPesquisaConsulta.add(jftPesquisaDescriao, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 290, -1));

        jbPesquisar.setFont(new java.awt.Font("Tahoma", 0, 10));
        jbPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgps/imagens/Pesquisar.png"))); // NOI18N
        jbPesquisar.setText("Pesquisar");
        jbPesquisar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });
        jpPesquisaConsulta.add(jbPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 29, 95, -1));

        jpConsulta.add(jpPesquisaConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 30, 590, 70));

        jpFormulario.add(jpConsulta, "tela1");

        jpManutencao.setBackground(new java.awt.Color(255, 255, 255));
        jpManutencao.setBorder(javax.swing.BorderFactory.createTitledBorder(" Manutenção de Dados"));
        jpManutencao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpManutencao.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 110, -1));
        jpManutencao.add(jFormattedTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 120, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Raça 1", "Raça 2", " " }));
        jpManutencao.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 110, -1));
        jpManutencao.add(jFormattedTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 130, -1));

        jpFormulario.add(jpManutencao, "tela2");

        pnMenu.setBackground(new java.awt.Color(173, 216, 230));
        pnMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtBotoes.setBackground(new java.awt.Color(173, 216, 230));
        jtBotoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Controles ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jtBotoes.setFont(new java.awt.Font("Tahoma", 0, 11));
        jtBotoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbNovo.setFont(new java.awt.Font("Tahoma", 0, 10));
        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgps/imagens/Novo.png"))); // NOI18N
        jbNovo.setText("Novo");
        jbNovo.setEnabled(false);
        jbNovo.setFocusable(false);
        jbNovo.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbNovo.setName("1"); // NOI18N
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });
        jtBotoes.add(jbNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 30, 95, -1));

        jbSalvar.setFont(new java.awt.Font("Tahoma", 0, 10));
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgps/imagens/Salvar.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.setEnabled(false);
        jbSalvar.setFocusable(false);
        jbSalvar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });
        jtBotoes.add(jbSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 90, 95, -1));

        jbCancelar.setFont(new java.awt.Font("Tahoma", 0, 10));
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgps/imagens/Cancelar.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.setFocusable(false);
        jbCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbCancelar.setName("1"); // NOI18N
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        jtBotoes.add(jbCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 120, 95, -1));

        jbExcluir.setFont(new java.awt.Font("Tahoma", 0, 10));
        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgps/imagens/Excluir.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.setEnabled(false);
        jbExcluir.setFocusable(false);
        jbExcluir.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jtBotoes.add(jbExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 150, 95, -1));

        jbAlterar.setFont(new java.awt.Font("Tahoma", 0, 10));
        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgps/imagens/Alterar.png"))); // NOI18N
        jbAlterar.setText("Alterar");
        jbAlterar.setEnabled(false);
        jbAlterar.setFocusable(false);
        jbAlterar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jtBotoes.add(jbAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 60, 95, -1));

        jbImprimir.setFont(new java.awt.Font("Tahoma", 0, 10));
        jbImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgps/imagens/Imprimir.png"))); // NOI18N
        jbImprimir.setText("Imprimir");
        jbImprimir.setEnabled(false);
        jbImprimir.setFocusable(false);
        jbImprimir.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbImprimirActionPerformed(evt);
            }
        });
        jtBotoes.add(jbImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 180, 95, -1));

        jbExportar.setFont(new java.awt.Font("Tahoma", 0, 10));
        jbExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgps/imagens/exportar.png"))); // NOI18N
        jbExportar.setText("Exportar");
        jbExportar.setEnabled(false);
        jbExportar.setFocusable(false);
        jbExportar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jtBotoes.add(jbExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 210, 95, -1));

        pnMenu.add(jtBotoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 100, 130, 250));

        jtArvore.setBackground(new java.awt.Color(173, 216, 230));
        jtArvore.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        jtMenu.setBackground(new java.awt.Color(173, 216, 230));
        jtMenu.setFont(new java.awt.Font("Tahoma", 0, 11));
        jtMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                controlaEventosMenuArvore(evt);
            }
        });
        jScrollPane1.setViewportView(jtMenu);

        jtArvore.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 86));

        pnMenu.add(jtArvore, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 150, 90));

        javax.swing.GroupLayout jpSecundárioLayout = new javax.swing.GroupLayout(jpSecundário);
        jpSecundário.setLayout(jpSecundárioLayout);
        jpSecundárioLayout.setHorizontalGroup(
            jpSecundárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSecundárioLayout.createSequentialGroup()
                .addComponent(pnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jpFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpSecundárioLayout.setVerticalGroup(
            jpSecundárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jpFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jpPrincipal.add(jpSecundário, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        Novo();
        animal = animalControle.getInstanciaAnimal();
}//GEN-LAST:event_jbNovoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        Salvar();

}//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        Cancelar();
}//GEN-LAST:event_jbCancelarActionPerformed

    /**
     * Método que controla as opções selecionadas com o duplo clique do
     * mouse, no Menu de Opções
     * @param evt
     */
    private void controlaEventosMenuArvore(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlaEventosMenuArvore
        String selecionado;
        if ((jtMenu.getSelectionPath() != null) && (jtMenu.isEnabled()) ) {
            if (evt.getClickCount() == 2) {
                selecionado = jtMenu.getLastSelectedPathComponent().toString();
                if (selecionado.equals("Consulta")) {
                    HabilitaMenu();
                    BotoesPadrao();
                    mostrarTela("tela1");

                } else if (selecionado.equals("Manutenção")) {
                    BotoesPadrao();
                    jbNovo.setEnabled(true);
                    mostrarTela("tela2");
                } else if (selecionado.equals("Sair")) {
                    dispose();
                }
            }
        } else {
            // JOptionPane.showMessageDialog(null, "Quantidade de clicks " + evt.getClickCount());
        }

}//GEN-LAST:event_controlaEventosMenuArvore

    private void jbImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbImprimirActionPerformed
    }//GEN-LAST:event_jbImprimirActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
    }//GEN-LAST:event_jbPesquisarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbExportar;
    private javax.swing.JButton jbImprimir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox jcomboColunas;
    private javax.swing.JFormattedTextField jftPesquisaDescriao;
    private javax.swing.JLabel jlTextoMsgFeedback;
    private javax.swing.JPanel jpConsulta;
    private javax.swing.JPanel jpFormulario;
    private javax.swing.JPanel jpManutencao;
    private javax.swing.JPanel jpPesquisaConsulta;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpRodape;
    private javax.swing.JPanel jpSecundário;
    private javax.swing.JPanel jtArvore;
    private javax.swing.JPanel jtBotoes;
    private javax.swing.JTree jtMenu;
    private javax.swing.JTable jtblConsulta;
    private javax.swing.JPanel pnMenu;
    // End of variables declaration//GEN-END:variables

    /** Variáveis para manipulação do Menu de Opções (Jtree)   */
    private DefaultMutableTreeNode root, consulta, manutencao;
    private MenusTreeModel arvoreOpcoesMenu;
    String mensagemPadrao = "Nenhuma mensagem foi gerada.";
    Animal animal;
    AnimalControle animalControle;

}

