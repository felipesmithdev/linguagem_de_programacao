package school.sptech;

import com.github.javafaker.Faker;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Empresa> empresas = new ArrayList<Empresa>();
        List<Empresa> empresasAcento = new ArrayList<Empresa>();
        Faker faker = new Faker();
        List<String> mercado = List.of("Técnologia", "Agricultura", "Varejo", "Automóvel", "Construção");

        for (int i = 0; i < 10; i++) {
            int idEmpresa = i + 1;
            String nome = faker.company().name();
            String cnpj = faker.number().digits(14);
            Double patrimonio = faker.number().randomDouble(2, 300000, 5000000);
            String paisOrigem = faker.country().countryCode3().toUpperCase();
//            String segmento = mercado.get(faker.number().numberBetween(0,4));
            String segmento = faker.company().industry();
            Integer unidades = faker.number().numberBetween(1,100);

            empresas.add(new Empresa(idEmpresa, nome, cnpj, patrimonio, paisOrigem, segmento, unidades));
            empresasAcento.add(new Empresa(idEmpresa, "ÈEEÈÈÈÈÈÊÇE", cnpj, patrimonio, paisOrigem, segmento, unidades));
        }

        Empresa.ordenarComecandoDoMaior(empresas);
//        Empresa.ordenarDecrescente(empresas);
//        for (int i = 0; i <= empresas.size() -1 ; i++) {
//            System.out.println(empresas.get(i));
//        }


//        gravarArquivoCsv(empresas, "empresas");
        gravaArquivoCsvComAcento(empresasAcento, "empresasAcento");
