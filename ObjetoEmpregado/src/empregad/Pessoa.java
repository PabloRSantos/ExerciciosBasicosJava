/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empregad;

/**
 *
 * @author Artur
 */
public class Pessoa {
    private String nome;
    private String sobrenome;
    private int salariom;

    public Pessoa(String nome, String sobrenome, int salariom) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salariom = salariom;
    }

    public String getNome() {
        return nome;
    }
    
    public void aumentars (int aument){
        setSalariom(aument);
    }
    public void diminuirs(int dim){
        setSalariom(dim);
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sobrenome=" + sobrenome + ", salariom=" + salariom + '}';
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getSalariom() {
        return salariom;
    }

    public void setSalariom(int salariom) {
        this.salariom = salariom;
    }
}
