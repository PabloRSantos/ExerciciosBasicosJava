
package poo;

import java.util.Scanner;

public class Poo {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        Caneta c1 = new Caneta ();
        System.out.println("Digite a carga da caneta");
        c1.carga = sc.nextInt();
        System.out.println("Digite a cor da caneta");
        c1.cor = sc.next();
        System.out.println("Digite o modelo da caneta");
        c1.modelo = sc.next();
        System.out.println("Digite o tamanho da ponta da caneta");
        c1.ponta = sc.nextDouble();
        c1.tampada = true;
        c1.status();
        c1.escrever();
         Caneta c2 = new Caneta ();
        System.out.println("Digite a carga da caneta");
        c2.carga = sc.nextInt();
        System.out.println("Digite a cor da caneta");
        c2.cor = sc.next();
        System.out.println("Digite o modelo da caneta");
        c2.modelo = sc.next();
        System.out.println("Digite o tamanho da ponta da caneta");
        c2.ponta = sc.nextDouble();
        c2.tampada = false;
        c2.status();
        c2.escrever();
    }
        
    }
    

