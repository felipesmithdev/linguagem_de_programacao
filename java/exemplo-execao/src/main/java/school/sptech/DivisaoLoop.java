package school.sptech;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoLoop {
    public static void main(String[] args) {

        Integer num1, num2, resultado;
        Boolean fim = false;


        while (!fim) {
            try {
                Scanner leitor = new Scanner(System.in);
                System.out.println("Digite o primeiro número: ");
                num1 = leitor.nextInt();

                System.out.println("Digite o segundo número: ");
                num2 = leitor.nextInt();

                resultado = num1 / num2;
                System.out.println("Então o resultado da divisão é: " + resultado);
                fim = true;

            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números\n");
                System.out.println(e + "\n");
            } catch (ArithmeticException e) {
                System.out.println("O divisor não pode ser 0\n");
                System.out.println(e + "\n");
            }
        }
    }
}
