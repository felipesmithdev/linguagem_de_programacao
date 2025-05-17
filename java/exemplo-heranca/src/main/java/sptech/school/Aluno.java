package sptech.school;

public class Aluno {
    private Integer ra;
    protected String nome;

    public Aluno(){

    }
    
    public Aluno(Integer ra, String nome){
        this.ra = ra;
        this.nome = nome;
    }


    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ra=" + ra +
                ", nome='" + nome + '\'' +
                '}';
    }

    public void exibirDados(){
        System.out.println("Aluno: " + this.nome + "\n" + "RA: " + this.ra);
    }
}
