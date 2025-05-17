package school.sptech;

import java.util.Scanner;

public class potencia {
    public static void main(String[] args) {
        Integer base = 0;
        Integer expoente = 0;
        Integer total = 1;
        Scanner leitor = new Scanner(System.in);

        do {
            System.out.println("Informe a base: ");
            base = leitor.nextInt();
            System.out.println("Informe o expoente: ");
            expoente = leitor.nextInt();
            for (int i = 1; i <= expoente; i++) {
            total *= base;
            }
        } while (base < 0 || expoente < 0);

        System.out.println( "Resultado: " + total);


    }
}
