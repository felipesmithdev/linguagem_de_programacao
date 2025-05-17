package sptech.school.data;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class ExemploData {

    public static void main(String[] args) {

        /*
            A classe `LocalDate` representa uma data sem a hora.
            A classe `LocalDateTime` inclui data e hora.
            Ambas fazem parte da API de data e tempo introduzida no Java 8,
            substituindo as classes mais antigas como `Date` e `Calendar`
            com uma abordagem mais intuitiva e imutável.
        */

        // Define um formatador para exibir a data no formato "dd/MM/yyyy"
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Obtém a data atual no sistema
        LocalDate dataAtual = LocalDate.now();

        // Cria uma data específica (11 de junho de 1993)
        LocalDate outraData = LocalDate.of(1993, 6, 11);

        // Exibe a outra data
        System.out.println("Outra data:");
        System.out.println(outraData);
        System.out.println("-".repeat(10));

        // Verifica se a data atual é posterior à data específica
        if (dataAtual.isAfter(outraData)) {
            System.out.println("A data atual é posterior à data 11/06/1993");
        }

        // Verifica se a data atual é anterior à data específica
        if (dataAtual.isBefore(outraData)) {
            System.out.println("A data atual é anterior à data 11/06/1993");
        }

        // Obtém o dia da semana da data atual
        DayOfWeek diaDaSemana = dataAtual.getDayOfWeek();
        System.out.println("Dia da semana atual:");
        System.out.println(diaDaSemana);

        // Obtém o mês da data atual
        Month mes = dataAtual.getMonth();

        // Obtém o nome do mês em português
        String mesEmPtBr = mes.getDisplayName(TextStyle.FULL, Locale.forLanguageTag("pt-BR"));
        System.out.println("Mês atual em português:");
        System.out.println(mesEmPtBr);
        System.out.println("-".repeat(10));

        // Formata a data atual no padrão definido anteriormente (dd/MM/yyyy)
        String dataFormatada = formatador.format(dataAtual);

        // Obtém o dia do mês da data atual
        Integer diaDoMes = dataAtual.getDayOfMonth();
        System.out.println("Dia do mês atual: %s".formatted(diaDoMes));

        // Exibe a data atual formatada
        System.out.println("Data atual formatada:");
        System.out.println(dataFormatada);

        /*
            Os dias da semana são numerados de 1 a 7, onde:
            1 - Segunda-feira
            7 - Domingo
        */
        Integer diaNumerico = dataAtual.getDayOfWeek().getValue();

        System.out.println("Dia numérico da semana: %d".formatted(diaNumerico));

        // Exemplo de uso de switch para exibir mensagens com base no dia da semana
        switch (diaNumerico) {
            case 1:
                System.out.println("Segundou...");
                break;
            case 2:
                System.out.println("Terçou...");
                break;
            case 3:
                System.out.println("Meião da semana...");
                break;
            case 4:
                System.out.println("Quinta, quase lá...");
                break;
            case 5:
                System.out.println("Sextouuu...");
                break;
            case 6:
                System.out.println("Sabadaço...");
                break;
            case 7:
                System.out.println("Domingou...");
                break;
            default:
                System.out.println("Dia inválido");
        }

        // Obtém a data e a hora atuais
        LocalDateTime dataHoraAtual = LocalDateTime.now();

        // Exibe a data e a hora atuais
        System.out.println("Data e hora atuais:");
        System.out.println(dataHoraAtual);
    }
}
