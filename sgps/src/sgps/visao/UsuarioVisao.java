/** Classe responsável por disponiblizar os campos/informações dos animais
 * a serem preechidas/visualizadas e manipulados pelo usuário.
 * Criado em Criado em 15/02/2010.
 * @author Daniel Vilas Boas
 */
package sgps.visao;

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
public class UsuarioVisao extends javax.swing.JInternalFrame {
    
    /** Construtor do formulário UsuarioVisao. */
    public UsuarioVisao() {
        initComponents();
        
        ConfiguraFormulario("Cadastro de Usuario");
        MensagemRodape.setMensagemRodape(1, jpRodape, mensagemPadrao);
        // Progresso p = new Progresso();
        // p.setVisible(true);
        UsuarioControle = new UsuarioControle();
        //  p.dispose();
        
   
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
        jbNovo.setEnabled(false);
        jbCancelar.setEnabled(true);
        jbSalvar.setEnabled(true);
        jbAlterar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbImprimir.setEnabled(false);
        jbExportar.setEnabled(false);
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
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        jpRodape = new javax.swing.JPanel();
        jlTextoMsgFeedback = new javax.swing.JLabel();
        jpSecundário = new javax.swing.JPanel();
        jpFormulario = new javax.swing.JPanel();
        jpManutencao = new javax.swing.JPanel();
        jLNomeCompleto = new javax.swing.JLabel();
        tfNomeCompleto = new javax.swing.JTextField();
        jlDataCadastro = new javax.swing.JLabel();
        tfDataCadastro = new javax.swing.JFormattedTextField();
        jlDataDeExpiracaoSenha = new javax.swing.JLabel();
        tfDataExpiracaoSenha = new javax.swing.JFormattedTextField();
        jlUsuario = new javax.swing.JLabel();
        tfLogin = new javax.swing.JTextField();
        jlSenha = new javax.swing.JLabel();
        tfSenha = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jlDataCadastro1 = new javax.swing.JLabel();
        tfDataCadastro1 = new javax.swing.JFormattedTextField();
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

        jpManutencao.setBackground(new java.awt.Color(255, 255, 255));
        jpManutencao.setBorder(javax.swing.BorderFactory.createTitledBorder(" Manutenção de Animal"));
        jpManutencao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLNomeCompleto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLNomeCompleto.setText("Nome Completo:");
        jpManutencao.add(jLNomeCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        tfNomeCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeCompletoActionPerformed(evt);
            }
        });
        jpManutencao.add(tfNomeCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 290, -1));

        jlDataCadastro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlDataCadastro.setText("Data de Cadastro:");
        jpManutencao.add(jlDataCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        tfDataCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDataCadastroActionPerformed(evt);
            }
        });
        jpManutencao.add(tfDataCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 80, 20));

        jlDataDeExpiracaoSenha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlDataDeExpiracaoSenha.setText("Data de Expiração da Senha:");
        jpManutencao.add(jlDataDeExpiracaoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        tfDataExpiracaoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDataExpiracaoSenhaActionPerformed(evt);
            }
        });
        jpManutencao.add(tfDataExpiracaoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 80, -1));

        jlUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlUsuario.setText("Usuário:");
        jpManutencao.add(jlUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        tfLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLoginActionPerformed(evt);
            }
        });
        jpManutencao.add(tfLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 100, -1));

        jlSenha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlSenha.setText("Senha:");
        jpManutencao.add(jlSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        tfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSenhaActionPerformed(evt);
            }
        });
        jpManutencao.add(tfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 100, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Operacional", "Administrativo", "Gerencial", "Customizado" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jpManutencao.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 120, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Nível de Acesso:");
        jpManutencao.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jlDataCadastro1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlDataCadastro1.setText("Cod. Usuário:");
        jpManutencao.add(jlDataCadastro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        tfDataCadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDataCadastro1ActionPerformed(evt);
            }
        });
        jpManutencao.add(tfDataCadastro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 80, 20));

        jpFormulario.add(jpManutencao, "tela2");

        pnMenu.setBackground(new java.awt.Color(173, 216, 230));
        pnMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpBotoes.setBackground(new java.awt.Color(173, 216, 230));
        jpBotoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Controles ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jpBotoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbNovo.setFont(new java.awt.Font("Tahoma", 0, 10));
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
        jpBotoes.add(jbSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 90, 95, -1));

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
        jpBotoes.add(jbCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 120, 95, -1));

        jbExcluir.setFont(new java.awt.Font("Tahoma", 0, 10));
        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgps/imagens/Excluir.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.setEnabled(false);
        jbExcluir.setFocusable(false);
        jbExcluir.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jpBotoes.add(jbExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 150, 95, -1));

        jbAlterar.setFont(new java.awt.Font("Tahoma", 0, 10));
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
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        ModoEdicao();
        
    }//GEN-LAST:event_jbNovoActionPerformed
    
    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
     Usuario = UsuarioControle.getInstanciaUsuario();


      
        Usuario.setNomeusuariocompleto(tfNomeCompleto.getText());
        //usuario.setDatacadastrousuario(tfDataCadastro.getText());
        Usuario.setNomeusuario(tfLogin.getText());
        Usuario.setSenhausuario(tfSenha.getText());
        UsuarioControle.salvar(Usuario);
         /*
        usuarioControle.salvar(usuario);

 /*
        EntityManager em = usuarioControle.getEntityManager();
       Query query;
       query = em.createNamedQuery("Usuario.verificaLogin");
       query.setParameter("nomeusuario", tfLogin.getText());
       query.setParameter("senhausuario", tfSenha.getText());
        usuario = (Usuario) query.getSingleResult();
        Acessousuario  acesso1 = new Acessousuario(usuario.getIdusuario(), 1);
        Acessousuario  acesso2 = new Acessousuario(usuario.getIdusuario(), 2);
        //Acessousuario  acesso3 = new Acessousuario(usuario.getIdusuario(), 3);
        //Acessousuario  acesso4 = new Acessousuario(usuario.getIdusuario(), 4);


         // usuario.setDataexpirasenhausuario(tfDataExpiracaoSenha.get));
       //acesso a tela de controle de usuario - tela 1
        //acessoUsuario1 = contAcesso.getInstanciaAcessousuario();
         
        // List<Acessousuario> acessousuarioList = new ArrayList<Acessousuario>();
       // acessoUsuarioPK = contAcessoPk.getInstanciaAcessousuarioPK(usuario.getIdusuario(), 1);
//1- tela

        
        acesso1.setCodigotipoacesso(2);


   // tela 2

       
        acesso2.setCodigotipoacesso(2);


        

        //usuario.setAcessousuarioList(acessousuarioList);
       // usuarioControle.salvar(usuario);
List<Acessousuario> acessolist = new ArrayList<Acessousuario>();
acessolist.add(acesso1);
acessolist.add(acesso2);
usuario.setAcessousuarioList(acessolist);
//usuarioControle.salvar(usuario);


        try {
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();

        } catch (Exception e) {
            try {
                em.getTransaction().rollback();
            } catch (Exception ex1) {
                e.printStackTrace();
            }

        }


}                         
         */

    }//GEN-LAST:event_jbSalvarActionPerformed
    
    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        
        ModoConsulta();
        Cancelar();
    }//GEN-LAST:event_jbCancelarActionPerformed
    
    private void jbImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbImprimirActionPerformed
    }//GEN-LAST:event_jbImprimirActionPerformed
            
    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void tfNomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeCompletoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfNomeCompletoActionPerformed

    private void tfDataExpiracaoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDataExpiracaoSenhaActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfDataExpiracaoSenhaActionPerformed

    private void tfLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLoginActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfLoginActionPerformed

    private void tfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSenhaActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfSenhaActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jComboBox1ActionPerformed

    private void tfDataCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDataCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDataCadastroActionPerformed

    private void tfDataCadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDataCadastro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDataCadastro1ActionPerformed
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLNomeCompleto;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbExportar;
    private javax.swing.JButton jbImprimir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlDataCadastro;
    private javax.swing.JLabel jlDataCadastro1;
    private javax.swing.JLabel jlDataDeExpiracaoSenha;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JLabel jlTextoMsgFeedback;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JPanel jpBotoes;
    private javax.swing.JPanel jpFormulario;
    private javax.swing.JPanel jpManutencao;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpRodape;
    private javax.swing.JPanel jpSecundário;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JFormattedTextField tfDataCadastro;
    private javax.swing.JFormattedTextField tfDataCadastro1;
    private javax.swing.JFormattedTextField tfDataExpiracaoSenha;
    private javax.swing.JTextField tfLogin;
    private javax.swing.JTextField tfNomeCompleto;
    private javax.swing.JTextField tfSenha;
    // End of variables declaration//GEN-END:variables
    String mensagemPadrao = "";
    Usuario Usuario = null;
    UsuarioControle UsuarioControle;
    DateFormat formatoData = new SimpleDateFormat("dd/MM/yy");
}

