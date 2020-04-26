
package javaapplication24;

import java.util.Scanner;

public class JavaApplication24 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean num = true;
        int numero = 0;
        System.out.println("Digite um numero ");
        numero = sc.nextInt();
        boolean tipo = positivo (numero,num);
        if (tipo == true){
            System.out.println("O numero é positivo");
        }
        else {
            System.out.println("O numero é negativo");
        }
        String a = "";
        System.out.println("a " +a);
        String b = "oi";
        System.out.println(b);
    }
    public static boolean positivo (int numero, boolean num){
        if (numero > 0) {
            num = true;
        }
        else {
            num = false;
        }
        return num;
    }
    
}
