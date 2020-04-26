
package jogovini2;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;


public class Nave {
    
    BufferedImage desenho;
    
    public Nave() {
       try {
			desenho = ImageIO.read(new File("img/nave.png"));
		} catch (IOException e) {
			System.out.println("Não foi possível carregar a imagem da nave");
		}   
    }
    
    public void pintar (Graphics2D g){
        g.drawImage(desenho, 50, 50, 100, 100, 0, 0,desenho.getWidth() , desenho.getHeight(), null);
       
    }
    
}
