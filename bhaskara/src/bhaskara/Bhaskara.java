
package bhaskara;

import java.util.Scanner;


public class Bhaskara {

    
    public static void main(String[] args) {
       double a = 0, b = 0, c = 0;
        
       Scanner sc = new Scanner (System.in);
       System.out.println("Digite a operação que quer fazer: Soma, Subtração, Bhaskara");
        String operacao = sc.nextLine();
        if (operacao.equals ("Bhaskara")){
            double delta1 = bhaskaral (a,b,c);
        System.out.println("o delta é " + delta1);
        
    }
        else if (operacao.equals("soma")){
            double sm = soma (a,b);
            System.out.println("A soma é " + sm);
        }
       
    }
    public static double bhaskaral (double a, double b, double c) {
     Scanner sc = new Scanner (System.in);
        System.out.println("Digite o valor de a ");
        a = sc.nextDouble ();
       System.out.println("Digite o valor de b ");
        b = sc.nextDouble ();
       System.out.println("Digite o valor de c ");
        c = sc.nextDouble ();
        double delta = b * b- 4 * a * c;
     return delta;
        
    }
    public static double soma (double a, double b){
       Scanner sc = new Scanner (System.in);
        System.out.println("Digite o primeiro valor");
        a = sc.nextDouble();
         System.out.println("Digite o segundo valor");
        b = sc.nextDouble();
        double s = a + b;
        return s;
    }
}
