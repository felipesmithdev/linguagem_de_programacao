package sptech.school;

public abstract class Funcionario {

    private String cpf;
    private String nome;

    public Funcionario(){

    }

    public Funcionario(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "CPF: " + cpf + " NOME: " + nome + " SALARIO: " + calcSalario();
    }

    public abstract Double calcSalario();

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
