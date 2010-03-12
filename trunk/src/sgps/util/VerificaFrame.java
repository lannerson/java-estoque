/**
 * VerificaFrame.java
 * Classe responsável por verificar se um formulário do tipo JInternalFram
 * já foi aberto.
 * Criado em Criado em 15/02/2010
 * @author Daniel Vilas Boas
 */

package sgps.util;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;


/**
 * Esta é uma classe que irá verificar se existe frame no Desktop
 * 
 */

public abstract class VerificaFrame {

     /** Creates a new instance of VerificaFrame */
     public VerificaFrame() {
     }

     public static Boolean verificaFrame(JDesktopPane jDesktopPane,JInternalFrame frame) {         
         Boolean valor = false;
         JInternalFrame[] results;
         results = jDesktopPane.getAllFrames();
         for (int i = 0 ; i < results.length ; i++){
            if( results[i].equals(frame) ){
               valor = true;
               break;
            }
        }
     return valor;
    }

 }