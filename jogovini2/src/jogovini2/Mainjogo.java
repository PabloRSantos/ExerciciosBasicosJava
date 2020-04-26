
package jogovini2;

import java.io.IOException;
import javax.swing.*;


public class Mainjogo {
   public static void main (String[]args) throws IOException{
    JFrame janela = new JFrame ();
    janela.setSize(1366, 768);
    janela.setVisible(true);
    janela.setLayout(null);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.setLocationRelativeTo(null);
    SpaceInvanders invasaoalienigena = new SpaceInvanders();
    invasaoalienigena.setBounds(0,0,1366,768);
    janela.add(invasaoalienigena);
    
   } 
}
