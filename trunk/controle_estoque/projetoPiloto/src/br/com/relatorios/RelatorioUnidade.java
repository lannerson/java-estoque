/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.relatorios;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;



public class RelatorioUnidade {


     public JasperPrint gerar() throws ExcRepositorio{
       JasperPrint rel = null;
       try {
         Connection con = gconexao.getConexao();
          HashMap map = new HashMap();
          String arquivoJasper = "produto.jasper";
          rel = JasperFillManager.fillReport(arquivoJasper, map, con);
       } catch (JRException e) {
          JOptionPane.showMessageDialog(null,e.getMessage());
       }
       return rel;
    }  
}
