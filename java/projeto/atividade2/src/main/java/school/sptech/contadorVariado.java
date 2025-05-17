package school.sptech;

public class contadorVariado {
    public static void main(String[] args) {
        Double contabilizador = 0.00;
        for (int i = 0; contabilizador < 4.95; i++ ){
            contabilizador += 0.15;
            System.out.printf("%.2f \n",contabilizador);
        }
    }
}
