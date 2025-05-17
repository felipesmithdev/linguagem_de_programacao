package school.sptech;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Integer num1, num2, resultado;

        try {
            System.out.println("Digite o primeiro número: ");
            num1 = leitor.nextInt();

            System.out.println("Digite o segundo número: ");
            num2 = leitor.nextInt();

            resultado = num1 / num2;
            System.out.println("Então o resultado da divisão é: " + resultado);
        }
        catch (InputMismatchException e){
            System.out.println("Digite apenas números");
            System.out.println(e);
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("O divisor não pode ser 0");
            System.out.println(e);;
            e.printStackTrace();
        }
    }
}
