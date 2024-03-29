/** 
 * Essa classe é reponsável por gerenciar o acesso aos formulários/telas 
 * do sistema.  Sendo que o acesso somente é permitido ao usuários
 * devidamente cadastrados na tela selecionada.
 * 
 * Criado em Criado em 15/02/2010
 * @author Daniel Vilas Boas
 */
package sgps.visao;

import java.lang.String;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import sgps.classeMapeada.Acessousuario;
import sgps.classeMapeada.Telasistema;
import sgps.controle.AcessoControle;
import sgps.util.JDesktopPanePersonalizado;

import sgps.util.VerificaFrame;

public class MenuPrincipalVisao extends javax.swing.JFrame {

    /** Construtor do formulário  */
    public MenuPrincipalVisao() { 

        initComponents();
        desabilitaMenu();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jpFundoPrincipal = new javax.swing.JPanel();
        jpRodape = new javax.swing.JPanel();
        jlUsuarioLogado = new javax.swing.JLabel();
        jpAreaTrabalho = new javax.swing.JPanel();
        String caminhoImagem = "/sgps/imagens/Logo.png";
        String nomeImagem = "Logo.png";
        dpPrincipal = new JDesktopPanePersonalizado(caminhoImagem, nomeImagem);
        jpBarraBotoes = new javax.swing.JPanel();
        mbMenu = new javax.swing.JMenuBar();
        jmCadastro = new javax.swing.JMenu();
        miCadAnimal = new javax.swing.JMenuItem();
        miCadUsuario = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmMovimentacao = new javax.swing.JMenu();
        jmConsultas = new javax.swing.JMenu();
        jmRelatorio = new javax.swing.JMenu();
        jmAjuda = new javax.swing.JMenu();
        jmSistema = new javax.swing.JMenu();
        jmFinalizarSistema = new javax.swing.JMenuItem();
        jmConfroleAcessoUsuario = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE GESTÃO DE PET SHOP (SGPS)");
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        setName("rmPrincipal"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jpFundoPrincipal.setPreferredSize(new java.awt.Dimension(570, 500));
        jpFundoPrincipal.setLayout(new java.awt.BorderLayout());

        jpRodape.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpRodape.setPreferredSize(new java.awt.Dimension(542, 22));
        jpRodape.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlUsuarioLogado.setFont(new java.awt.Font("Times New Roman", 0, 11));
        jlUsuarioLogado.setText("Usuário logado: ");
        jpRodape.add(jlUsuarioLogado, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 4, 83, -1));

        jpFundoPrincipal.add(jpRodape, java.awt.BorderLayout.PAGE_END);

        jpAreaTrabalho.setBackground(new java.awt.Color(0, 255, 204));

        dpPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        dpPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jpAreaTrabalhoLayout = new javax.swing.GroupLayout(jpAreaTrabalho);
        jpAreaTrabalho.setLayout(jpAreaTrabalhoLayout);
        jpAreaTrabalhoLayout.setHorizontalGroup(
            jpAreaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );
        jpAreaTrabalhoLayout.setVerticalGroup(
            jpAreaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );

        jpFundoPrincipal.add(jpAreaTrabalho, java.awt.BorderLayout.CENTER);

        jpBarraBotoes.setBackground(new java.awt.Color(173, 216, 230));

        javax.swing.GroupLayout jpBarraBotoesLayout = new javax.swing.GroupLayout(jpBarraBotoes);
        jpBarraBotoes.setLayout(jpBarraBotoesLayout);
        jpBarraBotoesLayout.setHorizontalGroup(
            jpBarraBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );
        jpBarraBotoesLayout.setVerticalGroup(
            jpBarraBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        jpFundoPrincipal.add(jpBarraBotoes, java.awt.BorderLayout.PAGE_START);

        jmCadastro.setText("Cadastro");

        miCadAnimal.setText("Animal");
        miCadAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadAnimalActionPerformed(evt);
            }
        });
        jmCadastro.add(miCadAnimal);

        miCadUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        miCadUsuario.setText("Usuário do Sistema");
        miCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadUsuarioActionPerformed(evt);
            }
        });
        jmCadastro.add(miCadUsuario);

        jMenuItem1.setText("Fazer logoof");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmCadastro.add(jMenuItem1);

        mbMenu.add(jmCadastro);

        jmMovimentacao.setText("Movimentação");
        mbMenu.add(jmMovimentacao);

        jmConsultas.setText("Consulta");
        mbMenu.add(jmConsultas);

        jmRelatorio.setText("Relatorio");
        mbMenu.add(jmRelatorio);

        jmAjuda.setText("Ajuda");
        mbMenu.add(jmAjuda);

        jmSistema.setText("Sistema");

        jmFinalizarSistema.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jmFinalizarSistema.setText("Finalizar");
        jmFinalizarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFinalizarSistemaActionPerformed(evt);
            }
        });
        jmSistema.add(jmFinalizarSistema);

        jmConfroleAcessoUsuario.setText("Controle Acesso Usuário");
        jmConfroleAcessoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConfroleAcessoUsuarioActionPerformed(evt);
            }
        });
        jmSistema.add(jmConfroleAcessoUsuario);

        mbMenu.add(jmSistema);

        setJMenuBar(mbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFundoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFundoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-560)/2, (screenSize.height-402)/2, 560, 402);
    }// </editor-fold>//GEN-END:initComponents

    private void jmFinalizarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFinalizarSistemaActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jmFinalizarSistemaActionPerformed

    private void miCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadUsuarioActionPerformed

        try {
            if (VerificaFrame.verificaFrame(dpPrincipal, usuarioVisao) != true) {
                usuarioVisao = new UsuarioVisao();
                dpPrincipal.add(usuarioVisao);
            } else {
                usuarioVisao.setIcon(false);
            }
            usuarioVisao.setVisible(true);
        } catch (Exception ey) {
            ey.printStackTrace();
        }

    }//GEN-LAST:event_miCadUsuarioActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         dpPrincipal.add(new LoginVisao(this));   // TODO add your handling code here:

    }//GEN-LAST:event_formWindowOpened

    private void miCadAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadAnimalActionPerformed
        try {
            if (VerificaFrame.verificaFrame(dpPrincipal, animalVisao) != true) {
                animalVisao = new AnimalVisao();
                dpPrincipal.add(animalVisao);
            } else {
                animalVisao.setIcon(false);
            }
            animalVisao.setVisible(true);
        } catch (Exception ey) {
            ey.printStackTrace();
        }
    }//GEN-LAST:event_miCadAnimalActionPerformed

    private void jmConfroleAcessoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConfroleAcessoUsuarioActionPerformed
        try {
            if (VerificaFrame.verificaFrame(dpPrincipal, controleAcessoVisao) != true) {
                controleAcessoVisao = new ControleAcessoVisao();
                dpPrincipal.add(controleAcessoVisao);
            } else {
                controleAcessoVisao.setIcon(false);
            }
            controleAcessoVisao.setVisible(true);
        } catch (Exception ey) {
            ey.printStackTrace();
        }

    }//GEN-LAST:event_jmConfroleAcessoUsuarioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    desabilitaMenu();
    dpPrincipal.add(new LoginVisao(this));
    
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(final String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    //UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                    // UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                } catch (Exception e) {
                    e.printStackTrace();
                }
               
                new MenuPrincipalVisao().setVisible(true);
               
            }
        });
    }

     public void habilitaMenu() {
         jmAjuda.setEnabled(true);
         jmCadastro.setEnabled(true);
         jmConfroleAcessoUsuario.setEnabled(true);
         jmConsultas.setEnabled(true);
         jmFinalizarSistema.setEnabled(true);
         jmMovimentacao.setEnabled(true);
         jmRelatorio.setEnabled(true);
         jmSistema.setEnabled(true);
     }
     public void desabilitaMenu() {
         jmAjuda.setEnabled(false);
         jmCadastro.setEnabled(false);
         jmConfroleAcessoUsuario.setEnabled(false);
         jmConsultas.setEnabled(false);
         jmFinalizarSistema.setEnabled(false);
         jmMovimentacao.setEnabled(false);
         jmRelatorio.setEnabled(false);
         jmSistema.setEnabled(false);
     }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpPrincipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel jlUsuarioLogado;
    private javax.swing.JMenu jmAjuda;
    public javax.swing.JMenu jmCadastro;
    public javax.swing.JMenuItem jmConfroleAcessoUsuario;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenuItem jmFinalizarSistema;
    private javax.swing.JMenu jmMovimentacao;
    private javax.swing.JMenu jmRelatorio;
    private javax.swing.JMenu jmSistema;
    private javax.swing.JPanel jpAreaTrabalho;
    private javax.swing.JPanel jpBarraBotoes;
    private javax.swing.JPanel jpFundoPrincipal;
    private javax.swing.JPanel jpRodape;
    private javax.swing.JMenuBar mbMenu;
    public javax.swing.JMenuItem miCadAnimal;
    public javax.swing.JMenuItem miCadUsuario;
    // End of variables declaration//GEN-END:variables
    /**
     * Declarações de Variáveis do Sistema *
     */
    UsuarioVisao usuarioVisao;
    AnimalVisao animalVisao;
    LoginVisao login = new LoginVisao();
    ControleAcessoVisao controleAcessoVisao;
    
    

}
