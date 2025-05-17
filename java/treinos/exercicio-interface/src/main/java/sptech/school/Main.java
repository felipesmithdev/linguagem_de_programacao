package sptech.school;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean ativo = true;
        Scanner escolha = new Scanner(System.in);
        Scanner string = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();

        while (ativo){
            System.out.println("""
                    Olá !
                    Por favor, escolha uma das seguintes opções
                    1 - Adicionar livro.
                    2 - Adicionar DVD.
                    3 - Adicionar serviço.
                    4 - Exibir itens do carrinho.
                    5 - Exibir total de venda.
                    6 - FIM.
                    """);
            Integer opcao = escolha.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Informe o código:");
                    Integer codigo = string.nextInt();
                    string.nextLine();


                    System.out.println("\nOk, agora informe o preço de custo: ");
                    Double precoCusto = string.nextDouble();
                    string.nextLine();

                    System.out.println("\nInforme o nome do livro: ");
                    String nome = string.nextLine();

                    System.out.println("\nInforme o autor do livro: ");
                    String autor = string.nextLine();

                    System.out.println("\nPor último, informe o ISBM do livro: ");
                    String isbm = string.nextLine();

                    System.out.println("\nTudo certo! Adicionando o Livro: " + nome + " ao carrinho.");
                    Livro livro = new Livro(codigo, precoCusto, nome, autor, isbm);
                    carrinho.adicionaVendavel(livro);
                    break;

                case 2:
                    System.out.println("Informe o código:");
                    Integer codigoDVD = string.nextInt();
                    string.nextLine();


                    System.out.println("\nOk, agora informe o preço de custo: ");
                    Double precoCustoDVD = string.nextDouble();
                    string.nextLine();

                    System.out.println("\nInforme o nome do DVD: ");
                    String nomeDVD = string.nextLine();

                    System.out.println("\nInforme a gravadora do DVD: ");
                    String gravadora = string.nextLine();

                    System.out.println("\nTudo certo! Adicionando o DVD: " + nomeDVD + " ao carrinho.");
                    DVD DVD = new DVD(codigoDVD, precoCustoDVD, nomeDVD, gravadora);
                    carrinho.adicionaVendavel(DVD);
                    break;

                case 3:
                    System.out.println("Informe a descrição do serviço:");
                    String service = string.nextLine();

                    System.out.println("\nOk, agora informe o codigo do serviço: ");
                    Integer codigoServico = string.nextInt();
                    string.nextLine();

                    System.out.println("\nInforme a quantidade de horas: ");
                    Integer qtdHoras = string.nextInt();
                    string.nextLine();

                    System.out.println("\nInforme o valor por hora de serviço: ");
                    Double valorHora = string.nextDouble();

                    System.out.println("\nTudo certo! Adicionando o Serviço: " + service + " ao carrinho.");
                    Servico servico = new Servico(service, codigoServico, qtdHoras, valorHora);
                    carrinho.adicionaVendavel(servico);
                    break;


                case 4:
                    System.out.println("\nExibindo a lista de produtos do carrinho: \n");
                    carrinho.exibeItensCarrinho();
                    break;


                case 5:
                    System.out.println("\nExibindo o total de vendas: ");
                    System.out.println("\nTotal R$ " + carrinho.calculaTotalVenda());
                    break;

                case 6:
                    ativo = false;
                    break;
            }

        }
    }
}