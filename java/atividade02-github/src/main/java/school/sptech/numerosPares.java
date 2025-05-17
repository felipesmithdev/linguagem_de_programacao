package school.sptech;

public class numerosPares {
    public static void main(String[] args) {
        Integer contador = 0;
        Integer numeroAtual = 0;

        do {
            if (contador % 2 == 0){
                numeroAtual = contador;
                contador++;
                System.out.println(numeroAtual);
            } else {
                contador++;
            }
        } while(!contador.equals(41));
    }
}
