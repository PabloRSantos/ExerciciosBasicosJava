
package poo;


public class Caneta {
    String modelo;
    String cor;
    int carga;
    boolean tampada;
    double ponta;
    void status (){
        System.out.println("A caneta é do modelo " + modelo + "\n Cor: " + cor + "\n tem " + carga + " de carga\n e a ponta é " + ponta);
    }
    void escrever(){
        if (this.tampada == true) {
        System.err.println("Não posso escrever");
        
    
    }
        else {
                System.out.println("Estou escrevendo");
                }
    
        
    }
}
