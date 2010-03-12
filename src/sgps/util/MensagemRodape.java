/**
 * MensagemRodape.java
 * Classe responsável por exibir a mensagem e a cor do painel rodapé
 * Criado em Criado em 15/02/2010
 * @author Daniel Vilas Boas
 */
package sgps.util;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MensagemRodape {

    public static void setMensagemRodape(Integer TipoMensagem, JPanel jpRodape, String mensagem) {

        for (int i = 0; i < jpRodape.getComponentCount(); i++) {
            Component comp = jpRodape.getComponent(i);

            if (comp instanceof JLabel) {
                JLabel jl = (JLabel) comp;
                switch (TipoMensagem) {
                    case 1: { // Configuração padrão
                        jpRodape.setBackground(Color.lightGray);
                        if (jl.getName().equals("Titulo")) {
                            jl.setForeground(Color.black);
                        }
                        if (jl.getName().equals("Mensagem")) {
                            jl.setForeground(Color.black);
                            jl.setText(mensagem);
                        }
                        break;
                    }

                    case 2: { // Configuração de Erro
                        jpRodape.setBackground(Color.red);
                        if (jl.getName().equals("Titulo")) {
                            jl.setForeground(Color.white);
                        }
                        if (jl.getName().equals("Mensagem")) {
                            jl.setForeground(Color.white);
                            jl.setText(mensagem);
                        }
                        break;
                    }

                    case 3: { // Configuração de processad com sucesso
                        jpRodape.setBackground(Color.green);
                        if (jl.getName().equals("Titulo")) {
                            jl.setForeground(Color.black);
                        }
                        if (jl.getName().equals("Mensagem")) {
                            jl.setForeground(Color.black);
                            jl.setText(mensagem);
                        }
                        break;
                    }
                }// fim switch
            }// fim do Label
        }// fim do for
    } // fim do método
}