//        lerExibirArquivoCsv("empresasAcento");

        lerArquivoCsvSplit("empresas");
    }
    public static void gravarArquivoCsv(List<Empresa> lista, String nomeArquivo){
        FileWriter arq = null;
        Formatter saida = null;
        Boolean deuRuim = false;

        nomeArquivo += ".csv";

        try {
            arq = new FileWriter(nomeArquivo, false);
            saida = new Formatter(arq);
        }
        catch (IOException e) {
            System.out.println("Erro ao abrir o arquivp");
            System.exit(1);
        }

        try {
            saida.format("ID;NOME;CNPJ;PATRIMONIO;PAIS;SEGMENTO;UNIDADES\n");
            for (Empresa e: lista) {
                saida.format("%d;%s;%s;%.2f;%s;%s;%d\n", e.getIdEmpresa(), e.getNome(), e.getCnpj(), e.getPatrimonio(), e.getPaisOrigem(), e.getSegmento(), e.getUnidades());
            }
        }
        catch (FormatterClosedException e){
            System.out.println("Erro ao gravar no arquivo");
            e.printStackTrace();
            deuRuim = true;
        }
        finally {
            saida.close();
            try {
                arq.close();;
            }
            catch (IOException e ){
                System.out.println("Erro ao fechar o arquivo");
                deuRuim = true;
            }

            if (deuRuim){
                System.exit(1);
            }
        }
    }
    public static void lerExibirArquivoCsv(String nomeArquivo){
        FileReader arq = null;
        Scanner entrada = null;
        Boolean deuRuim = false;

        nomeArquivo += ".csv";

        try{
            arq = new FileReader(nomeArquivo);
            entrada = new Scanner(arq).useDelimiter(";|\\n");
        }
        catch (FileNotFoundException e){
            System.out.println("Arquivo não existente");
            System.exit(1);
        }

        try{
            Boolean cabecalho = true;
            while(entrada.hasNext()){
                if (cabecalho){
                    String titulo1 = entrada.next();
                    String titulo2 = entrada.next();
                    String titulo3 = entrada.next();
                    String titulo4 = entrada.next();
                    String titulo5 = entrada.next();
                    String titulo6 = entrada.next();
                    String titulo7 = entrada.next();

                    System.out.printf("%4s %-10s %-19S %-15s %-5s %-35s %-5s\n", titulo1, titulo2, titulo3, titulo4, titulo5, titulo6, titulo7);
                    cabecalho = false;
                } else {
                    Integer id = entrada.nextInt();
                    String nome = entrada.next();
                    String cnpj = entrada.next();
                    Double patrimonio = entrada.nextDouble();
                    String pais = entrada.next();
                    String segmento = entrada.next();
                    Integer unidades = entrada.nextInt();

                    System.out.printf("%4s %-10.5s %-19S %-15s %-5s %-35s %-5s\n", id, nome, cnpj, patrimonio, pais, segmento, unidades);
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
        finally {
            entrada.close();
            try{
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

    public static void gravaArquivoCsvComAcento(List<Empresa> lista, String nomeArq){
//        FileWriter arq = null;
        OutputStreamWriter saida = null;
        Boolean deuRuim = false;
        nomeArq += ".csv";

        try{
            saida = new OutputStreamWriter(new FileOutputStream(nomeArq), StandardCharsets.UTF_8);
        }
        catch (IOException e){
            System.out.println("Erro ao exibir o arquivo");
            System.exit(1);
        }

        try{
            saida.append("ID;NOME;CNPJ;PATRIMONIO;PAIS;SEGMENTO;UNIDADES\n");
            for (Empresa e: lista) {
                saida.write(String.format("%d;%s;%s;%.2f;%s;%s;%d\n", e.getIdEmpresa(), e.getNome(), e.getCnpj(), e.getPatrimonio(), e.getPaisOrigem(), e.getSegmento(), e.getUnidades()));
            }
        }
        catch (IOException e){
            System.out.println("Erro ao gravar no arquivo");
            e.printStackTrace();
            deuRuim = true;
        }
        finally {
            try {
                saida.close();;
            }
            catch (IOException e ){
                System.out.println("Erro ao fechar o arquivo");
                deuRuim = true;
            }

            if (deuRuim){
                System.exit(1);
            }
        }
    }

    public static void lerArquivoCsvSplit(String nomeArq){
        Reader arq = null;
        nomeArq += ".csv";
        BufferedReader entrada = null;
        List<Empresa> listaLida = new ArrayList<Empresa>();

        try {
            arq = new InputStreamReader(new FileInputStream(nomeArq),"UTF-8" );
            entrada = new BufferedReader(arq);
        }
        catch (IOException e){
            System.out.println("Erro");
            System.exit(1);
        }


        try{
            String[] registro;
            String linha = entrada.readLine();
            registro = linha.split(";");

            System.out.printf("%4s %-10s %-19S %-15s %-5s %-35s %-5s\n", registro[0], registro[1], registro[2], registro[3], registro[4], registro[5], registro[6]);

            linha = entrada.readLine();
            while (linha != null){
                registro = linha.split(";");
                System.out.printf("%4s %-10s %-19S %-15s %-5s %-35s %-5s\n", registro[0], registro[1], registro[2], registro[3], registro[4], registro[5], registro[6]);

                Integer id = Integer.valueOf(registro[0]);
                String nome = registro[1];
                String cnpj = registro[2];
                Double patrimonio = Double.valueOf(registro[3].replace(",", "."));
                String pais = registro[4];
                String segmento = registro[5];
                Integer unidades = Integer.valueOf(registro[6]);
                Empresa empr = new Empresa(id,nome,cnpj,patrimonio,pais,segmento,unidades);

                listaLida.add(empr);

            }
            String linha = entrada.readLine();
        }
        catch (IOException e){
            System.out.println("Erro ao ler do arquivo");
            e.printStackTrace();
        }
        finally {
            try{
                entrada.close();
                arq.close();
            }
            catch (IOException e){
                System.out.println("Erro ao fechar");

            }
        }
        System.out.println("\nLista criada com a leitura do arquivo");
        for (Empresa empr: listaLida){
            System.out.println(empr);
        }

    }


}