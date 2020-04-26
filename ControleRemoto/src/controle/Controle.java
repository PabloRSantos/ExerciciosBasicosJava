
package controle;


public class Controle {

  
    public static void main(String[] args) {
       ControleR c1 = new ControleR ();
       c1.aumentarVolume();
       c1.maisCanal();
       c1.maisCanal();
       c1.menu();
       
       ControleR c2 = new ControleR();
       c2.maisCanal();
       c2.baixarVolume();
       
       c2.menu();
       
    }
    
}
