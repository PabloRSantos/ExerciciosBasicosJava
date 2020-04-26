
package media;

import java.util.Scanner;

public class Media {

    
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     int populacao = 0,filhos3 = 0;
     double salariototal = 0;
        System.out.println("informe seu salário");
        double salario = sc.nextDouble();
        System.out.println("Informe quantos filhos você tem");
        int filhos = sc.nextInt();
        salariototal = salario;
        double mediafilhos;
                int filhostotal = filhos;
        System.out.println("A media do salário é de " + salariototal);
        System.out.println("A média de filos é de " + filhostotal);
        populacao++;
        System.out.println("Voce quer continuar?\n 1- Sim\n 0- Não");
        int condicao = sc.nextInt();
        while (condicao != 0){
             System.out.println("informe seu salário");
        double salario3 = sc.nextDouble();
          
        System.out.println("Informe quantos filhos você tem");
        filhos3 = sc.nextInt();
        populacao++;
        salariototal += salario3;
        double mediasalario = salariototal / populacao;
        filhostotal += filhos3;
        mediafilhos = filhostotal / populacao;
            System.out.println("A média do salário é de " + mediasalario);
            System.out.println("A média de filhos é de " + mediafilhos);
        if (salario3 > salario){
                System.out.println("*O maior salário é " + salario3 + "R$");
                salario3 = salario;
            
        }
            else{
                System.out.println("*O maior salário é " + salario + "R$");
            }
        if (filhos3 > filhos){
                System.out.println("*O habitante com mais filhos tem " + filhos3 + " Filhos \n");
                filhos3 = filhos;
            
        }
            else{
                System.out.println("*O habitante com mais filhos tem " + filhos + " Filhos \n");
            }
            System.out.println("Você quer continuar?\n 1-Sim \n 0-Não");
            condicao = sc.nextInt();
        }
    }
    
}
