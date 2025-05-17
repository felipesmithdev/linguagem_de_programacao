import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lista {
    public static void main(String[] args) {
        List<String> jogos = new ArrayList<>();
        Scanner input = new Scanner(System.in);
//        List<String> jogos = new ArrayList<>(50);
        List<Int> estoiloco = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println(
                    String.format("Digite o %d° jogo: ", i+1));
            jogos.add(input.nextLine());
        }
        System.out.println(jogos.size());
        System.out.println(jogos);

        jogos.add(2, "LoL");
        jogos.set(2,"lol");

        System.out.println("A lista está vazia ? " + jogos.isEmpty()); //vazia ou nao
        jogos.get(0); //serve para pegar algo da lista
        System.out.println("A letra 'A' está na lista ? " + jogos.contains("A")); // se contem
        System.out.println("Indice da letra 'e': " + jogos.indexOf("e")); // indice do objeto
        System.out.println(jogos);

        for (String jogo : jogos){
            System.out.println(jogo);
        }
    }
}
