
package ufc;

import java.util.Random;

public class Luta {
    Lutador Desafiado;
    Lutador Desafiante;
    boolean aprovado;
    int rounds;

   
    public void marcarLuta(Lutador L1,Lutador L2){
        if (L1 != L2 && L1.getCategoria() == L2.getCategoria()) {
            aprovado = true;
                this.Desafiado = L1;
                this.Desafiante = L2;
                
            
        
        } else {
            System.out.println("A luta não está aprovada");
            aprovado = false;
            
        }
         }
    public void Lutar (){
        if (aprovado == true){
        this.Desafiado.status();
        this.Desafiante.status();
            Random gerador = new Random();
        int num = gerador.nextInt(3);
        switch (num){
            case 1:
               this.Desafiado.ganharl();
               this.Desafiante.perderl();
                System.out.println("O " + this.Desafiado + " Ganhou");
                break;
            case 0: 
               this.Desafiado.empatarl();
               this.Desafiante.empatarl();
                System.out.println("Empatou");
            case 2:
                this.Desafiado.perderl();
                this.Desafiante.ganharl();
                System.out.println("O " + this.Desafiante + " Ganhou");
        }
        }
        else {
System.out.println("Luta não aprovada");              
                }
                        
        
        
    }

    
    
    
    
}
