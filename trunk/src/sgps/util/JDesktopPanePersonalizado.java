package sgps.util;

/**
 *
 * @author Daniel
 */
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.JDesktopPane;

public class JDesktopPanePersonalizado extends JDesktopPane {

    Image img;

    public JDesktopPanePersonalizado(String caminhoImagem, String nomeImagem) {
        try {                        
            URL caminho = new java.net.URL(getClass().getResource(caminhoImagem), nomeImagem);
            img = javax.imageio.ImageIO.read(caminho);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (img != null) {
            Dimension dimension = this.getSize();
            int x = (int) (dimension.getWidth() - img.getWidth(this)) / 2;
            int y = (int) (dimension.getHeight() - img.getHeight(this)) / 2;
            g.drawImage(img, x, y, img.getWidth(this), img.getHeight(this), this);            
        } else {
            g.drawString("Imagem não encontrada", 50, 50);
        }
    }
}
