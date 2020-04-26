
package vetormediaaluno;

import java.util.*;

public class Vetormediaaluno {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      double nota1 [] = new double [5];
      double nota2 [] = new double [5];
      String nome [] = new String [5];
      double media [] = new double [5];
      double mediaescola = 0;
      double notas [] = new double [5];
        System.out.println("Informe a média");
        mediaescola = sc.nextDouble ();
      
      for (int i = 0; i < 6; i++){
          System.out.println("Informe o nome do " + (i+1) + " aluno");
          nome [i]= sc.next();
          System.out.println("Digite a nota do primeiro bimestre");
          nota1 [i]= sc.nextDouble ();
          System.out.println("Digite a nota do segundo bimestre");
          nota2 [i] = sc.nextDouble ();
          notas [i] = (nota1 [i] + nota2 [i]) / 2;
          if (notas [i] < mediaescola){
              System.out.println("A média de " + nome [i] + " é: " + notas [i] +  "e ele está reprovado");
              
          }
          else if (notas [i] >= mediaescola) {
              System.out.println("A média de " + nome [i] + " é: " + notas [i] + " e ele está aprovado");
          }
          
      }
              
    }
    
}
