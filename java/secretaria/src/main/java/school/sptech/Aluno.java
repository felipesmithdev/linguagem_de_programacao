package school.sptech;

public class Aluno {
    private String ra;
    private String nome;
    private Boolean ativo = true;
    private Boolean inadimplente = false;
    private Double nota1;
    private Double nota2;

    public Aluno (String ra, String nome, Double nota1, Double nota2){
        this.ra = ra;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Double calcularMedia(){
        Double media = (nota1 * 0.4) + (nota2 * 0.6);
        return media;
    }

    public String getNome() {
        return nome;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public String getRa() {
        return ra;
    }

    public Boolean getInadimplente() {
        return inadimplente;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public void setInadimplente(Boolean inadimplente) {
        this.inadimplente = inadimplente;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota1() {
        return nota1;
    }


    public Double getNota2() {
        return nota2;
    }

}
