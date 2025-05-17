package sptech.school;

public abstract class Produto implements Tributavel {

//    atributos
    private Integer codigo;
    private String descricao;
    private Double preco;

//    construtores
    public Produto(){

    }

    public Produto(Integer codigo, String descricao, Double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

//    metodos

    @Override
    public String toString() {
        return "\nProduto- " + "\ncodigo: " + codigo + "\ndescricao: " + descricao + "\npreco: " + getPreco() + "\ntributo: " + getValorTributo() + "\n\n";
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
