package school.sptech;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

    public static void main(String[] args) {

        try {
            FileInputStream arquivo = new FileInputStream("arquivo.txt");
        }
        catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
            e.printStackTrace();
        }
    }
}
