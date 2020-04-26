
package gabarito;

import java.util.Scanner;

public class Gabarito {


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        char gabarito [] = new char [10];
        int aluno [] = new int [10];
        int acertos = 0, acertos2 = 0;
        for (int i = 0; i < 3; i++){
            acertos = 0;
            System.out.println("Digite suas respostas no cartao resposta");
            System.out.print("1- ");
            gabarito [0] = sc.next().charAt(0);
            System.out.print("2- ");
            gabarito [1] = sc.next().charAt(0);
            System.out.print("3- ");
            gabarito [2] = sc.next().charAt(0);
            System.out.print("4- ");
            gabarito [3] = sc.next().charAt(0);
            System.out.print("5- ");
            gabarito [4] = sc.next().charAt(0);
            System.out.print("6- ");
            gabarito [5] = sc.next().charAt(0);
            System.out.print("7- ");
            gabarito [6] = sc.next().charAt(0);
            switch (gabarito [0]) {
                case 'A':
                    acertos++;
                    break;}
                     switch (gabarito [1]) {
                case 'A':
                    acertos++;
                    break;}
                     switch (gabarito [2]) {
                case 'E':
                    acertos++;
                    break;}
                     switch (gabarito [3]) {
                case 'B':
                    acertos++;
                    break;}
                     switch (gabarito [4]) {
                case 'B':
                    acertos++;
                    break;}
                     switch (gabarito [5]) {
                case 'C':
                    acertos++;
                    break;}
                     switch (gabarito [6]) {
                case 'C':
                    acertos++;
                    break;}
            System.out.println("O " + (i+1) + " Aluno teve " + acertos + " Acertos");
            if (acertos > acertos2){
                acertos2 = acertos;
                System.out.println("O " + (i+1) + " aluno teve a nota mais alta");
            }
            
            
            
            
        }
    }
    
}
