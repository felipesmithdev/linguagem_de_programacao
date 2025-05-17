package school.sptech;

public class TestePedido {
    public static void main(String[] args) {

        Pedido pedido01 = new Pedido("99900", "Notebook Ruim", 5, 4000.00);
        Pedido pedido02 = new Pedido("99901", "Camiseta do Palmeiras", 10, 380.00);
        Pedido pedido03 = new Pedido("99902", "Mouse Gamer", 2, 300.00);

        Loja atacadao = new Loja();

        atacadao.cancelarPedido(pedido01);
        atacadao.aplicarPromocao(pedido02);
        atacadao.aplicarDesconto(pedido02, 20);
        atacadao.aplicarDesconto(pedido03, 10);

        atacadao.finalizarPedido(pedido01);
        atacadao.finalizarPedido(pedido02);
        atacadao.finalizarPedido(pedido03);

        atacadao.exibirRelatorio();
    }
}
