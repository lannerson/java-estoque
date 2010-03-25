package sgps.util;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JProgressBar;


public class Progresso extends JDialog {
    public Progresso() {
        this.setTitle("Aguarde...");
        this.setResizable(false);
       // this.setUndecorated(true); //retirar a barra
        setModal(true);
        JProgressBar progress = new JProgressBar();
        progress.setIndeterminate(true);
        progress.setSize(500,30);
        getContentPane().add(progress);
        pack();
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((tela.width - this.getSize().width) / 2,
             (tela.height - this.getSize().height) / 2);
    }
}