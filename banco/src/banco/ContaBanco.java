
package banco;



public class ContaBanco {
    double numconta;
    String tipo;
    String dono;
    double saldo;
    boolean status;

    public ContaBanco() {
        
        this.saldo = 0;
        this.status = false;
        
        
    
    }

    public double getNumconta() {
        return numconta;
    }

    public void setNumconta(double numconta) {
        this.numconta = numconta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void abrirConta (){
        this.status = true;
    }
    public void fecharConta(){
        if (this.saldo < 0 || this.saldo > 0){
            System.err.println("Erro");
           
        }
        else {
            
        
        this.status = false;
        }
    }
    public void deposito (double deposito){
        if (this.status == false){
            System.err.println("A conta está fechada");
        }
        else {
          this.saldo += deposito;
        }
        
    }
    public void saque (double saque){
        if (this.status == false || this.saldo < 0){
            System.err.println("A conta está fechada");
        }
        else {
          this.saldo -= saque;
        }
    }
    public void mensalidade (){
       if (this.tipo.equals("cc")) {
           this.saldo -= 12;
       }
       else {
           this.saldo -= 20;
       }
    }
    public void contanova(String tipo){
         if (this.tipo.equals("cc")){
           this.saldo = 50;
           this.setSaldo(saldo);
        }
        else if (this.tipo.equals("cp")){
            this.saldo = 150;
            this.setSaldo(saldo);
                    
        
    }
    }
}
