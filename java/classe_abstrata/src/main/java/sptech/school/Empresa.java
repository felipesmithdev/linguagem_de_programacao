package sptech.school;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private List<Funcionario> funcionarios;

    public Empresa(){
        funcionarios = new ArrayList<Funcionario>();
    }

    public Empresa(String nome) {
        this();
        this.nome = nome;
    }

    public void adicionaFunc(Funcionario f){
        funcionarios.add(f);
    }

    public void exibeTodos(){
        System.out.println("\nFuncionarios");
        for (Funcionario f: this.funcionarios){
            System.out.println(f);
        }
    }

    public void exibeSalario(){
        System.out.println("\nSalarios");
        Double total = 0.0;
        for (Funcionario f: this.funcionarios){
            total += f.calcSalario();
        }
        System.out.println(total);
    }

    public void exibeHorista(){
        System.out.println("\nHoristas");
        for (Funcionario f: this.funcionarios){
            if (f instanceof Horista){
                System.out.println(f);
            }
        }
    }
}
