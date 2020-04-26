package arraylist;

import java.util.ArrayList;

public class Lista {

    ArrayList<String> lista = new ArrayList<String>();
    ArrayList<Double> preco = new ArrayList<Double>();
    ArrayList<Integer> qntd = new ArrayList<Integer>();
    int escolha;
    int remover;
    int atualizar;
    int mostrarlist;
    int posicao;
    double valor;
    String atualizar2;
    String adicionar;
    int quantidade;
   
    public void adicionar(String adicionar, double valor, int quantidade) {
        this.lista.add(adicionar);
        this.preco.add(valor);
        this.qntd.add(quantidade);
    }

    public void remover(int rmv) {
        lista.remove(rmv);
        preco.remove(rmv);
        qntd.remove(rmv);
    }

    public void atualizarq(int atualizar, int atualizarq) {
if (qntd.get(atualizar) >= atualizarq ){
        qntd.set(atualizar, (qntd.get(atualizar) - atualizarq));
valor = preco.get(atualizar) * atualizarq;
    System.out.println("Você ganhou " + valor + " reais");
}
else {
    System.out.println("Não há tantos produtos");
}
    }
     public void atualizarq2(int atualizar, int atualizarq) {

        qntd.set(atualizar, (qntd.get(atualizar) + atualizarq));

    }

    public void atualizarp(int atualizar, double atualizarp) {
if (atualizarp >= 0){
        preco.set(atualizar, atualizarp);
}
else {
    System.out.println("Preço inválido");
}
    }

    public void atualizarn(int atualizar, String atualizarn) {

        lista.set(atualizar, atualizarn);

    }

    public void listar() {
        System.out.print("PRODUTO: \t PREÇO POR UNIDADE: \t QUANTIDADE: \n");
        for (int i = 0; lista.size() > i; i++) {
            System.out.print(lista.get(i) + "\t \t ");
            System.out.print(preco.get(i)+ "\t \t \t");
            System.out.print(qntd.get(i)+ "\n");
        }
    }
}
