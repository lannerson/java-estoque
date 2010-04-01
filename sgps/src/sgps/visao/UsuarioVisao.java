/** Classe responsável por disponiblizar os campos/informações dos animais
 * a serem preechidas/visualizadas e manipulados pelo usuário.
 * Criado em Criado em 15/02/2010.
 * @author Daniel Vilas Boas
 */
package sgps.visao;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sgps.util.MensagemRodape;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import sgps.classeMapeada.Usuario;
import sgps.classeMapeada.Cliente;
import sgps.classeMapeada.Especie;
import sgps.classeMapeada.Raca;
import sgps.conexao.Conexao;
import sgps.controle.UsuarioControle;
import java.sql.Date;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.jdesktop.el.impl.lang.ELSupport;
import sgps.tabelaModelo.TabelaModeloUsuario;
public class UsuarioVisao extends javax.swing.JInternalFrame {
    
    /** Construtor do formulário UsuarioVisao. */
    public UsuarioVisao() {
        initComponents();
        ConfiguraFormulario("Cadastro de Usuario");
        MensagemRodape.setMensagemRodape(1, jpRodape, mensagemPadrao);
        UsuarioControle = new UsuarioControle();
    }
    
    /** Método responsável pela configuração do Formulário (tamanho, título e
     * centralização).
     * @param TituloForm String - Título do Formulário
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
   
    /** Método responsável por setar o painel a ser utilizado.
     * @param nome String - Nome do painel.
     */
    private void MostrarTela(String nome) {
        CardLayout card = (CardLayout) jpFormulario.getLayout();
        card.show(jpFormulario, nome);
    }
    
    /** Método responsável por disponibilizar os dados do formulário para edição.
     */
    private void ModoConsulta() {
        MensagemRodape.setMensagemRodape(1, jpRodape, mensagemPadrao);
        jbNovo.setEnabled(true);
        jbAlterar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbSalvar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbImprimir.setEnabled(false);
        jbExportar.setEnabled(false);
    }
    
    /** Método responsável por disponibilizar os dados somente para visualização.
     */
    private void ModoEdicao() {
        MensagemRodape.setMensagemRodape(1, jpRodape, mensagemPadrao);

        MostrarTela("tela2");
        Limpar();
        jbNovo.setEnabled(false);
        jbCancelar.setEnabled(true);
        jbSalvar.setEnabled(true);
        jbAlterar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbImprimir.setEnabled(false);
        jbExportar.setEnabled(false);
        
        String data = formatoData.format(calendar.getTime());
        tfDataCadastro.setText(data);
        tfDataCadastro.setEnabled(false);
        tfLogin.setEnabled(true);
        tfNomeComp.setEnabled(true);
        jpfSenha.setEnabled(true);
        jbSalvar.setEnabled(true);

    }
    
    /** Método que controla as ações, a serem executadas no Cancelamento de
     * um registro.
     */
    private void Cancelar() {
        MostrarTela("tela1");
        ModoConsulta();
        MensagemRodape.setMensagemRodape(1, jpRodape, "");
    }
    
    /** Método que controla as ações, a serem executadas na Gravação de um
     * registro.
     */
    private void Salvar() {
        MostrarTela("tela1");
        ModoConsulta();
    }
    
    /** Método que controla as ações, a serem executadas na Alteração de
     * registro.
     */
    private void Alterar() {
        MensagemRodape.setMensagemRodape(1, jpRodape, mensagemPadrao);
        jbNovo.setEnabled(true);
        jbCancelar.setEnabled(false);
        jbSalvar.setEnabled(false);
        jbAlterar.setEnabled(true);
        jbExcluir.setEnabled(true);
        jbImprimir.setEnabled(true);
        jbExportar.setEnabled(true);
        tfDataCadastro.setEnabled(true);
        tfLogin.setEnabled(true);
        tfNomeComp.setEnabled(true);
        jpfSenha.setEnabled(true);
        jbSalvar.setEnabled(true);

    }
    
    /**
     * Método que controla as ações, a serem executadas na Exclusão de um
     * registro.
     */
    private void Excluir() {
        ModoConsulta();
    }
    
