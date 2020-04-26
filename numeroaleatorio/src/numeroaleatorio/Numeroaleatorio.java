
package numeroaleatorio;

import java.util.Scanner;

public class Numeroaleatorio {

    
    
    public static void main(String[] args) {
     
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite a nota de sua primeira prova");
        int nota = sc.nextInt();
        System.out.println("Digite a nota de sua segunda prova");
        int nota2 = sc.nextInt();
        System.out.println("Digite a nota de sua terceira prova");
        int nota3 = sc.nextInt();
        int maiornota = 0, maiornota2 = 0;
        int media2pro = media (nota,nota2,nota3,maiornota,maiornota2);
        int media3pro = media3 (nota,nota2,nota3);
        System.out.println("A media das duas maiores notas é " + media2pro);
        System.out.println("A media das tres notas é " + media3pro);
                
        
    
    
    
        
    
    }
    static int media (int nota, int nota2, int nota3, int maiornota, int maiornota2){
        
        if (nota > maiornota || nota > maiornota2){
            maiornota = nota;
        }
        else if (nota2 > maiornota || nota2 > maiornota2){
            maiornota2 = nota2;
        }
        else if (nota3 > maiornota || nota3 > maiornota2){
            if (maiornota < maiornota2){
                maiornota = maiornota2;
            }
           maiornota2 = nota3;
               
            }
        return (maiornota + maiornota2)/2;
        
        }
    static int media3 (int nota, int nota2, int nota3){
        int media3 = (nota + nota2 + nota3) / 3;
        return media3;
    }
       
    }
