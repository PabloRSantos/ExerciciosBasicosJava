
package casa;


public class Cafofo  {
    private String cor;
    
    private int Portasabertas = 0;

    public String getCor() {
        return cor;
    }

    public void Pintar(String cor) {
        this.cor = cor;
    }

    
    
    public void AbrirPorta(){
        
        this.Portasabertas++;
       
        
    }
    public void FecharPorta(){
       
        this.Portasabertas--;
       
        
    }

    @Override
    public String toString() {
        return "Cafofo{" + "cor=" + cor + " Portasabertas=" + Portasabertas + '}';
    }
    
    
    
    

    
}
