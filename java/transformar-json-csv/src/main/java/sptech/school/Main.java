package sptech.school;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    String caminhoJson = "books.json";
    String caminhoCsv = "Livros.csv";

    transformar(caminhoJson, caminhoCsv);
    }

    public static void transformar(String caminhoJson, String caminhoCsv){
        try {
            ObjectMapper mapper = new ObjectMapper();
            List<Livro> livros = mapper.readValue(new File(caminhoJson), new TypeReference<List<Livro>>() {});
            DecimalFormat decimalFormat = new DecimalFormat("0.00");

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoCsv))){
                writer.write("id,nome,autor,data_publicacao,editora,preco,preco_desconto,nota");
                writer.newLine();

                for (Livro livro: livros){
                    String data = String.format("%02d/%02d/%d", livro.getDay(), livro.getMonth(), livro.getYear());
                    String precoDesconto = decimalFormat.format(livro.getPreco() * 0.9);

                    writer.write(String.format(
                            "%d,\"%s\",\"%s\",%s,\"%s\",%s,%s, %.1f",
                            livro.getId(),
                            livro.getNome(),
                            livro.getAutor(),
                            data,
                            livro.getEditora(),
                            livro.getPreco(),
                            precoDesconto,
                            livro.getRating()
                    ));
                    writer.newLine();
                }
            }
            System.out.println("csv gerado: " + caminhoCsv);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
