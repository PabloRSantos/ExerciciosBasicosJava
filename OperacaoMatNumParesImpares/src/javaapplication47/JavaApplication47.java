
package javaapplication47;
import java.util.Scanner;

public class JavaApplication47 {


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double num, numimpar, produto = 1, soma = 0;
        
        do{
            System.out.println("Digite seu número: (Digite 0 para sair)");   
            num = sc.nextDouble();
            if (num % 2 != 0){
             numimpar = num;
             produto = produto * num;
            }
            else{
               soma += num; 
            }
            System.out.println("Produto dos números impares: " + produto + "\nSoma dos números pares: " + soma);
        }while(num != 0);
        
    }
    
}
