package sptech.school;

public class Alimento extends Produto{

    private Integer quantVitamina;

    public Alimento(){

    }

    public Alimento(Integer quantVitamina) {
        this.quantVitamina = quantVitamina;
    }

    public Alimento(Integer codigo, String descricao, Double preco, Integer quantVitamina) {
        super(codigo, descricao, preco);
        this.quantVitamina = quantVitamina;
    }


    // implementacao

    @Override
    public Double getValorTributo() {
        return super.getPreco() * 0.15;
    }

    @Override
    public String toString() {
        return "Alimento" + "\nquantVitamina: " + quantVitamina + super.toString();
    }
}
