package sptech.school;

public class Engenheiro extends Funcionario{

    private Double salario;

    public Engenheiro(Double salario) {
        this.salario = salario;
    }

    public Engenheiro() {
    }
    
    public Engenheiro(String cpf, String nome, Double salario) {
        super(cpf, nome);
        this.salario = salario;
    }

    @Override
    public Double calcSalario(){
        return this.salario;
    }

    @Override
    public String toString() {
        return "ENGENHEIRO || " + super.toString();
    }
}
