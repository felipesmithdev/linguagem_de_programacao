package school.sptech;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionAssinatura {

    public static void main(String[] args) {

        try {
            leitura();
        }
        catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
            e.printStackTrace();
        }
    }

    public static void leitura() throws FileNotFoundException {
        FileInputStream arquivo = new FileInputStream("arquivo.txt");
    }
}
