package school.sptech;

public class Pedido {
    private String codigo;
    private String produto;
    private Integer quantidade;
    private Double valorUnitario;
    private Double valorComDesconto;
    private Boolean itemPromocional = false;
    private Boolean cancelado = false;


    public Pedido(String codigo, String produto, Integer quantidade, Double valorUnitario) {
        this.codigo = codigo;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public Double calcularValorTotal(){
        Double total = (this.valorUnitario * this.quantidade);
        return total;
    }

    public Boolean getItemPromocional() {
        return itemPromocional;
    }

    public Boolean getCancelado() {
        return cancelado;
    }

    public String getProduto() {
        return produto;
    }

    public String getCodigo() {
        return codigo;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getValorComDesconto() {
        return valorComDesconto;
    }

    public void setItemPromocional(Boolean itemPromocional) {
        this.itemPromocional = itemPromocional;
    }

    public void setCancelado(Boolean cancelado) {
        this.cancelado = cancelado;
    }

    public void setValorComDesconto(Double valorComDesconto) {
        this.valorComDesconto = valorComDesconto;
    }


}
