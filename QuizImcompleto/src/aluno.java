
public class aluno {
    private String nome;
    private int idade;

    public aluno(String nome) {
        this.nome = nome;
    }

   

    

  
    private int acertos;
    private int erros;
    private double nota;
    private double maiornota;
    
    public void acertar(){
       this.acertos++;
    }
    public void errar(){
        this.erros++;
    }
    public void ganharnota(double n){
        this.nota+= n;
    }
}
