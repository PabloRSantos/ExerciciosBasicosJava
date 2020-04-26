
package jogovini2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class SpaceInvanders extends JPanel implements Runnable {

    private Nave nave;
    
    public SpaceInvanders() throws IOException {
        nave = new Nave();
        Thread lacodojogo = new Thread(this);
        lacodojogo.start();
        
    }

    @Override
    public void run() {
        while (true){
            
        
        update();
        repaint();
        dorme();
        } 
        
    }
    private void update(){
    }
    int x = 0;
    @Override
    protected void paintComponent (Graphics g){
        super.paintComponent(g); //P LIGAR O ANTI ALIASIG
       
        
        g.setColor(Color.blue);
        g.fillRect(x++, 0, 50, 50);
        nave.pintar((Graphics2D) g);
    }
    
    private void dorme(){
        try {
            Thread.sleep(20);
        } catch (InterruptedException ex) {
            Logger.getLogger(SpaceInvanders.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    

   
    
    

