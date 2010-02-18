/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.relatorios;
 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.SQLException;
 
/**
 *
 * @author martins
 */
public class gconexao {


    private static Connection con;
    public static Connection getConexao() throws ExcRepositorio {
      String driver = "com.mysql.jdbc.Driver";;
      String url = "jdbc:mysql://127.0.0.1:3306/SISCOMJAVA";
       String login = "root";
      String senha = "martins";
       try {
          Class.forName(driver);
          con = DriverManager.getConnection(url, login, senha);
       } catch (ClassNotFoundException e) {
          throw new ExcRepositorio("Driver não encontrado: " + e.getMessage());
       } catch (SQLException e) {
          throw new ExcRepositorio("Erro abrindo conexão: " + e.getMessage());
       }
       return con;
    }
}
