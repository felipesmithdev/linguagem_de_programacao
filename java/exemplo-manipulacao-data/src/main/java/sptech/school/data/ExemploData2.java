package sptech.school.data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class ExemploData2 {
    public static void main(String[] args) {
        // Criando o objeto Scanner para capturar a entrada do usuário via console
        Scanner leitor = new Scanner(System.in);

        // Definindo um formatador para interpretar e exibir a data no formato "dd/MM/yyyy"
        DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Definindo um formatador para interpretar e exibir a data e hora no formato "dd/MM/yyyy HH:mm"
        DateTimeFormatter formatadorDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Solicitando que o usuário digite uma data no formato "dd/MM/yyyy"
        System.out.println("Digite uma data (formato dd/MM/yyyy):");
        LocalDate dataDigitada = LocalDate.parse(leitor.nextLine(), formatadorData);

        // Exibindo a data informada pelo usuário
        System.out.println("A DATA INFORMADA é: ");
        System.out.println(dataDigitada);

        // Obtendo o dia da semana da data informada e formatando o nome do dia em português
        String diaDaSemana = dataDigitada.getDayOfWeek()
                .getDisplayName(TextStyle.FULL, Locale.forLanguageTag("pt-BR"));

        // Exibindo o nome do dia da semana da data informada
        System.out.println("Dia da semana: " + diaDaSemana);

        // Solicitando que o usuário digite a data e hora no formato "dd/MM/yyyy HH:mm"
        System.out.println("Digite uma data e hora (formato dd/MM/yyyy HH:mm):");
        LocalDateTime dataHoraDigitada = LocalDateTime.parse(leitor.nextLine(), formatadorDataHora);

        // Exibindo a data e hora informadas pelo usuário
        System.out.println("A DATA E HORA INFORMADAS são: ");
        System.out.println(dataHoraDigitada.format(formatadorDataHora));

        // Fechando o Scanner (boa prática de programação)
        leitor.close();
    }
}
