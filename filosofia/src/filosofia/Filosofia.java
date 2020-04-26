
package filosofia;

import java.util.Scanner;


public class Filosofia {

  
    public static void main(String[] args) {
       int frequencia, esforcotreino, disciplina, notas, faltando, convocado, controle;
       Scanner sc = new Scanner (System.in);
      
       System.out.println("Começar convocação?\n 0-Não\n 1-Sim");
        controle = sc.nextInt();
      while (controle == 1){
          System.out.println("O aluno tem a frequência necessária?\n 0-Não\n 1-Sim ");
         frequencia = sc.nextInt();
          System.out.println("O aluno tem o esforço necessário no treino?\n 0-Não\n 1-Sim");
            esforcotreino = sc.nextInt();
          System.out.println("O aluno tem notas boas?\n 0-Não\n 1-Sim");
            notas = sc.nextInt();
            if (esforcotreino == 1 && frequencia == 1 && notas == 1){
          System.out.println("\nO aluno pode ser convocado!!"); 
          System.out.println("\n Continuar convocação?\n 0-Não\n 1-Sim");
            controle = sc.nextInt();
          continue;
      }
             System.out.println("Está faltando alunos para a intersérie?\n 0-Não\n 1-Sim");
            faltando = sc.nextInt();
            if (faltando == 1) {
                System.out.println("\nO aluno pode ser convocado!!");
               
            }
            else {
                System.out.println("\nO aluno não pode ser convocado");
            }
            
            System.out.println("\n Continuar convocação?\n 0-Não\n 1-Sim");
            controle = sc.nextInt();
      
      }
    }
    
}
