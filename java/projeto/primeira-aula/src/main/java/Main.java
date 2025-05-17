// Class Declaration
public class Main {

    public static void main(String[] args) {
        // tipo inteiros
        int inteiro = 1;
        long inteiroMaior = 1L;
        byte umByte = 1;
        short umShort = 1;

        // tipo reais
        float umFloat = 1.1f; // 4 bytes
        double umDouble = 1.1; // 8 bytes

        char umChar = 'A';
        boolean umBoolean = false;

        // inteiro weapper
        Byte wByte = 1;
        Short wShort = 1;
        Integer wInteger = 1;
        Long wLong = 1L;
        Float wFloat = 1.1f;
        Double wDouble = 1.1;

        Character wCharacter = 'W';
        Boolean wBoolean = null;

        String texto = "Hello, World!!";

        // System.out.println(texto);

        int numero1 = 1;
        int numero2 = 2;

        boolean teste = numero1 == numero2;
        // System.out.println(teste);

        String texto1 = "Texto";
        String texto2 = "Texto";

        boolean teste1 = texto1.equalsIgnoreCase(texto2);
        // System.out.println(teste1);

        char charNumerico = 65;
        int intNumerico = charNumerico;
        System.out.println(charNumerico);
        
        
        Boolean dorama = false;
        Boolean aliceInBorderland = true;
        if (aliceInBorderland.equals(dorama)){
            System.out.println("Alguém por favor tira minha vida");
        } else {
            System.out.println("EU SOU MUITO FELIZ");
        }


    }

}
