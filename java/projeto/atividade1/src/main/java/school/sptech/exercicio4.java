package school.sptech;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        String nome = "";
        Double nota1 = 0.0;
        Double nota2 = 0.0;
        Double media = 0.0;
        Scanner leitor = new Scanner(System.in);
        Boolean validar = true;

        do {
            System.out.println("Informe o nome do aluno: ");
            nome = leitor.nextLine();
            if (nome.equalsIgnoreCase(null) || nome.equalsIgnoreCase("")){
                System.out.println("Digite um nome válido");
                validar = true;
            } else {
                validar = false;
            }
        } while(validar);

        do {
            System.out.println("Digite o valor atribuído à primeira nota: ");
            nota1 = leitor.nextDouble();
            if (nota1 < 0 || nota1 > 10){
                System.out.println("Por favor, informe uma nota válida");
                validar = true;
            } else {
                validar = false;
            }
        } while(validar);

        do {
            System.out.println("Digite o valor atribuído à segunda nota: ");
            nota2 = leitor.nextDouble();
            if (nota2 < 0 || nota2 > 10){
                System.out.println("Por favor, informe uma nota válida");
                validar = true;
            } else {
                validar = false;
            }
        } while(validar);

        media = (nota1 + nota2) / 2;
        System.out.printf("Sua média foi de %.1f",media);


    }
}
