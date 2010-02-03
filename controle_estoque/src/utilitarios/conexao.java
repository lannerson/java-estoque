  /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utilitarios;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author martins
 */
public class conexao
{

    final private String driver ="com.mysql.jdbc.Driver";
    final private String url = "jdbc:mysql://127.0.0.1:3306/cidades";
    
    final private String usuario = "root";
    final private String senha = "martins";
    private Connection conexao;
    public Statement statement;
    public ResultSet resultset;

    
    public boolean conecta()
    {
        
        boolean result  = true;
         
        try
        {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
            //JOptionPane.showMessageDialog(null, "conectou!");
        }
        
        catch(ClassNotFoundException Driver)
        {
            JOptionPane.showMessageDialog(null, "driver não localizado!"+Driver);
            result = false;
        }
         catch(SQLException Fonte)
        {
            JOptionPane.showMessageDialog(null, " deu erro na conexao "+"com a fonte de dados"+Fonte);
            result = false;
        }
        return result;
    }
    
    public void desconecta()
    {
       boolean result = true;
        try
        {
            conexao.close();
            JOptionPane.showMessageDialog(null, "banco fechado");
        }
        
        catch(SQLException erroSQL)
        {
         
            JOptionPane.showMessageDialog(null, "não foi possivel"+"fechar o banco de dados"+erroSQL.getMessage());
            result= false;
        }
    }
    
    
    public void executaSQL(String sql)
    {
        
        try
        {
            statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY); //cria declaração para escrever no banco
            resultset = statement.executeQuery(sql); // executa a consulta passando o comando sql como parametro
        }
        catch (SQLException sqlex)
        {
            JOptionPane.showMessageDialog(null, "não foi possivel"+"executar o comando sql"+sqlex+", o sql passado foi"+sql);
        }
    }
     
}
