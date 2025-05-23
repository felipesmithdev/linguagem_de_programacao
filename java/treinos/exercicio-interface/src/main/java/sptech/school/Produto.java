package sptech.school;

public abstract class Produto implements Vendavel {
    private Integer codigo;
    private Double precoCusto;

    public Produto(){

    }

    public Produto(Integer codigo, Double precoCusto) {
        this.codigo = codigo;
        this.precoCusto = precoCusto;
    }


    @Override
    public String toString() {
        return "Produto{" +
                "codigo='" + codigo + '\'' +
                ", precoCusto=" + precoCusto +
                '}';
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
}
