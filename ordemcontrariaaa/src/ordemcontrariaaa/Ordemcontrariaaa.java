
package ordemcontrariaaa;

import java.util.Scanner;
public class Ordemcontrariaaa {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      int numeros [] = new int [10];
      for (int i = 0; i < 10 ; i++){
          System.out.println("Digite um número");
          numeros [i] = sc.nextInt();
          
      }
        for (int e = 9; e > -1 ; e--){
            System.out.println(numeros [e]);
        }
    }
    
}
