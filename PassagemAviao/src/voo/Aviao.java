
package voo;

import java.util.Arrays;

public class Aviao {
    private int data;
    private double hora;
    private int passageiros;
    private int numaviao;
    private int ocupacao;
    private boolean cadeira[] = new boolean [100];

    public Aviao(int data, double hora,int numaviao) {
        this.data = data;
        this.hora = hora;
        this.passageiros = 0;
        this.numaviao = numaviao;
        this.ocupacao = 0;
       for (int e = 0; e < 100; e++){
          this.cadeira [e] = true;  
       }
       
    }
    public void Proxcadeiralivre(){
        System.out.println("A proxima cadeira livre é a " + (this.ocupacao + 1));
    
}
    public void verifica(int i){
       if (this.cadeira[i -1]== true ){
         
           System.out.println("A cadeira está livre");
          }
       else if (this.cadeira[i-1]== false){
           System.out.println("A cadeira está preenchida");
       }
    }
    public void ocupar (int i){
        if (this.cadeira[i -1]== true ){
         this.cadeira [i -1 ] = false;
           System.out.println("A cadeira foi ocupada com sucesso");
           this.ocupacao++;
           this.passageiros++;
          }
       else if (this.cadeira[i-1]== false){
           
           System.out.println("A cadeira está preenchida");
       }
    }

    public int getNumaviao() {
        return numaviao;
    }

    public int getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Aviao{" + "data=" + data + ", hora=" + hora + ", passageiros=" + passageiros + ", numaviao=" + numaviao + ", ocupacao=" + ocupacao +  '}';
    }
    
    }
