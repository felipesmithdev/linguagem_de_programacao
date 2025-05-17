package sptech.school;

import java.util.List;

public class Empresa {
    private String nome;
    private String cnpj;
    private List<Funcionario> funcionarios;

    public void adicionarFuncionario(Funcionario funcionario){
        if (funcionario == null){
            return;
        }

        for (Funcionario f: funcionarios){
            if (f.getCpf().equalsIgnoreCase(funcionario.getCpf())){
                System.out.println("Cpf já existente");
                return;
            }
        }

        this.funcionarios.add(funcionario);
    }



}
