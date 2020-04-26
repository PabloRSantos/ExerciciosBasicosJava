
package aluno;


public class Estudante extends Pessoa{
    private int matricula;
    public Estudante(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Estudante{" + "nome" + nome + "matricula=" + matricula + '}';
    }

   
    
    
}
