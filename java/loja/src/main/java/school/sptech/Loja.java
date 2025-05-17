package school.sptech;

public class Loja {
    private Integer pedidosRealizados;
    private Integer descontosAplicados;
    private Integer pedidosCancelados;

    public Loja() {
        this.pedidosRealizados = 0;
        this.descontosAplicados = 0;
        this.pedidosCancelados = 0;
    }

    public void aplicarPromocao(Pedido pedido){
        pedido.setItemPromocional(true);
        System.out.println("O produto " + pedido.getProduto() + " está em promoção");
    }

    public void cancelarPedido(Pedido pedido){
        pedido.setCancelado(true);
        this.pedidosCancelados += 1;
        System.out.println("O pedido de código "+ pedido.getCodigo() +" foi cancelado");
    }

    public void aplicarDesconto(Pedido pedido, Integer desconto){
        Double desc = desconto / 100.0;

        if (pedido.getItemPromocional()) {
            Double total = pedido.getValorUnitario() - (pedido.getValorUnitario() * desc);
            pedido.setValorComDesconto(total);
            this.descontosAplicados += 1;
            System.out.println("Foi aplicado " + desconto + "% de desconto ao pedido de código " + pedido.getProduto() + ".");
        } else {
            System.out.println("Pedido não elegível para desconto, operação não finalizada.");
        }
    }

    public void finalizarPedido(Pedido pedido){
        Double total = pedido.getValorComDesconto();
        String itemPromocao;

        if (pedido.getItemPromocional()) {
            itemPromocao = "Sim";
        }else{
            itemPromocao = "Não";
        }

        if (pedido.getValorComDesconto() == null || pedido.getValorComDesconto() == 0.0){
            total = pedido.getValorUnitario();
        }

        if (pedido.getCancelado()) {
            System.out.println("\nPEDIDO CANCELADO, NÃO É POSSÍVEL REALIZAR A OPERAÇÃO" + "\n\n");
        }else {
            System.out.printf("---------------" + " PEDIDO " + "---------------" + "\n" +
                    "Código: "+ pedido.getCodigo() + "\n" +
                    "Item: "+ pedido.getProduto() + "\n" +
                    "Valor unitário: "+ pedido.getValorUnitario()+ "\n" +
                    "Quantidade: "+ pedido.getQuantidade()+ "\n" +
                    "Valor Total: "+ pedido.calcularValorTotal()+ "\n" + "\n" +
                    "Item promocional: "+ itemPromocao+ "\n" +
                    "Valor com desconto: "+ pedido.getValorComDesconto() + "\n" + "\n" +
                    "TOTAL A SER PAGO: "+ total + "\n\n");
        }
    }

    public void exibirRelatorio(){
        System.out.println("-------------------" + " PEDIDO " + "-------------------"+ "\n" +
                "Pedidos Realizados: " + this.pedidosRealizados + "\n" +
                "Descontos aplicados: " + this.descontosAplicados + "\n" +
                "Pedidos cancelados: " + this.pedidosCancelados);
    }



}
