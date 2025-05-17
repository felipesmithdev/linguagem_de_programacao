package school.sptech;

import java.util.Random;
import java.util.Scanner;

public class loteria {
    public static void main(String[] args) {

        Integer numeroEscolhido = 0;
        Integer numeroSorteado = 0;
        Scanner leitor = new Scanner(System.in);
        Integer contador = 0;
        do {
            System.out.println("Informe um número de 0 a 10: ");
            numeroEscolhido = leitor.nextInt();
        } while (numeroEscolhido < 0 || numeroEscolhido > 10);

        do {
            Random aleatorio = new Random();
            numeroSorteado = aleatorio.nextInt(11);
            System.out.println("O numero sorteado foi: " + numeroSorteado);
            contador ++;
        } while(!(numeroSorteado.equals(numeroEscolhido)));

        if (contador <= 3){
            System.out.println("Você é muito sortudo!");
        } else if (contador >= 4 && contador <= 10){
            System.out.println("Você é sortudo");
        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar.");
        }

    }
}
