package school.sptech;

public class Secretaria {
    private Integer totalInadimplentes;
    private Integer totalCancelamentos;
    private Integer totalPagamentos;

    public Secretaria(){
        this.totalInadimplentes = 0;
        this.totalCancelamentos = 0;
        this.totalPagamentos = 0;
    }

    public void registraPagamento(Aluno aluno){
        aluno.setInadimplente(false);
        totalPagamentos += 1;
        System.out.println("O aluno: " + aluno.getNome() + " de ra " + aluno.getRa() + " está em dia com o pagamento.");
    }

    public void registraAtrasoPag(Aluno aluno){
        aluno.setInadimplente(true);
        totalInadimplentes += 1;
        System.out.println("O aluno: " + aluno.getNome() + " de ra " + aluno.getRa() + " está inadimplente");
    }

    public void registraCancelamento(Aluno aluno){
        aluno.setAtivo(false);
        totalCancelamentos += 1;
        System.out.println("O aluno: " + aluno.getNome() + " de ra " + aluno.getRa() + " cancelou a matrícula");
    }

    public void verificaAprovacaoAluno(Aluno aluno){
        String status = "";
        if (aluno.calcularMedia() >= 6 && aluno.calcularMedia() <= 10){
            status = "Aprovado";
        } else if (aluno.calcularMedia() < 6 && aluno.calcularMedia() >= 0){
            status = "Reprovado";
        }

        System.out.println(
                "SITUAÇÃO DO ALUNO - > " + aluno.getAtivo() + "\n" +
                        "RA: " + aluno.getRa() + "\n" +
                        "Nome: " + aluno.getNome() + "\n" +
                        "Nota1: " + aluno.getNota1() + "\n" +
                        "Nota2: " + aluno.getNota2() + "\n" +
                        "Média: " + aluno.calcularMedia() + "\n" +
                        "Status: " + status + "\n" +
                        "Inadimplente: " + aluno.getInadimplente()
        );
    }

    public void exibirRelatorio(){
        System.out.println(
                "------------------ RELATÓRIO ------------------" + "\n" +
                        "Pagamentos realizados: " + this.totalPagamentos + "\n" +
                        "Inadimplentes: " + this.totalInadimplentes + "\n" +
                        "Evasões: " + this.totalCancelamentos
        );
    }



}
