
package casa;

public class Porta {
private boolean estaAberta;
private String cor;
private double dimensaoX;
private double dimensaoY;
private double dimensaoZ;

    public Porta(String cor, double dimensaoX, double dimensaoY, double dimensaoZ) {
        this.estaAberta = false;
        this.cor = cor;
        this.dimensaoX = dimensaoX;
        this.dimensaoY = dimensaoY;
        this.dimensaoZ = dimensaoZ;
    }

    public boolean isEstaAberta() {
        return estaAberta;
    }

    public void setEstaAberta(boolean estaAberta) {
        this.estaAberta = estaAberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public double getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public double getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }
    public void Abrir(){
       this.setEstaAberta(true);
    }
    public void Fechar(){
        this.setEstaAberta(false);
    }
    public void Pintar(String cor){
        this.setCor(cor);
    }
    public void EstaAberta(){
        if(this.isEstaAberta()== true){
          System.out.println("A porta está aberta");  
        }
        else{
            System.out.println("A porta está fechada");
        }
    }

    @Override
    public String toString() {
        return "Porta{" + "estaAberta=" + estaAberta + ", cor=" + cor + ", Comprimento=" + dimensaoX + ", Comprimento=" + dimensaoY + ", Largura=" + dimensaoZ + '}';
    }
    
    


    
}
