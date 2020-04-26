                package arraylist;

                import java.util.Scanner;

                public class Arraylist {

                    public static void main(String[] args) {

                        Scanner sc = new Scanner(System.in);
                        int escolha;
                        int atualizar;
                        int atualizarq;
                        double atualizarp;
                        String atualizarn;
                        String adicionar;
                        Lista l1 = new Lista();
                        int quantidade;
                        double valor;
                        int escolha2;
                        int remover;
                        do {
                            System.out.println("O que você quer fazer na lista? \n 1-Cadastrar \n 2-Remover produto \n 3-Alterar/Vender \n 4-Mostrar lista\n 0-Sair do Programa");
                            escolha = sc.nextInt();
                            switch (escolha) {
                                case 1:
                                    System.out.println("O que você quer adicionar?");
                                    adicionar = sc.next();
                                    System.out.println("Quantos quer adicionar?");
                                    quantidade = sc.nextInt();

                                    System.out.println("Digite o preço da unidade do produto");
                                    valor = sc.nextDouble();
                                    l1.adicionar(adicionar, valor, quantidade);

                                    break;

                                case 2:
                                    System.out.println("Qual posiçao voce quer remover?");
                                    remover = sc.nextInt();
                                    l1.remover(remover);
                                    break;

                                case 3:
                                    System.out.println("1-Alterar Preço\n 2- Alterar nome do produto\n 3- Vender produto\n 4- Aumentar quantidade do produto");
                                    escolha2 = sc.nextInt();
                                    switch (escolha2) {
                                        case 3:
                                            System.out.println("Em que posição está o produto vendido?");
                                            atualizar = sc.nextInt();
                                            System.out.println("Quantos foram vendidos?");
                                            atualizarq = sc.nextInt();
                                            l1.atualizarq(atualizar, atualizarq);
                                            break;
                                        case 4:
                                             System.out.println("Em que posição está o produto?");
                                            atualizar = sc.nextInt();
                                            System.out.println("Quantos deste produto você deseja adicionar?");
                                            atualizarq = sc.nextInt();
                                            l1.atualizarq2(atualizar, atualizarq);
                                            break;
                                        case 1:
                                            System.out.println("Em que posição voce quer alterar?");
                                            atualizar = sc.nextInt();
                                            System.out.println("Qual o novo preço?");
                                            atualizarp = sc.nextDouble();
                                            l1.atualizarp(atualizar, atualizarp);
                                            break;
                                        case 2:
                                            System.out.println("Em que posição voce quer alterar?");
                                            atualizar = sc.nextInt();
                                            System.out.println("Qual o novo nome?");
                                            atualizarn = sc.next();
                                            l1.atualizarn(atualizar, atualizarn);
                                            break;
                                        default:
                                            System.out.println("invalido");
                                    }
                                    break;

                                case 4:
                                    l1.listar();
                                    break;
                                case 0:
                                    System.out.println("Programa finalizado");
                                    break;
                                default:
                                    System.out.println("Invalido");
                                    break;
                            }
                        } while (escolha != 0);

                    }

                }
