/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package relatorio;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import javax.swing.JOptionPane;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import utilitarios.conexao;


public class RelatorioCidades {


    public JasperPrint gerar() throws ExcRepositorio{
       conexao relatconect = new conexao();
		JasperPrint rel = null;
		try {
			Connection con = relatconect.conectaRelat();
			HashMap map = new HashMap();
			String arquivoJasper = "";
			rel = JasperFillManager.fillReport(arquivoJasper, map, con);
		} catch (JRException e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		return rel;
	}


}
