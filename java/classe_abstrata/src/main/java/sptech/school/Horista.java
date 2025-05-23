package sptech.school;

public class Horista extends Funcionario{
    private Integer qtdHora;
    private Double valorHora;

    public Horista(String cpf, String nome, Integer qtdHora, Double valorHora) {
        super(cpf, nome);
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }

    @Override
    public Double calcSalario(){
        return valorHora * qtdHora;
    }

    @Override
    public String toString() {
        return "HORISTA || " + super.toString();
    }
}