    /**
     * Método responsável por limpar os campos do formulário.
     */
    private void Limpar() {
        tfDataCadastro.setText("");
        tfLogin.setText("");
        tfNomeComp.setText("");
        jpfSenha.setText("");
       
    }

    /**
     * Método responsável por desabilitar os campos.
     */
    
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
        jButton1 = new javax.swing.JButton();
        jpManutencao = new javax.swing.JPanel();
        jLNomeCompleto = new javax.swing.JLabel();
        jlDataCadastro = new javax.swing.JLabel();
        tfDataCadastro = new javax.swing.JFormattedTextField();
        jlUsuario = new javax.swing.JLabel();
        tfLogin = new javax.swing.JTextField();
        jlSenha = new javax.swing.JLabel();
        jpfSenha = new javax.swing.JPasswordField();
        tfNomeComp = new javax.swing.JTextField();
        pnMenu = new javax.swing.JPanel();
        jpBotoes = new javax.swing.JPanel();
        jbNovo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbImprimir = new javax.swing.JButton();
        jbExportar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);

        jpPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jpPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpPrincipal.setLayout(new java.awt.BorderLayout());

        jpRodape.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpRodape.setMinimumSize(new java.awt.Dimension(760, 14));
        jpRodape.setPreferredSize(new java.awt.Dimension(760, 10));
        jpRodape.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlTextoMsgFeedback.setFont(new java.awt.Font("Tahoma", 0, 12));
        jlTextoMsgFeedback.setName("Mensagem"); // NOI18N
        jpRodape.add(jlTextoMsgFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 750, 15));

        jpPrincipal.add(jpRodape, java.awt.BorderLayout.CENTER);

        jpSecundário.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        jpFormulario.setBackground(new java.awt.Color(255, 255, 255));
        jpFormulario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        jpFormulario.setForeground(new java.awt.Color(255, 255, 255));
        jpFormulario.setLayout(new java.awt.CardLayout());

        jpConsulta.setBackground(new java.awt.Color(255, 255, 255));
        jpConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta de Dados"));
        jpConsulta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblConsulta.setModel(new javax.swing.table.DefaultTableModel(
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
        jtblConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblConsultaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtblConsulta);

        jpConsulta.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 110, 590, 250));

        jpPesquisaConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jpPesquisaConsulta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcomboColunas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome Usuario" }));
        jpPesquisaConsulta.add(jcomboColunas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 11));
        jLabel2.setText("Informação a Pesquisar:");
        jpPesquisaConsulta.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 11));
        jLabel1.setText("Descriçao da Informação:");
        jpPesquisaConsulta.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 14, -1, -1));
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

        jButton1.setText("jButton1");
        jpConsulta.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        jpFormulario.add(jpConsulta, "tela1");

        jpManutencao.setBackground(new java.awt.Color(255, 255, 255));
        jpManutencao.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Usuário"));
        jpManutencao.setAlignmentX(1.0F);
        jpManutencao.setAlignmentY(20.0F);
        jpManutencao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLNomeCompleto.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLNomeCompleto.setText("Nome");
        jLNomeCompleto.setAlignmentX(1.0F);
        jLNomeCompleto.setAlignmentY(1100.0F);
        jpManutencao.add(jLNomeCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 80, -1, -1));

        jlDataCadastro.setFont(new java.awt.Font("Tahoma", 1, 11));
        jlDataCadastro.setText("Cadastro");
        jlDataCadastro.setAlignmentX(1.0F);
        jlDataCadastro.setAlignmentY(1100.0F);
        jpManutencao.add(jlDataCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 30, -1, -1));

        tfDataCadastro.setEnabled(false);
        tfDataCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDataCadastroActionPerformed(evt);
            }
        });
        jpManutencao.add(tfDataCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 50, 80, 20));

        jlUsuario.setFont(new java.awt.Font("Tahoma", 1, 11));
        jlUsuario.setText("Usuário:");
        jlUsuario.setAlignmentX(1.0F);
        jlUsuario.setAlignmentY(1100.0F);
        jpManutencao.add(jlUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        tfLogin.setEnabled(false);
        tfLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLoginActionPerformed(evt);
            }
        });
        jpManutencao.add(tfLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, 100, -1));

        jlSenha.setFont(new java.awt.Font("Tahoma", 1, 11));
        jlSenha.setText("Senha:");
        jlSenha.setAlignmentX(1.0F);
        jlSenha.setAlignmentY(1100.0F);
        jpManutencao.add(jlSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 210, -1, -1));

        jpfSenha.setEnabled(false);
        jpManutencao.add(jpfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 230, 100, -1));

        tfNomeComp.setEnabled(false);
        jpManutencao.add(tfNomeComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 100, 210, -1));

        jpFormulario.add(jpManutencao, "tela2");

        pnMenu.setBackground(new java.awt.Color(173, 216, 230));
        pnMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpBotoes.setBackground(new java.awt.Color(173, 216, 230));
        jpBotoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Controles ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jpBotoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbNovo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgps/imagens/Novo.png"))); // NOI18N
        jbNovo.setText("Novo");
        jbNovo.setFocusable(false);
        jbNovo.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbNovo.setName("1"); // NOI18N
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });
        jpBotoes.add(jbNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 30, 95, -1));

        jbSalvar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
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
        jpBotoes.add(jbSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 90, 95, -1));

        jbCancelar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
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
        jpBotoes.add(jbCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 120, 95, -1));

        jbExcluir.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgps/imagens/Excluir.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.setEnabled(false);
        jbExcluir.setFocusable(false);
        jbExcluir.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });
        jpBotoes.add(jbExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 150, 95, -1));

        jbAlterar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgps/imagens/Alterar.png"))); // NOI18N
        jbAlterar.setText("Alterar");
        jbAlterar.setEnabled(false);
        jbAlterar.setFocusable(false);
        jbAlterar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });
        jpBotoes.add(jbAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 60, 95, -1));

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
        jpBotoes.add(jbImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 180, 95, -1));

        jbExportar.setFont(new java.awt.Font("Tahoma", 0, 10));
        jbExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgps/imagens/exportar.png"))); // NOI18N
        jbExportar.setText("Exportar");
        jbExportar.setEnabled(false);
        jbExportar.setFocusable(false);
        jbExportar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jpBotoes.add(jbExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 210, 95, -1));

        pnMenu.add(jpBotoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 10, 130, 250));

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
            .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed

        ModoEdicao();
        
    }//GEN-LAST:event_jbNovoActionPerformed
    
    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
           /*
        if(Usuario.getIdusuario() == null)
            {
                JOptionPane.showMessageDialog(null, "vai incluir");
            try {
             Usuario = UsuarioControle.getInstanciaUsuario();
             Usuario.setNomeusuariocompleto(tfNomeComp.getText());
             Usuario.setNomeusuario(tfLogin.getText());
             Usuario.setSenhausuario(jpfSenha.getText());
             Usuario.setDatacadastrousuario(new java.sql.Date(formatoData.parse(tfDataCadastro.getText()).getTime()));
             UsuarioControle.salvar(Usuario);
             Salvar();
             Limpar();
             MensagemRodape.setMensagemRodape(3, jpRodape, "Operação efetuada "
                    + "com Sucesso");   
        } catch (Exception e) {
            e.printStackTrace();
            MensagemRodape.setMensagemRodape(2, jpRodape, "Não foi possível"
                    + " gravar o registro");
        }
            }
            else {
            *
            */
              //  JOptionPane.showMessageDialog(null, "vai alterar");
              
        //if (Usuario.getIdusuario()==null)
         if (!flagAlterar)
                  Usuario = UsuarioControle.getInstanciaUsuario();
             try {
            //

             Usuario.setNomeusuariocompleto(tfNomeComp.getText());
             Usuario.setNomeusuario(tfLogin.getText());
             Usuario.setSenhausuario(jpfSenha.getText());
             Usuario.setDatacadastrousuario(new java.sql.Date(formatoData.parse(tfDataCadastro.getText()).getTime()));
             UsuarioControle.alterar(Usuario);           
             JOptionPane.showMessageDialog(null, "ID"+Usuario.getIdusuario());
             Usuario = UsuarioControle.getInstanciaUsuario();
             Salvar();
             Limpar();
             MensagemRodape.setMensagemRodape(3, jpRodape, "Operação efetuada "
                    + "com Sucesso");   
            } catch (Exception e) {
            e.printStackTrace();
            MensagemRodape.setMensagemRodape(2, jpRodape, "Não foi possível"
                    + " alterar o registro");
        }
            
                

        
    }//GEN-LAST:event_jbSalvarActionPerformed
    
    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        
        ModoConsulta();
        Cancelar();
    }//GEN-LAST:event_jbCancelarActionPerformed
    
    private void jbImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbImprimirActionPerformed
    }//GEN-LAST:event_jbImprimirActionPerformed
            
    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        flagAlterar = true;
        jbCancelar.setEnabled(true);
        jbSalvar.setEnabled(true);
         jbSalvar.setEnabled(true);
         this.Usuario = lus.get(jtblConsulta.getSelectedRow());
         JOptionPane.showMessageDialog(null, "ID"+Usuario.getIdusuario());
         tfDataCadastro.setText(Usuario.getDatacadastrousuario().toString());
         tfLogin.setText(Usuario.getNomeusuario());
         tfNomeComp.setText(Usuario.getNomeusuariocompleto());
         jpfSenha.setText(Usuario.getSenhausuario());
         MostrarTela("tela2");
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void tfLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLoginActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfLoginActionPerformed

    private void tfDataCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDataCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDataCadastroActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed

        UsuarioControle usuarioControle = new UsuarioControle();
        Usuario us = usuarioControle.getInstanciaUsuario();
        EntityManager em= usuarioControle.getEntityManager();
        Query query;
        query = em.createNamedQuery("Usuario.findByNomeusuario");
        query.setParameter("nomeusuario", jftPesquisaDescriao.getText());
       
        List<Usuario> lus2 = new ArrayList<Usuario>();
        lus = query.getResultList();
        TabelaModeloUsuario tabelaUsuario = new TabelaModeloUsuario(lus);
        jtblConsulta.setModel(tabelaUsuario);
        jbAlterar.setEnabled(true);
        jbExcluir.setEnabled(false);
        
            
}//GEN-LAST:event_jbPesquisarActionPerformed

    private void jtblConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblConsultaMouseClicked

      Alterar();
      jbSalvar.setEnabled(false);
     
    }//GEN-LAST:event_jtblConsultaMouseClicked

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed

        try{

        this.Usuario = lus.get(jtblConsulta.getSelectedRow());
        
        int opcao_escolhida = JOptionPane.showConfirmDialog(null,"Deseja excluir o Usuário: "+Usuario.getNomeusuario(),"Exclusao ", JOptionPane.YES_NO_OPTION);
          if(opcao_escolhida==JOptionPane.YES_OPTION)
          {


            if ( UsuarioControle.excluir(Usuario.getIdusuario()))
            {
                //JOptionPane.showMessageDialog(null,"Usuário excluído com sucesso!");
                MensagemRodape.setMensagemRodape(3, jpRodape, "Operação efetuada "
                            + "com Sucesso");
                
            }

          }
          else
             return;

       }
       catch(Exception e)
       {
            e.printStackTrace();
             MensagemRodape.setMensagemRodape(2, jpRodape, "Não foi possível"
                    + " gravar o registro");
       }
                  
    }//GEN-LAST:event_jbExcluirActionPerformed
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLNomeCompleto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jlDataCadastro;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JLabel jlTextoMsgFeedback;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JPanel jpBotoes;
    private javax.swing.JPanel jpConsulta;
    private javax.swing.JPanel jpFormulario;
    private javax.swing.JPanel jpManutencao;
    private javax.swing.JPanel jpPesquisaConsulta;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpRodape;
    private javax.swing.JPanel jpSecundário;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTable jtblConsulta;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JFormattedTextField tfDataCadastro;
    private javax.swing.JTextField tfLogin;
    private javax.swing.JTextField tfNomeComp;
    // End of variables declaration//GEN-END:variables
    String mensagemPadrao = "";
    UsuarioControle UsuarioControle;
    Usuario Usuario = new Usuario(0);
    DateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
    GregorianCalendar calendar = new GregorianCalendar();
     List<Usuario> lus = new ArrayList<Usuario>();
     boolean flagAlterar = false;
}

