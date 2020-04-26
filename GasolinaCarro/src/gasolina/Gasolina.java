
package gasolina;

import java.util.Scanner;
public class Gasolina {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Informe de quantos km será sua viagem");
        double km = sc.nextDouble();
        double gasolina = km/12;
        
        System.out.println("Para sua viagem voce precisará de " + gasolina + "litros de gasolina" );
    }
    
}
