package school.sptech;

import java.util.Random;
import java.util.Scanner;

public class sorteio {
    public static void main(String[] args) {
        Integer numeroEscolhido = 0;
        Integer numeroSorteado = 0;
        Integer numerosPares = 0;
        Integer numerosImpares = 0;
        Integer posicao = 0;
        Integer contador = 0;
        Scanner leitor = new Scanner(System.in);
        Random random = new Random();

        do {
            System.out.println("Informe o número desejado: ");
            numeroEscolhido = leitor.nextInt();
        } while (numeroEscolhido < 1 || numeroEscolhido > 100);

        while (contador < 200){
            numeroSorteado = random.nextInt(100) + 1;
            if (numeroSorteado % 2 == 0){
                numerosPares ++;
            } else {
                numerosImpares ++;
            }
            if (numeroSorteado.equals(numeroEscolhido) && posicao.equals(0)){
                posicao = contador;
            }
                contador ++;

        }
        System.out.println("Posição em que o número foi sorteado: "+ posicao + "°\n" + "Total pares sorteados: " + numerosPares +"\n" + "Total impares sorteados: " + numerosImpares);
    }
}
