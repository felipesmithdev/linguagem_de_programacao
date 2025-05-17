package sptech.school;

public class Main {
    public static void main(String[] args) {

        Cofrinho lula = new Cofrinho();
        lula.dono = "Lula";
        lula.depositar(129.12);
        Double convertido = lula.sacudir();
        System.out.printf("%.2f \n", convertido);

        Cofrinho bolsonaro = new Cofrinho();
        bolsonaro.dono = "Bolsonaro";
        bolsonaro.saldo = 13.24;

        System.out.println(lula.isMaiorQue(bolsonaro));
    }
}