package school.sptech;

import java.util.Random;

public class acumulador {
    public static void main(String[] args) {
        Integer numeroSorteado = 0;
        Integer somaDosNumerosSorteados = 0;
        Random aleatorio = new Random();

        do {
            numeroSorteado = aleatorio.nextInt(11);
            System.out.println("Número sorteado: " + numeroSorteado);
            somaDosNumerosSorteados += numeroSorteado;
        } while (!numeroSorteado.equals(0));
        System.out.println("A soma dos números sorteados é de: " + somaDosNumerosSorteados);
    }
}
