package cadastro;
import utilitarios.conexao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


    public class cad_cidade extends javax.swing.JFrame {
    conexao con_cidade;
    int navega = 0;
    int pesquisa_combo = 0;
    String ordenacao = "nome";
        public cad_cidade() {
        initComponents();
        con_cidade= new conexao();
        con_cidade.conecta();

        con_cidade.executaSQL("select * from cidade order by "+ordenacao);
        
        try
     {
         while (con_cidade.resultset.next())
             jcb_pesquisar.addItem(con_cidade.resultset.getString("nome"));
         
          con_cidade.resultset.first();
           mostraDados();
          
      }
          
        catch(SQLException erro)
        {

            JOptionPane.showMessageDialog(null,"Erro ao tenta visualizar o registro!"+erro);
        }
        preencher_jtable(); //preenche o jtable
       
    }
         
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoOrdenacao = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cb_uf = new javax.swing.JComboBox();
        tf_codigo = new javax.swing.JTextField();
        tf_nome = new javax.swing.JTextField();
        botao_primeiro_registro = new javax.swing.JButton();
        botao_registro_anterior = new javax.swing.JButton();
        botao_registro_frente = new javax.swing.JButton();
        botao_ultimo_registro = new javax.swing.JButton();
        botao_gravar = new javax.swing.JButton();
        botao_incluir = new javax.swing.JButton();
        botao_excluir = new javax.swing.JButton();
        botao_alterar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tf_pesquisa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcb_pesquisar = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtb_cidades = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        radioButtonCodigo = new javax.swing.JRadioButton();
        radioButtonNome = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO DE CIDADES");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setText("Nome.:");

        jLabel3.setText("Codigo.:");

        jLabel5.setText("UF.:");

        cb_uf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AM", "AP", "BA", "CE", "ES", "GO", "MA", "RJ", "RS", "MG", "SP", "ES", "MS", "MT", "PE", "PI", "PA", "PB", "PR", "RR", "RO", "RN", "RS", "SC", "SE", "SP", "TO" }));
        cb_uf.setToolTipText("selecione a unidade federativa(estado)");

        tf_codigo.setToolTipText("digite  o codigo da cidade");
        tf_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_codigoActionPerformed(evt);
            }
        });

        tf_nome.setToolTipText("digite o nome da cidade");
        tf_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nomeActionPerformed(evt);
            }
        });

        botao_primeiro_registro.setText("<<");
        botao_primeiro_registro.setToolTipText("volta para o primeiro registro");
        botao_primeiro_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_primeiro_registroActionPerformed(evt);
            }
        });

        botao_registro_anterior.setText("<");
        botao_registro_anterior.setToolTipText("volta um registro");
        botao_registro_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_registro_anteriorActionPerformed(evt);
            }
        });

        botao_registro_frente.setText(">");
        botao_registro_frente.setToolTipText("vai para o proximo registro");
        botao_registro_frente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_registro_frenteActionPerformed(evt);
            }
        });

        botao_ultimo_registro.setText(">>");
        botao_ultimo_registro.setToolTipText("vai para o ultimo registro");
        botao_ultimo_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_ultimo_registroActionPerformed(evt);
            }
        });

        botao_gravar.setText("Gravar");
        botao_gravar.setToolTipText("grava o registro");
        botao_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_gravarActionPerformed(evt);
            }
        });

        botao_incluir.setText("Incluir");
        botao_incluir.setToolTipText("inclui um registro");
        botao_incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_incluirActionPerformed(evt);
            }
        });

        botao_excluir.setText("Excluir");
        botao_excluir.setToolTipText("exclui um registro");
        botao_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_excluirActionPerformed(evt);
            }
        });

        botao_alterar.setText("Alterar");
        botao_alterar.setToolTipText("altera um registro");
        botao_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_alterarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        tf_pesquisa.setToolTipText("digite o nome da cidade para pesquisar");
        tf_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pesquisaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setText("Pesquisar.:");

        jcb_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_pesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jcb_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(367, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jtb_cidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CODIGO", "NOME", "UF"
            }
        ));
        jtb_cidades.setName(""); // NOI18N
        jScrollPane2.setViewportView(jtb_cidades);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setText("Ordenacao");

        grupoOrdenacao.add(radioButtonCodigo);
        radioButtonCodigo.setText("Codigo");
        radioButtonCodigo.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        radioButtonCodigo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        radioButtonCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonCodigoActionPerformed(evt);
            }
        });

        grupoOrdenacao.add(radioButtonNome);
        radioButtonNome.setSelected(true);
        radioButtonNome.setText("Nome");
        radioButtonNome.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        radioButtonNome.setMargin(new java.awt.Insets(0, 0, 0, 0));
        radioButtonNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(radioButtonCodigo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(radioButtonNome)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioButtonCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioButtonNome)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 51, 255));

        jLabel6.setBackground(new java.awt.Color(0, 51, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CADASTRO DE CIDADES");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(17, 17, 17)
                                .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(23, 23, 23)
                                .addComponent(tf_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botao_gravar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao_incluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao_excluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao_alterar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botao_primeiro_registro)
                                        .addGap(17, 17, 17)
                                        .addComponent(botao_registro_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botao_registro_frente, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botao_ultimo_registro))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(37, 37, 37)
                                        .addComponent(cb_uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(63, 63, 63)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cb_uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao_primeiro_registro)
                            .addComponent(botao_registro_frente)
                            .addComponent(botao_registro_anterior)
                            .addComponent(botao_ultimo_registro))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao_gravar)
                            .addComponent(botao_incluir)
                            .addComponent(botao_excluir)
                            .addComponent(botao_alterar)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   private void radioButtonNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonNomeActionPerformed
   ordem_visualizacao("nome");
   }//GEN-LAST:event_radioButtonNomeActionPerformed

   private void radioButtonCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonCodigoActionPerformed
    ordem_visualizacao("codigo");
   }//GEN-LAST:event_radioButtonCodigoActionPerformed

    private void jcb_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_pesquisarActionPerformed
 
    if(pesquisa_combo == 1 )
    {    
        try 
     {
         
          con_cidade.resultset.first();
          String igual = "n";
          while(igual == "n")
          {
             
              
                if (con_cidade.resultset.getString("nome").equals(jcb_pesquisar.getSelectedItem()))
                {
                  igual = "s";
                }
                else 
                    con_cidade.resultset.next();
          }
           tf_codigo.setText(con_cidade.resultset.getString("codigo"));
           mostraDados();
           
          
      }
          
        catch(SQLException erro)
        {

            //JOptionPane.showMessageDialog(null,"Erro ao tentar pesquisar via combo box!"+erro);
        }
    }
    else
        pesquisa_combo = 1;
        
    }//GEN-LAST:event_jcb_pesquisarActionPerformed

    private void botao_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_alterarActionPerformed
 try
     {
          String sql = "UPDATE cidade SET nome = '"+tf_nome.getText()+"',"+
                       "uf = '"+cb_uf.getSelectedItem()+"' where codigo = "+tf_codigo.getText();
          con_cidade.statement.executeUpdate(sql);
          JOptionPane.showMessageDialog(null, "Altera�AO realizada com sucesso!");
     
          //atualiza tela
          con_cidade.executaSQL("Select * from cidade order by "+ordenacao);
          atualizaComboBox();
          con_cidade.resultset.first();
           mostraDados();
          ordem_visualizacao("codigo");
      }
          
        catch(SQLException erro)
        {

            JOptionPane.showMessageDialog(null,"Erro ao tenta alterar o registro!"+erro);
        }

    }//GEN-LAST:event_botao_alterarActionPerformed

    private void botao_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_excluirActionPerformed
    
        
      try
        {
          String sql = "select * from cidade where codigo = "+tf_codigo.getText();
          con_cidade.executaSQL(sql);
          con_cidade.resultset.first();
          String nome = "Deletar a Cidade: "+con_cidade.resultset.getString("nome")+" ?";
          int opcao_escolhida = JOptionPane.showConfirmDialog(null,nome,"Exclusao ", JOptionPane.YES_NO_OPTION);
          if(opcao_escolhida==JOptionPane.YES_OPTION)
          {
            sql = "DELETE FROM cidade where codigo = "+tf_codigo.getText();
            int conseguiu_excluir = con_cidade.statement.executeUpdate(sql);
            if (conseguiu_excluir == 1)
            {
                JOptionPane.showMessageDialog(null,"ExclusAO realizada com sucesso");
                con_cidade.executaSQL("Select * from cidade order by "+ordenacao);
                atualizaComboBox();
                con_cidade.resultset.first();
                mostraDados();
                ordem_visualizacao("codigo");
            }
            
          }
          else 
             return;
          
      }
          
       
      
      
        catch(SQLException erro)
        {

            JOptionPane.showMessageDialog(null,"Erro ao tenta excluir o registro!"+erro);
        }

        
        
    }//GEN-LAST:event_botao_excluirActionPerformed
    
    private void botao_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_gravarActionPerformed
    
      try
        {
          
             String sqlinsert = "insert into cidade (nome, uf) values ('"+tf_nome.getText()+"','"+cb_uf.getSelectedItem()+ "')";
             con_cidade.statement.executeUpdate(sqlinsert);
             JOptionPane.showMessageDialog(null,"GRAVA�AO REALIZADA COM SUCESSO!");
             con_cidade.executaSQL("select * from cidade");
             atualizaComboBox();
             con_cidade.resultset.last();
             mostraDados();
             ordem_visualizacao("codigo");
        }
        catch(SQLException erro)
        {

            JOptionPane.showMessageDialog(null,"dados ja se encontram no ultimo registro"+erro);
        }
                  
    }//GEN-LAST:event_botao_gravarActionPerformed

    private void botao_incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_incluirActionPerformed
      tf_nome.setText("");
      tf_codigo.setText("");
      cb_uf.setSelectedItem("go");
      tf_nome.requestFocus();
      tf_codigo.setEditable(false);
    }//GEN-LAST:event_botao_incluirActionPerformed

    private void botao_ultimo_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_ultimo_registroActionPerformed
    try
        {
          con_cidade.resultset.last();
          mostraDados();
        }
        catch(SQLException erro)
        {

            JOptionPane.showMessageDialog(null,"dados ja se encontram no ultimo registro"+erro);
        }
    }//GEN-LAST:event_botao_ultimo_registroActionPerformed

    private void botao_registro_frenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_registro_frenteActionPerformed
    try
        {
          con_cidade.resultset.next();
          mostraDados();
          navega = 1;
        }
        catch(SQLException erro)
        {

            JOptionPane.showMessageDialog(null,"registro nao encontrado"+erro);
        }
    
    }//GEN-LAST:event_botao_registro_frenteActionPerformed

    private void botao_registro_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_registro_anteriorActionPerformed
     try
        {
          con_cidade.resultset.previous();
          mostraDados();
           navega = 0;
        }
        catch(SQLException erro)
        {

            JOptionPane.showMessageDialog(null,"registro nao encontrado"+erro);
        }
    }//GEN-LAST:event_botao_registro_anteriorActionPerformed

    private void botao_primeiro_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_primeiro_registroActionPerformed
    
     try
        {
          con_cidade.resultset.first();
          mostraDados();
          
        }
        catch(SQLException erro)
        {

            JOptionPane.showMessageDialog(null,"dados ja se encontram no primeiro registro"+erro);
        }
     
    }//GEN-LAST:event_botao_primeiro_registroActionPerformed

    private void tf_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_codigoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tf_codigoActionPerformed

    private void tf_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nomeActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tf_nomeActionPerformed

    private void tf_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pesquisaActionPerformed
             try
     {
         
          con_cidade.resultset.first();
          String igual = "n";
          int tamanho_pesquisa = tf_pesquisa.getText().length();
          while(igual == "n")
          {
              String pesquisado = con_cidade.resultset.getString("nome").substring(0, (tamanho_pesquisa));
              
                if (pesquisado.equals(tf_pesquisa.getText()))
                {
                  igual = "s";
                }
                else 
                    con_cidade.resultset.next();
          }
           tf_codigo.setText(con_cidade.resultset.getString("codigo"));
           mostraDados();
          jcb_pesquisar.setSelectedItem(tf_nome.getText());
          con_cidade.executaSQL("select * from cidade where nome like '"+tf_pesquisa.getText()+"%' order by "+ordenacao);
          preencher_jtable(); 
      }
          
        catch(SQLException erro)
        {

            JOptionPane.showMessageDialog(null,"Erro ao tentar pesquisar via digita�AO!"+erro);
        }
    }//GEN-LAST:event_tf_pesquisaActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cad_cidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_alterar;
    private javax.swing.JButton botao_excluir;
    private javax.swing.JButton botao_gravar;
    private javax.swing.JButton botao_incluir;
    private javax.swing.JButton botao_primeiro_registro;
    private javax.swing.JButton botao_registro_anterior;
    private javax.swing.JButton botao_registro_frente;
    private javax.swing.JButton botao_ultimo_registro;
    private javax.swing.JComboBox cb_uf;
    private javax.swing.ButtonGroup grupoOrdenacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox jcb_pesquisar;
    private javax.swing.JTable jtb_cidades;
    private javax.swing.JRadioButton radioButtonCodigo;
    private javax.swing.JRadioButton radioButtonNome;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_pesquisa;
    // End of variables declaration//GEN-END:variables

    
    public void mostraDados()
    {
        try
        {
            tf_codigo.setText(con_cidade.resultset.getString("codigo"));
            tf_nome.setText(con_cidade.resultset.getString("nome"));
            cb_uf.setSelectedItem(con_cidade.resultset.getString("uf"));
        }
        catch(SQLException erro)
        {
            if(navega==1)
            JOptionPane.showMessageDialog(null,"voce ja esta nu ultimo registro");
               else 
                  if(navega==0)
                  JOptionPane.showMessageDialog(null,"voce ja esta nu primeiro registro");
                   else
                   JOptionPane.showMessageDialog(null,"dados nAO localizados"+erro);
        }
        
        
    }
    
    public void atualizaComboBox(){
    
      try
     {
        jcb_pesquisar.removeAllItems();
        con_cidade.executaSQL("Select * from cidade order by "+ordenacao);
         while (con_cidade.resultset.next())
             jcb_pesquisar.addItem(con_cidade.resultset.getString("nome"));
         
          
      }
          
        catch(SQLException erro)
        {

            JOptionPane.showMessageDialog(null,"Erro ao atualizar o combobox de pesquisa!"+erro);
        }

        
    
    }
    
    public void preencher_jtable()
    {
        jtb_cidades.getColumnModel().getColumn(0).setPreferredWidth(20);
        jtb_cidades.getColumnModel().getColumn(1).setPreferredWidth(150);
        jtb_cidades.getColumnModel().getColumn(2).setPreferredWidth(20);
        
        DefaultTableModel modelo = (DefaultTableModel)jtb_cidades.getModel();
        modelo.setNumRows(0);
        
        try
        {
            while (con_cidade.resultset.next())
                modelo.addRow(new Object[]{con_cidade.resultset.getString("codigo"), con_cidade.resultset.getString("nome"), con_cidade.resultset.getString("uf")});
                con_cidade.resultset.first();
        }
        
        catch(SQLException erro)
        {

            JOptionPane.showMessageDialog(null,"Erro ao listar no jtable!"+erro);
        }
    }
    
    public void ordem_visualizacao(String ordem)
    {
        ordenacao = ordem;
        con_cidade.executaSQL("select * from cidade order by "+ordenacao);
        preencher_jtable();
        //atualizaComboBox();
        
        try 
        {
            con_cidade.resultset.first();
        }
        catch (SQLException erro) { 
            JOptionPane.showMessageDialog(null,"Erro na ordena�AO dos dados"+erro);
        }
        
        mostraDados();
    }
}
    
