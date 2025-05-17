package school.sptech;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionTryWithResources {

    public static void main(String[] args) {

        try (FileInputStream arquivo = new FileInputStream("arquivo.txt")) {

        }
        catch (Exception e){
            System.out.println("Arquivo não encontrado");
            e.printStackTrace();
        }
        
    }
}
