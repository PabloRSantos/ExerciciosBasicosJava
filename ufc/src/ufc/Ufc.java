
package ufc;


public class Ufc {

    
    public static void main(String[] args) {
       Lutador l[] = new Lutador [6];
        l[0] = new Lutador("Pretty Boy" ,68, 1.75, "França", 11, 2, 1);
        l[1] = new Lutador("Putscript" , 57, 1.68, "Brasil", 14, 2, 3);
        l[2] = new Lutador("Snapshadow" , 80, 1.65, "EUA", 12, 2, 1);
        l[3] = new Lutador("Dead Code", 81, 1.93, "Brasil", 13, 0, 2);
        l[4] = new Lutador("Pablo", 119, 1.70, "Austrália", 5, 4, 3);
        l[5] = new Lutador("Nerdaart" , 105, 1.81, "EUA", 12, 2, 4);
        
        Luta p1 = new Luta ();
       
        p1.marcarLuta(l[4], l[5]);
        p1.Lutar();
        l[4].status();
    }
    
}
