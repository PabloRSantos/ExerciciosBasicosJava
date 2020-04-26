
package ufc;


public class Lutador implements Controlador {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
        setCategoria(peso);
    }

    public double getAltura() {
        return altura;
    }

    public Lutador(String nome, int peso, double altura, String nacionalidade, int vitoria, int derrota, int empate) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.nacionalidade = nacionalidade;
        this.vitoria = vitoria;
        this.derrota = derrota;
        this.empate = empate;
                }
              

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public void setCategoria(int peso) {
       if (peso < 70){
           this.categoria = "Leve";
       }else if (peso < 82 ){
           this.categoria = "Medio";
       }
        if (peso < 120){
           this.categoria = "Pesado";
       }
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    private String nome;
    private int peso;
    private double altura;
    private String categoria;
    private String nacionalidade;
    private int vitoria;
    private int empate;
    private int derrota;

    @Override
    public void status() {
        System.out.println("Nome " + this.getNome()+ " Nacionalidade " + this.getNacionalidade()+ " altura " + this.getAltura()
        + " peso " + this.getPeso()+ " vitorias " + this.getVitoria() + " derrotas " + this.getDerrota()+ " empates " + this.getEmpate());
    }

    @Override
    public void ganharl() {
        setVitoria(getVitoria() + 1);
    }
  
    @Override
    public void empatarl() {
        setEmpate(getEmpate() + 1);
    }

    @Override
    public void perderl() {
        setDerrota(getDerrota() + 1);
    }
    
}

