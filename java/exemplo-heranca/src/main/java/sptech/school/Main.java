package sptech.school;

public class Main {
    public static void main(String[] args) {
        Aluno carlos = new Aluno(50000,"Carlos da Silva");
        System.out.println(carlos);
        carlos.exibirDados();

        AlunoGraduacao elise = new AlunoGraduacao(50001, "Elisa", 0.0, 0.0);

        elise.exibirDados();
    }
}