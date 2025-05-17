package school.sptech;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("pessoas.json");
        }
        catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
            System.exit(1);
        }

        PessoaMapper pessoaMapper = new PessoaMapper();
        List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

        try {
            listaPessoas = pessoaMapper.mapearPessoas(inputStream);
        }
        catch (IOException e){
            System.out.println("Erro ao mapear o json");
            e.printStackTrace();
        }
        finally {
            try {
                inputStream.close();
            }
            catch (IOException e ){
                System.out.println("Erro ao fechar o json");
            }
        }
        for (Pessoa p: listaPessoas){
            System.out.println(p);
        }
    }
}