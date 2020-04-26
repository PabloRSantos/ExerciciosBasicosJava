package cadastro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class escritor {

    File arq = new File("C:\\Users\\Artur\\Desktop\\cadastro.txt");

    public void leitoraprovados() throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(arq));
        String linha = buffRead.readLine();
        String nome;
        int nota;
        int conversao;
        System.out.println("Aprovados");
        while (linha != null) {
            nota = 0;
            nome = linha;

            for (int p = 0; p < 2; p++) {
                linha = buffRead.readLine();
            }
            for (int r = 0; r < 3; r++) {
                conversao = Integer.parseInt(linha);
                nota += conversao;
                linha = buffRead.readLine();
            }

            if (nota > 21) {
                System.out.println(nome);

            }

        }
        buffRead.close();

    }

    public void leitorreprovados() throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(arq));
        String linha = buffRead.readLine();
        String nome;
        int nota = 0;
        int conversao;
        System.out.println("Reprovados");
        while (linha != null) {
            nota = 0;
            nome = linha;

            for (int s = 0; s < 2; s++) {
                linha = buffRead.readLine();
            }
            for (int c = 0; c < 3; c++) {
                conversao = Integer.parseInt(linha);
                nota += conversao;
                linha = buffRead.readLine();
            }

            if (nota < 21) {
                System.out.println(nome);

            }

        }
        buffRead.close();

    }

    public void mediageral() throws FileNotFoundException, IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(arq));
        String linha = buffRead.readLine();
        int notam = 0;
        int conversaom;
        int cont = 0;
        while (linha != null) {
            cont++;
            for (int s = 0; s < 2; s++) {
                linha = buffRead.readLine();
            }
            for (int c = 0; c < 3; c++) {
                conversaom = Integer.parseInt(linha);
                notam += conversaom;
                linha = buffRead.readLine();
            }

        }
        notam = notam / cont;
        System.out.println("Média geral da turma: " + notam);
    }

    public void escritor() throws IOException {

        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(arq, true));
        String linha;
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva o nome: ");
        linha = in.nextLine();
        buffWrite.append(linha + "\r\n"); //temos q usar \r por causa da formatação do bloco de notas
        System.out.println("Escreva a matricula: ");
        linha = in.nextLine();
        buffWrite.append(linha + "\r\n"); //temos q usar \r por causa da formatação do bloco de notas
        System.out.println("Escreva a nota do 1 trim: ");
        linha = in.nextLine();

        buffWrite.append(linha + "\r\n"); //temos q usar \r por causa da formatação do bloco de notas
        System.out.println("Escreva a nota do 2 trim: ");
        linha = in.nextLine();

        buffWrite.append(linha + "\r\n"); //temos q usar \r por causa da formatação do bloco de notas
        System.out.println("Escreva a nota do 3 trim: ");
        linha = in.nextLine();

        buffWrite.append(linha + "\r\n"); //temos q usar \r por causa da formatação do bloco de notas
        buffWrite.close();
    }

}
