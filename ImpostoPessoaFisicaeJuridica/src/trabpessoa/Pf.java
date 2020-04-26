
package trabpessoa;


public class Pf extends Pessoa {

    private int cpf;
    private float imposto;

    public Pf(String nome,int telefone, float renda, int cpf) {
        this.cpf = cpf;
         this.nome = nome;
    this.telefone = telefone;
    this.renda = renda;
    }

   

    public int getCpf() {
        return cpf;
    }

   public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    
    @Override
    public void calculaimposto() {
        if (this.getRenda() > 0 && this.getRenda() < 1000){
            System.out.println("isento");
        }
        else if (this.getRenda() < 2000){
            this.setImposto(this.getRenda()*15/100); 
        }
        else if (this.getRenda() < 3000){
           this.setImposto(this.getRenda()*25/100);
        }
        else if (this.getRenda() > 3000){
           this.setImposto(this.getRenda()*28/100);
        }
        else{
            System.out.println("Renda inválida");
        }
        System.out.println("O imposto pago por " + this.getNome() + " que tem o CPF "
                + this.getCpf() + ", telefone " + this.getTelefone() + " e renda de "
                + this.getRenda() + " é " + this.getImposto() + " reais");
    }

    public float getImposto() {
        return imposto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }
    @Override
     public String getNome(){
        return nome;
    }
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
   public int getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public float getRenda() {
        return renda;
    }

    @Override
    public void setRenda(float renda) {
        this.renda = renda;
    }
    
    
    
}
