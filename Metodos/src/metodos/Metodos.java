
package metodos;

import java.util.Scanner;

public class Metodos {


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite valor para A");
       int a = sc.nextInt();
        System.out.println("Digite valor para b ");
       int b = sc.nextInt();
        int sm = soma (a,b); 
        System.out.println("A soma é " + sm);
    }
    public static int soma (int a, int b){
        int S = a + b;
        return S;
    }
    
}
