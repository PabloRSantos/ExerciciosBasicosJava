
package trabpessoa;

public class Pj extends Pessoa {
    private int cnpj;
    private float imposto;
    
     public Pj(String nome,int telefone, float renda, int cnpj) {
        this.cnpj = cnpj;
         this.nome = nome;
    this.telefone = telefone;
    this.renda = renda;
    }

    @Override
    public void calculaimposto() {
        this.setImposto(renda*35/100);
        System.out.println("O imposto pago por " + this.getNome() + " que tem o CNPJ "
                + this.getCnpj() + ", telefone " + this.getTelefone() + " e renda de " +
                this.getRenda()
                 + " é " + this.getImposto() + " reais");
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

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public float getImposto() {
        return imposto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }
    
    
    
    
        
}
