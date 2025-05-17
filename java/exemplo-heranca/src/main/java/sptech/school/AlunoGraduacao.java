package sptech.school;

public class AlunoGraduacao extends Aluno{

    // atributos
    private Double notaContinuada;
    private Double notaProjetoIndividual;

    // construtor


//    public AlunoGraduacao(Double notaContinuada, Double notaProjetoIndividual) {
//        this.notaContinuada = notaContinuada;
//        this.notaProjetoIndividual = notaProjetoIndividual;
//    }

    public AlunoGraduacao(Integer ra, String nome, Double notaContinuada, Double notaProjetoIndividual) {
        super(ra, nome);
        this.notaContinuada = notaContinuada;
        this.notaProjetoIndividual = notaProjetoIndividual;
    }

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public void setNotaContinuada(Double notaContinuada) {
        this.notaContinuada = notaContinuada;
    }

    public Double getNotaProjetoIndividual() {
        return notaProjetoIndividual;
    }

    public void setNotaProjetoIndividual(Double notaProjetoIndividual) {
        this.notaProjetoIndividual = notaProjetoIndividual;
    }

    @Override
    public String toString() {
        return "AlunoGraduacao{" +
                "notaContinuada=" + notaContinuada +
                "} " + super.toString();
    }

    @Override
    public void exibirDados(){
        System.out.println("AlunoGraduacao de RA " + this.getRa() + ", nome " + nome  + " Nota continuada " + notaContinuada + " Nota individual " + notaProjetoIndividual);
    }
}
