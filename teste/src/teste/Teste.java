
package teste;


public class Teste {

   
    public static void main(String[] args) {
        mthread t1 = new mthread ("pablo",1000);
        t1.start();
        mthread t2 = new mthread ("artur",500);
        t2.start();
    }
    
}
