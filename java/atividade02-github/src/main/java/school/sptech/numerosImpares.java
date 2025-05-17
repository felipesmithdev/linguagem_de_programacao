package school.sptech;

public class numerosImpares {

    public static void main(String[] args) {
        Integer numeroAtual = 0;
        for (int i = 0; i <= 90; i++){
            if (i % 2 == 0){
                // apenas passe direto parceiro
            } else {
                numeroAtual = i;
                System.out.println(numeroAtual);
            }
        }
    }
}
