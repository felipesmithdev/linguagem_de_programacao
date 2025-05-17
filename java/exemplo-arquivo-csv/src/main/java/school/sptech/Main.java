package school.sptech;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Cachorro> listaDogs = new ArrayList<Cachorro>();
        listaDogs.add(new Cachorro("Snoop Dog de Moraes", "Pequeno", 3.0, 1));
        listaDogs.add(new Cachorro("Pitchuca", "Pequeno", 4.0, 2));
        listaDogs.add(new Cachorro("Alemão", "Grande", 5.0, 3));
        listaDogs.add(new Cachorro("Amora moura", "Pequeno", 37.0, 4));
        listaDogs.add(new Cachorro("Lean ux Canvas", "Medio", 97.0, 5));

        for (Cachorro dog: listaDogs){
            System.out.println(dog);
        }

        // Gravar em um arquivo csv
        gravaArquivoCsv(listaDogs, "dogs");
        lerExibirArquivoCsv("dogs");
    }

    public static void gravaArquivoCsv(List<Cachorro> lista, String nomeArquivo){
        FileWriter arq = null; //obj que representa o arquivo
        Formatter saida = null; // obj para escrever no arquivo
        Boolean deuRuim = false;

        // Acrescenta a extensão csv no nome do arquiv
        nomeArquivo += ".csv";

        //Bloco try catch

        try{
            arq = new FileWriter(nomeArquivo); // aqui abre o arquivo nomeArquivo
            saida = new Formatter(arq);
        }
        catch (IOException e){
            System.out.println("Erro ao abrir o arquivo");
            System.exit(1);
        }

        //Bloco try catch para escrever e fechar o arquivo
        try{
            //Grava o cabeçalho do arquivo
            saida.format("ID;NOME;PORTE;PESO\n");

            for (Cachorro dog: lista){
                saida.format("%d; %s; %s; %.1f\n", dog.getId(), dog.getNome(), dog.getPorte(), dog.getPeso());
            }
        }
        catch(FormatterClosedException e){
            System.out.println("Erro ao gravar no arquivo");
            e.printStackTrace();
            deuRuim = true;
        }
        finally{
            saida.close();
            try {
                arq.close();
            }
            catch (IOException e){
                System.out.println("Erro ao fechar o arquivo");
                deuRuim = true;
            }

            if (deuRuim){
                System.exit(1);
            }
        }


    }
    public static void lerExibirArquivoCsv(String nomeArquivo) {
        FileReader arq = null;
        Scanner entrada = null;
        Boolean deuRuim = false;

        nomeArquivo += ".csv";

        try {
            arq = new FileReader(nomeArquivo);
            entrada = new Scanner(arq).useDelimiter(";|\\n");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao existente");
            System.exit(1);
        }

        //Bloco try catch para ler e fechar o arquivo

        try {
            Boolean cabecalho = true;
            while(entrada.hasNext()){
                if (cabecalho){
                    String tupla1 = entrada.next();
                    String tupla2 = entrada.next();
                    String tupla3 = entrada.next();
                    String tupla4 = entrada.next();

                    System.out.printf("%4s %-19s %-9s %4s\n", tupla1, tupla2, tupla3, tupla4);
                    cabecalho = false;

                } else {
                    Integer id = entrada.nextInt();
                    String nome = entrada.next();
                    String porte = entrada.next();
                    Double peso = entrada.nextDouble();

                    System.out.printf("%4d %-19s %-9s %-4.1f\n", id, nome, porte, peso);
                }
            }
        }
        catch (NoSuchFieldError e){
            System.out.println("Arquivo com problema");
            deuRuim = true;
        }
        catch (IllegalStateException e){
            System.out.println("Arquivo com problema");
            deuRuim = true;
        }
        finally{
            entrada.close();
            try {
                arq.close();
            }
            catch (IOException e){
                System.out.println("Erro ao fechar o arquivo");
                deuRuim = true;
            }

            if (deuRuim){
                System.exit(1);
            }
        }
    }

}
