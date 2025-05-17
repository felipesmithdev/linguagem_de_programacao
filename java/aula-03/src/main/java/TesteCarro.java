public class TesteCarro {
    public static void main(String[] args) {
        carro mcQueen = new carro();

        mcQueen.cor = "Vermelho";
        mcQueen.ligado = false;
        mcQueen.quantidadeCavalo = 9999999;
        mcQueen.placa = "Katchaaauu";
        mcQueen.modelo = "Celta";
        mcQueen.velocidade = 0;
        mcQueen.automatico = true;

        System.out.println(mcQueen);
        mcQueen.ligar();
        mcQueen.acelerar();
        mcQueen.acelerar();
        mcQueen.acelerar();

        mcQueen.reduzir();

        mcQueen.desligar();

        carro mat = new carro();
        System.out.println(mat);
    }
}
