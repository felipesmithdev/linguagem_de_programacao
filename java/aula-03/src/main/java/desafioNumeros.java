import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class desafioNumeros {
    public static void main(String[] args) {
        List<Integer> numerosInteiros = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Integer numeroUsuario = null;
        String somentePares = "";
        String somenteImpares = "";
        Integer soma = 0;
        Integer maior = 0;
        Integer menor = 0;
        Boolean ativo = true;

        System.out.println("Informe o primeiro número:");
        numeroUsuario = input.nextInt();
        menor = numeroUsuario;
        if (numeroUsuario != 0) {
            numerosInteiros.add(numeroUsuario);
            while(ativo) {
                Integer numeroAtual = numeroUsuario;
                if (numeroAtual % 2 == 0) {
                    somentePares += numeroAtual + ",";
                } else {
                    somenteImpares += numeroAtual + ",";
                }
                if (numeroAtual > maior) {
                    maior = numeroAtual;
                }
                if (numeroAtual < menor) {
                    menor = numeroAtual;
                }
                soma += numeroAtual;
                System.out.println("Insira mais um número: ");
                numeroUsuario = input.nextInt();
                numerosInteiros.add(numeroUsuario);
                if (numeroUsuario == 0){
                    ativo = false;
                    System.out.println("Números pares: " + somentePares + "\nNúmeros impares: " + somenteImpares +
                            "\nSoma dos números: " + soma + "\nMenor número: " + menor + "\nMaior número: " + maior);
                }

            }
        } else {
            System.out.println("Valor invalido");
        }

    }
}
