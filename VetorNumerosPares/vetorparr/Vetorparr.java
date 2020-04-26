
package vetorparr;

import java.util.Scanner;

public class Vetorparr {

   
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     int par = 0;
     int A [] = new int [10];
     for (int i = 0; i <= 9; i++){
         System.out.println("Digite um número");
         A [i] = sc.nextInt ();
         if (A [i] % 2 == 0){
             par++;
            System.out.println("Há " + par + " números pares");
            
             
         }
         else {
             System.out.println("Há " + par + " números pares");
         }
         
     }
    }
    
}
