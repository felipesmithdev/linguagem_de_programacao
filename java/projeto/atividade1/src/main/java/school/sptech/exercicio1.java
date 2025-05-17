package school.sptech;

import java.util.Scanner;

public class exercicio1 {
public static void main(String[] args) {
    Integer filhosAteTresAnos = 0;
    Integer filhosAte16Anos = 0;
    Integer filhosAte18Anos = 0;
    Double valor3Anos = 25.12;
    Double valor16Anos = 15.88;
    Double valor18Anos = 12.44;
    Double valorTotalBolsa = 0.0;

    Scanner leitor = new Scanner(System.in);
    Boolean validar = true;
    do {
        System.out.println("Informe quantos filhos entre 0 e 3 anos você possui:");
        filhosAteTresAnos = leitor.nextInt();

        if (filhosAteTresAnos >= 0 && filhosAteTresAnos < 20){
            validar = false;
        } else {
            System.out.println("Insira valores válidos");
        }
    } while(validar);

    do{
        System.out.println("Informe quantos filhos entre 4 e 16 anos você possui:");
        filhosAte16Anos = leitor.nextInt();

        if (filhosAte16Anos >= 0 && filhosAte16Anos < 20){
            validar = false;
        } else {
            System.out.println("Insira valores válidos");
            validar = true;
        }
    } while (validar);

    do {
        System.out.println("Informe quantos filhos entre 17 e 18 anos você possui:");
        filhosAte18Anos = leitor.nextInt();

        if (filhosAte18Anos >= 0 && filhosAte18Anos < 20){
            validar = false;
        } else {
            System.out.println("Insira valores válidos");
            validar = true;
        }
    } while(validar);
    Integer totalQuantidadeFilhos = filhosAteTresAnos + filhosAte16Anos + filhosAte18Anos;
    valorTotalBolsa = (valor3Anos * filhosAteTresAnos) + (valor16Anos * filhosAte16Anos) + (valor18Anos * filhosAte18Anos);

    System.out.printf("Você tem um total de %d filhos e vai receber R$%.2f de bolsa",totalQuantidadeFilhos,valorTotalBolsa);




}
}
