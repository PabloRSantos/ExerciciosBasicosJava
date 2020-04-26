
package trabpessoa;


public abstract class Pessoa {
   protected String nome;
    protected int telefone;
    protected float renda;


    public String getNome(){
        return nome;
    }
    protected void setNome(String nome){
        this.nome = nome;
    }
    protected int getTelefone(){
        return telefone;
    }
    protected void setTelefone(int telefone){
        this.telefone = telefone;
    }
    protected float getRenda(){
        return renda;
    }
    protected void setRenda(float renda){
        this.renda = renda;
    }
   protected abstract void calculaimposto();
        
    }
    

