package school.sptech;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("04242029", "Felipe", 9.0, 8.0);
        Aluno aluno2 = new Aluno("04242030", "Kaique", 4.0, 2.0);
        Aluno aluno3 = new Aluno("04242031", "Manuella", 10.0, 8.0);

        Secretaria secretaria = new Secretaria();

        secretaria.registraPagamento(aluno1);
        secretaria.registraAtrasoPag(aluno2);
        secretaria.registraCancelamento(aluno3);

        secretaria.verificaAprovacaoAluno(aluno1);
        secretaria.verificaAprovacaoAluno(aluno2);
        secretaria.verificaAprovacaoAluno(aluno3);

        secretaria.exibirRelatorio();

    }
}
