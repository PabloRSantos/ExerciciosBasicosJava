
package empregados;

import java.util.Scanner;

public class Empregados {

 
    public static void main(String[] args) {
    
            Scanner sc = new Scanner (System.in);
            int homens = 0, feminino = 0, fem30 = 0, trabalhadores = 0, funcionarios = 0, opcao = 0;
            double mediasalariom = 0,totalsalario = 0, totalsalario30 = 0, mediasalariom30 = 0, mediasalariotodos = 0, totalsalariotodos = 0;
            
            
            for (int i=0; i == funcionarios; i++){
                 System.out.println("Digite suas informações sobre:\n Sexo");
            String sexo = sc.next();
            System.out.println("Idade:");
            int idade = sc.nextInt();
            System.out.println("Numero de horas trabalhadas:");
            double horast = sc.nextDouble();
            System.out.println("Salário recebido por hora");
            double salarioh = sc.nextDouble();
                
           
                
                funcionarios++;
                
                if (sexo.equals ("masculino")){
                    homens++;
                    System.out.println("Há " + homens + " homens na empresa");
                    
                }
                else {
                    System.out.println("Há " + homens + " homens na empresa");
                }
                if (sexo.equals ("feminino")){
                    feminino++;
                   totalsalario += (salarioh * horast);
                   mediasalariom = totalsalario / feminino;
                    System.out.println("A media de salario das mulheres é de " + mediasalariom + "Reais");
                }
                else {
                    mediasalariom = totalsalario / feminino;
                    System.out.println("A media de salario das mulheres é de " + mediasalariom + "Reais");
                }
                if (idade < 30 && sexo.equals ("feminino")){
                    fem30++;
                    totalsalario30 += (salarioh * horast);
                    mediasalariom30 = totalsalario30 / fem30;
                    System.out.println("A media de salario das mulheres com menos de 30 anos é de " + mediasalariom30 + "Reais");
                }
                else {
                    mediasalariom30 = totalsalario30 / fem30;
                    System.out.println("A media de salario das mulheres com menos de 30 anos é de " + mediasalariom30 + "Reais");
                }
                trabalhadores++;
                totalsalariotodos += (salarioh * horast);
                mediasalariotodos = totalsalario / trabalhadores;
                System.out.println("A media de salario dos funcionarios é de " + mediasalariotodos + " Reais");
                System.out.println("Deseja encerrar o programa?\n Digite 1-Sim ou 2-Não");
                opcao = sc.nextInt();
                if (opcao == 1){
                System.out.println("Parou");
                funcionarios = 10;
                }
                else {
                    System.out.println("Ok");
                    
                }
               
                
            }
            
            
     
    }
    
}
