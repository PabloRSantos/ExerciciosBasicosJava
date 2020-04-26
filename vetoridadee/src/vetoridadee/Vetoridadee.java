
package vetoridadee;

import java.util.Scanner;
public class Vetoridadee {

    
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    double maior = 0, menor = 99999;
    double A [] = new double [10];
    for (int i = 0; i < 10; i++){
        System.out.println("Digite sua idade"); 
        A [i] = sc.nextDouble ();
        if (A [i] > maior){
            maior = A [i];
            System.out.println("A pessoa mais velha tem " + maior + " anos");
           System.out.println("A pessoa mais nova tem " + menor + " anos");
           
        }
        else if (A [i] < menor){
            menor = A [i];
            System.out.println("A pessoa mais velha tem " + maior + " anos");
            System.out.println("A pessoa mais nova tem " + menor + " anos");
        }
       
    }
    
    }
    
}
