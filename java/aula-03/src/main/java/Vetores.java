import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {

//        String[] jogos = new String[5];
//    String[] cores = {"Yellow","Blue","Black","Greem","Purple"};
//    String[] jogos = {"","","","",""};
//        for (int i = 0; i < jogos.length; i++) {
//            System.out.println(jogos[i]);
//        }

        //vetor de jogos
        String[] jogos;
        Scanner input = new Scanner(System.in);
        Scanner tamanhoVetor = new Scanner(System.in);

        System.out.println("Digite a quantidade de jogos que deseja guardar: ");
        Integer tamanho;
        tamanho = tamanhoVetor.nextInt();
        jogos = new String[tamanho];

        for (int i = 0; i < jogos.length; i++) {
            System.out.println(
                    String.format("Digite o %d jogo: ", i+1));
            jogos[i] = input.nextLine();
        }

        for (int i = 0; i < jogos.length; i++) {
            System.out.println(
                    String.format("Digite o %d jogo: %s", i+1, jogos[i]));
        }
//        exibirValoresVetor(jogos);
        String[] jogosAumentado = aumentarVetor(jogos);
        exibirValoresVetor(jogosAumentado);

        for (int i = 0; i < jogosAumentado.length; i++) {
            if (jogosAumentado[i] == null){
                System.out.println(
                        String.format("Insira um novo jogo para a %d° posição: ", i+1));
                String jogoNovo = input.nextLine();
                jogosAumentado[i] = jogoNovo;
            }
        }
        exibirValoresVetor(jogosAumentado);
    }

    public static String[] aumentarVetor(String[] vetor){
        String[] novoVetor = new String[vetor.length*2];
        for (int i = 0; i < vetor.length; i++) {
            novoVetor[i] = vetor[i];
        }
        return novoVetor;
    }

    public static void exibirValoresVetor(String[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(
                    String.format("Digite o %d elemento: %s", i+1, vetor[i]));
        }
    }
}
