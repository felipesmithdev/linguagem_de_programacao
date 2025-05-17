package school.sptech;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Double valorUnitario = 0.0;
        Integer quantidadeVendida = 0;
        Double totalProduto = 0.0;
        Double valorPago = 0.00;
        Double troco = 0.0;
        Scanner leitor = new Scanner(System.in);
        Boolean validar = true;

        do {
            System.out.println("Insira o valor do produto: ");
            valorUnitario = leitor.nextDouble();
            if (valorUnitario >= 0){
                validar = false;
            } else {
                System.out.println("Por favor, insira um valor válido");
                validar = true;
            }
        } while (validar);

        do {
            System.out.println("Insira a quantidade de produtos vendidos: ");
            quantidadeVendida = leitor.nextInt();
            if (quantidadeVendida > 0){
                validar = false;
            } else {
                System.out.println("Por favor, insira uma quantidade válida");
                validar = true;
            }
        } while (validar);

        totalProduto = valorUnitario * quantidadeVendida;

        do {
            System.out.println("Insira o valor pago pelo cliente: ");
            valorPago = leitor.nextDouble();
            if (valorPago >= totalProduto){
                validar = false;
            } else {
                System.out.println("Quantidade insuficiente, coloque mais dinheiro");
                validar = true;
            }
        } while (validar);
        troco = valorPago - totalProduto;
        System.out.printf("Seu troco será de R$%.2f ", troco);


    }
}
