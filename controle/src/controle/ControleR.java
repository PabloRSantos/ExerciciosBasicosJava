
package controle;


public class ControleR implements Controlador{
    private int Volume;

    private int getVolume() {
        return Volume;
    }

    private void setVolume(int Volume) {
        this.Volume = Volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private int getCanal() {
        return canal;
    }

    private void setCanal(int canal) {
        this.canal = canal;
    }
    private boolean ligado;
    private int canal;

    public ControleR() {
        this.setVolume(50);
        this.setLigado (true);
        this.setCanal(6);
    }
    

    @Override
    public void aumentarVolume() {
        if (this.Volume < 100){
            this.setVolume (this.getVolume() + 5);
        }
    }

    @Override
    public void baixarVolume() {
        if (this.getVolume() > 0){
            this.setVolume (this.getVolume() - 5);
        }
    }

    @Override
    public void Ligar() {
        this.setLigado(true);
    }

    @Override
    public void Desligar() {
        this.setLigado(false);
    }

    @Override
    public void maisCanal() {
        switch (this.getCanal ()) {
            
            case 60:
                this.setCanal(1);
                break;
            default:
                this.setCanal (this.getCanal() + 1);
                break;
        }
    }

    @Override
    public void menosCanal() {
        switch (this.getCanal()){
            case 0:
                this.setCanal(60);
                break;
            default:
               this.setCanal (this.getCanal() - 1);
        }
    }
    public void menu(){
        if (this.isLigado ()== true) {
            System.out.println("Volume " + this.getVolume());
            System.out.println("Canal " + this.getCanal());
            System.out.println("Ligado? " + this.isLigado());
        }
         else {
            System.err.println("A tv está desligada");
         }
    }
    
}
