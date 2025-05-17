package school.sptech;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        Integer tempoAquecimento = 0;
        Integer tempoAerobico = 0;
        Integer tempoMusculacao = 0;
        Integer caloriaAquecimento = 12;
        Integer caloriaAerobico = 20;
        Integer caloriaMusculacao = 25;
        Integer totalMinutos = 0;
        Integer totalCaloria = 0;
        Scanner leitor = new Scanner(System.in);
        Boolean validar = true;
        do {
            System.out.println("Informe a quantidade de tempo (em minutos) em que passou no aquecimento: ");
            tempoAquecimento = leitor.nextInt();
            if (tempoAquecimento >= 0){
                validar = false;
            } else {
                System.out.println("Por favor, digite um valor válido");
                validar = true;
            }
        } while(validar);

        do {
            System.out.println("Informe a quantidade de tempo (em minutos) em que passou em exercícios aeróbicos: ");
            tempoAerobico = leitor.nextInt();
            if (tempoAerobico >= 0){
                validar = false;
            } else {
                System.out.println("Por favor, digite um valor válido");
                validar = true;
            }
        } while(validar);

        do {
            System.out.println("Informe a quantidade de tempo (em minutos) em que passou em exercícios de musculação: ");
            tempoMusculacao = leitor.nextInt();
            if (tempoMusculacao >= 0){
                validar = false;
            } else {
                System.out.println("Por favor, digite um valor válido");
                validar = true;
            }
        } while(validar);

        totalCaloria = (tempoAquecimento * caloriaAquecimento) + (tempoAerobico * caloriaAerobico) + (tempoMusculacao * caloriaMusculacao);
        totalMinutos = tempoAerobico + tempoAquecimento + tempoMusculacao;

        System.out.println("Olá, Jorge. Você fez um total de "+ totalMinutos +" minutos de exercícios e perdeu cerca de "+ totalCaloria +" calorias.");
    }
}
