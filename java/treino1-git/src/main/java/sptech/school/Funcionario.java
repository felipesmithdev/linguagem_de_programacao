package sptech.school;

import java.time.LocalDate;

public class Funcionario {

    private Integer id;
    private String nome;
    private String cpf;
    private String cargo;
    private Double salario;
    private LocalDate dataAdmissao;

    public Funcionario(){

    }

    public Funcionario(Integer id, String nome, String cpf, String cargo, Double salario, LocalDate dataAdmissao) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public void promover(String novoCargo, Double novoSalario){
        
    }
}
