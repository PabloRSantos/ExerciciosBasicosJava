
package teste ;

import java.util.logging.Level;
import java.util.logging.Logger;


public class mthread extends Thread {
    String nome;
    int numero;

    public mthread(String nome, int numero) {
        this.nome = nome;
       this.numero = numero;
    }
    
    @Override
    public void run(){
      for (int i= 0;i<5;i++){
          try {
              this.sleep(this.numero);
          } catch (InterruptedException ex) {
              Logger.getLogger(mthread.class.getName()).log(Level.SEVERE, null, ex);
          }
          System.out.println(this.nome + "num " + (i+1));
      }  
    }
    public static void sleep(){
        
    }
}
