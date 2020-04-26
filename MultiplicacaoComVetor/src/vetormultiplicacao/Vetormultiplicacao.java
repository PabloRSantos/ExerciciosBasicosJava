
package vetormultiplicacao;
import java.util.Scanner;

public class Vetormultiplicacao {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int A [] = new int [5];
        int B [] = new int [5];
       for (int i = 0; i <= 4; i++){
           System.out.println("Digite o " + (i+1) + " Número");
           A [i]= sc.nextInt();
           B [i]= A[i] * 2;
           System.out.println("O valor do valor B é " + B[i]);
        
    }
        
    }
    
}
