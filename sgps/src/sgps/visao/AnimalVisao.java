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
import sgps.classeMapeada.Animal;
import sgps.classeMapeada.Cliente;
import sgps.classeMapeada.Especie;
import sgps.classeMapeada.Raca;
import sgps.conexao.Conexao;
import sgps.controle.AnimalControle;

public class AnimalVisao extends javax.swing.JInternalFrame {

    /** Construtor do formulário AnimalVisao. */
    public AnimalVisao() {
        initComponents();
        jtblConsulta.getSelectionModel().addListSelectionListener(selecaoDaTabela);
        jtblConsulta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ConfiguraFormulario("Cadastro de Animal");
        MensagemRodape.setMensagemRodape(1, jpRodape, mensagemPadrao);
        // Progresso p = new Progresso();
        // p.setVisible(true);
        animalControle = new AnimalControle();
        //  p.dispose();




        //animalControle.popularComboEspecie(jcbCorAnimal);


        jcbEspecieAnimal.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent e) {
                if (e.getSource() == jcbEspecieAnimal) {
                    animalControle.popularComboRaca(jcbRacaAnimal, animalControle.getIdEspecie(jcbEspecieAnimal.getSelectedIndex()));
                }
            }
        });


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
    /** Método responsável por controla a linha selecionada da tabela (Jtable)
     */
    private ListSelectionListener selecaoDaTabela = new ListSelectionListener() {

        public void valueChanged(ListSelectionEvent e) {
            int linha = jtblConsulta.getSelectedRow();
            JOptionPane.showMessageDialog(null, linha);
        }
    };

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
        jftCodigoAnimal = new javax.swing.JFormattedTextField();
        jftNomeCliente = new javax.swing.JFormattedTextField();
        jcbSexoAnimal = new javax.swing.JComboBox();
        jftPedigreeAnimal = new javax.swing.JFormattedTextField();
        jcbEspecieAnimal = new javax.swing.JComboBox();
        jftNomeAnimal = new javax.swing.JFormattedTextField();
        dfDataNascimento = new net.sf.nachocalendar.components.DateField();
        dfCadastro = new net.sf.nachocalendar.components.DateField();
        jcbRacaAnimal = new javax.swing.JComboBox();
        jftCodigoCliente = new javax.swing.JFormattedTextField();
        jcbPorteAnimal = new javax.swing.JComboBox();
        jftIdadeAnimal = new javax.swing.JFormattedTextField();
        jcbAnimalVivo = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaObservacaoAnimal = new javax.swing.JTextArea();
        jlCodigo = new javax.swing.JLabel();
        jlCodigo1 = new javax.swing.JLabel();
        jlCodigo2 = new javax.swing.JLabel();
        jlCodigo3 = new javax.swing.JLabel();
        jlCodigo4 = new javax.swing.JLabel();
        jlCodigo5 = new javax.swing.JLabel();
        jlCodigo6 = new javax.swing.JLabel();
        jlCodigo7 = new javax.swing.JLabel();
        jlCodigo8 = new javax.swing.JLabel();
        jlCodigo9 = new javax.swing.JLabel();
        jlCodigo10 = new javax.swing.JLabel();
        jlCodigo11 = new javax.swing.JLabel();
        jlCodigo12 = new javax.swing.JLabel();
        jlCodigo13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlCodigo14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jftCorAnimal = new javax.swing.JFormattedTextField();
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

        jlTextoMsgFeedback.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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

        jButton1.setText("jButton1");
        jpConsulta.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        jpFormulario.add(jpConsulta, "tela1");

        jpManutencao.setBackground(new java.awt.Color(255, 255, 255));
        jpManutencao.setBorder(javax.swing.BorderFactory.createTitledBorder(" Manutenção de Animal"));
        jpManutencao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jftCodigoAnimal.setBackground(new java.awt.Color(240, 240, 240));
        jftCodigoAnimal.setEnabled(false);
        jpManutencao.add(jftCodigoAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 40, -1));
        jpManutencao.add(jftNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 290, -1));

        jcbSexoAnimal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Macho", "Fêmea" }));
        jpManutencao.add(jcbSexoAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, -1));
        jpManutencao.add(jftPedigreeAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 130, -1));

        jpManutencao.add(jcbEspecieAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 100, -1));
        jpManutencao.add(jftNomeAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 240, -1));
        jpManutencao.add(dfDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 80, 20));
        jpManutencao.add(dfCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 80, 20));

        jpManutencao.add(jcbRacaAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 170, -1));
        jpManutencao.add(jftCodigoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 70, -1));

        jcbPorteAnimal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pequeno", "Médio", "Grande" }));
        jcbPorteAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPorteAnimalActionPerformed(evt);
            }
        });
        jpManutencao.add(jcbPorteAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 110, -1));
        jpManutencao.add(jftIdadeAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 60, -1));

        jcbAnimalVivo.setBackground(new java.awt.Color(255, 255, 255));
        jcbAnimalVivo.setText("Animal Morto");
        jcbAnimalVivo.setActionCommand("Vivo");
        jpManutencao.add(jcbAnimalVivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jtaObservacaoAnimal.setColumns(20);
        jtaObservacaoAnimal.setRows(5);
        jScrollPane1.setViewportView(jtaObservacaoAnimal);

        jpManutencao.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 360, 140));

        jlCodigo.setFont(new java.awt.Font("Tahoma", 1, 11));
        jlCodigo.setText("Cadastro");
        jpManutencao.add(jlCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 84, -1, -1));

        jlCodigo1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jlCodigo1.setText("Código");
        jpManutencao.add(jlCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 34, -1, -1));

        jlCodigo2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jlCodigo2.setText("Espécie");
        jpManutencao.add(jlCodigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 34, -1, -1));

        jlCodigo3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jlCodigo3.setText("Nome do Animal");
        jpManutencao.add(jlCodigo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 34, -1, -1));

        jlCodigo4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jlCodigo4.setText("Cor");
        jpManutencao.add(jlCodigo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 134, -1, -1));

        jlCodigo5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jlCodigo5.setText("Sexo");
        jpManutencao.add(jlCodigo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 84, -1, -1));

        jlCodigo6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jlCodigo6.setText("Nascimento");
        jpManutencao.add(jlCodigo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 134, -1, -1));

        jlCodigo7.setFont(new java.awt.Font("Tahoma", 1, 11));
        jlCodigo7.setText("Cód. Cliente");
        jpManutencao.add(jlCodigo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 84, -1, -1));

        jlCodigo8.setFont(new java.awt.Font("Tahoma", 1, 11));
        jlCodigo8.setText("Nome do Cliente");
        jpManutencao.add(jlCodigo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 84, -1, -1));

        jlCodigo9.setFont(new java.awt.Font("Tahoma", 1, 11));
        jlCodigo9.setText("Raça");
        jpManutencao.add(jlCodigo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 34, -1, -1));

        jlCodigo10.setFont(new java.awt.Font("Tahoma", 1, 11));
        jlCodigo10.setText("Foto");
        jpManutencao.add(jlCodigo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 184, -1, -1));

        jlCodigo11.setFont(new java.awt.Font("Tahoma", 1, 11));
        jlCodigo11.setText("Porte");
        jpManutencao.add(jlCodigo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 134, -1, -1));

        jlCodigo12.setFont(new java.awt.Font("Tahoma", 1, 11));
        jlCodigo12.setText("Pedigree");
        jpManutencao.add(jlCodigo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 134, -1, -1));

        jlCodigo13.setFont(new java.awt.Font("Tahoma", 1, 11));
        jlCodigo13.setText("Idade");
        jpManutencao.add(jlCodigo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 134, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        jpManutencao.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 200, 70));

        jlCodigo14.setFont(new java.awt.Font("Tahoma", 1, 11));
        jlCodigo14.setText("Observação");
        jpManutencao.add(jlCodigo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 184, -1, -1));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jpManutencao.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        jButton3.setText("...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jpManutencao.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 99, 30, 24));
        jpManutencao.add(jftCorAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 160, -1));

        jpFormulario.add(jpManutencao, "tela2");

        pnMenu.setBackground(new java.awt.Color(173, 216, 230));
        pnMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpBotoes.setBackground(new java.awt.Color(173, 216, 230));
        jpBotoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Controles ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jpBotoes.setFont(new java.awt.Font("Tahoma", 0, 11));
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
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        ModoEdicao();
      //  animalControle = new AnimalControle();
        animalControle.atualizaListaEspecie();
        animalControle.popularComboEspecie(jcbEspecieAnimal);
        animalControle.popularComboRaca(jcbRacaAnimal, animalControle.getIdEspecie(jcbEspecieAnimal.getSelectedIndex()));
        animal = animalControle.getInstanciaAnimal();

}//GEN-LAST:event_jbNovoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed

        try {
            raca = animalControle.getInstaciaRaca(jcbRacaAnimal.getSelectedIndex());
            cliente = animalControle.getInstaciaCliente(1);
            animal.setNomeanimal(jftNomeAnimal.getText());
            animal.setSexoanimal(jcbSexoAnimal.getSelectedIndex());
            animal.setDatacadastroanimal(new java.sql.Date(formatoData.parse(dfCadastro.getFormattedTextField().getText()).getTime()));
            animal.setIdraca(raca);
            animal.setIdpessoaclienteanimal(cliente);
            animal.setDatanascimentoanimal(new java.sql.Date(formatoData.parse(dfDataNascimento.getFormattedTextField().getText()).getTime()));
            animal.setPorteanimal(jcbPorteAnimal.getSelectedIndex());
            animal.setCoranimal(jftCorAnimal.getText());
            animal.setPedigreeanimal(jftPedigreeAnimal.getText());
            animalControle.salvar(animal);
            animal.setObservacaoanimal(jtaObservacaoAnimal.getText());
            //animal.setStatusmortoanimal(jcbAnimalVivo.get);

            jftNomeCliente.setText(cliente.getPessoa().getNomepessoa());
            Salvar();
            MensagemRodape.setMensagemRodape(3, jpRodape, "Operação efetuada "
                    + "com Sucesso");
        } catch (Exception e) {
            e.printStackTrace();
            MensagemRodape.setMensagemRodape(2, jpRodape, "Não foi possível"
                    + " gravar o registro");
        }



}//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed

        ModoConsulta();
        Cancelar();
}//GEN-LAST:event_jbCancelarActionPerformed

    private void jbImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbImprimirActionPerformed
    }//GEN-LAST:event_jbImprimirActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed


        JOptionPane.showMessageDialog(null, animalControle.getIdEspecie(jcbEspecieAnimal.getSelectedIndex()));
        //animalControle.popularComboRaca(jcbRacaAnimal, jcbEspecieAnimal.getSelectedIndex()+1);


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jcbPorteAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPorteAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbPorteAnimalActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        BuscaPessoaVisao buscaPessoaVisao = new BuscaPessoaVisao(null, true);
        Cliente cli = new Cliente();
        //buscaPessoaVisao.setObjeto(Cliente.class, cliente);
        buscaPessoaVisao.setObjeto1(cli);
        buscaPessoaVisao.setVisible(true);
        JOptionPane.showMessageDialog(null, cli.getPessoa().getNomepessoa());
        jftCodigoCliente.setText(cli.getIdpessoacliente().toString());
        jftNomeCliente.setText(cli.getPessoa().getNomepessoa());


    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private net.sf.nachocalendar.components.DateField dfCadastro;
    private net.sf.nachocalendar.components.DateField dfDataNascimento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JCheckBox jcbAnimalVivo;
    private javax.swing.JComboBox jcbEspecieAnimal;
    private javax.swing.JComboBox jcbPorteAnimal;
    private javax.swing.JComboBox jcbRacaAnimal;
    private javax.swing.JComboBox jcbSexoAnimal;
    private javax.swing.JComboBox jcomboColunas;
    private javax.swing.JFormattedTextField jftCodigoAnimal;
    private javax.swing.JFormattedTextField jftCodigoCliente;
    private javax.swing.JFormattedTextField jftCorAnimal;
    private javax.swing.JFormattedTextField jftIdadeAnimal;
    private javax.swing.JFormattedTextField jftNomeAnimal;
    private javax.swing.JFormattedTextField jftNomeCliente;
    private javax.swing.JFormattedTextField jftPedigreeAnimal;
    private javax.swing.JFormattedTextField jftPesquisaDescriao;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlCodigo1;
    private javax.swing.JLabel jlCodigo10;
    private javax.swing.JLabel jlCodigo11;
    private javax.swing.JLabel jlCodigo12;
    private javax.swing.JLabel jlCodigo13;
    private javax.swing.JLabel jlCodigo14;
    private javax.swing.JLabel jlCodigo2;
    private javax.swing.JLabel jlCodigo3;
    private javax.swing.JLabel jlCodigo4;
    private javax.swing.JLabel jlCodigo5;
    private javax.swing.JLabel jlCodigo6;
    private javax.swing.JLabel jlCodigo7;
    private javax.swing.JLabel jlCodigo8;
    private javax.swing.JLabel jlCodigo9;
    private javax.swing.JLabel jlTextoMsgFeedback;
    private javax.swing.JPanel jpBotoes;
    private javax.swing.JPanel jpConsulta;
    private javax.swing.JPanel jpFormulario;
    private javax.swing.JPanel jpManutencao;
    private javax.swing.JPanel jpPesquisaConsulta;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpRodape;
    private javax.swing.JPanel jpSecundário;
    private javax.swing.JTextArea jtaObservacaoAnimal;
    private javax.swing.JTable jtblConsulta;
    private javax.swing.JPanel pnMenu;
    // End of variables declaration//GEN-END:variables
    String mensagemPadrao = "";
    Animal animal = null;
    Raca raca = null;
    Cliente cliente;
    AnimalControle animalControle;
    DateFormat formatoData = new SimpleDateFormat("dd/MM/yy");
}

