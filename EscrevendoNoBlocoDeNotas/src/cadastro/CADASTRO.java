package cadastro;

import java.io.IOException;
import java.util.Scanner;

public class CADASTRO {

    public static void main(String args[]) throws IOException {

        escritor escritor = new escritor();
        Scanner sc = new Scanner(System.in);
        int escolha = 5;
        while (escolha != 0) {
            System.out.println("O que você quer fazer? \n1-Cadastrar aluno\n2-Ver os alunos "
                    + "aprovados\n3-Ver os alunos reprovados\n4-Ver a média geral da turma\n0-Sair do programa");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    escritor.escritor();
                    break;
                case 2:
                    escritor.leitoraprovados();
                    break;
                case 3:
                    escritor.leitorreprovados();
                    break;
                case 4:
                    escritor.mediageral();
                    break;
                case 0:
                    System.out.println("Obrigado por nos acessar");
                    break;
                default:
                    System.out.println("Número inválido");

            }
        }
    }

}
