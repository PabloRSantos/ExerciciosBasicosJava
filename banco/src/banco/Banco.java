
package banco;

import java.util.Scanner;

public class Banco {

    
    public static void main(String[] args) {
      ContaBanco c1 = new ContaBanco();
        
      Scanner sc = new Scanner (System.in);
        System.out.println("Seu nome");
        String dono = sc.next();
        c1.setDono(dono);
        System.out.println("Um numero para sua conta");
        double numconta = sc.nextDouble();
        c1.setNumconta(numconta);
        String tipo = "cc";
        c1.setTipo(tipo);
       /* c1.contanova(tipo);
       c1.setTipo (tipo);
*/
      
        System.out.println("Sua conta é " + tipo);
        c1.abrirConta();
        c1.saque(100);
        System.out.println("saldo " +c1.saldo + " status " + c1.status + " tipo " + c1.tipo + "Dono " + c1.dono + " num da conta " + c1.getNumconta());
        
        
        
                    
        
    }
        
        
        
            
        
    }
    
    

