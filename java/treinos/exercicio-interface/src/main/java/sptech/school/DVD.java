package sptech.school;

public class DVD extends Produto{
    private String nome;
    private String gravadora;

    public DVD(String nome, String gravadora) {
        this.nome = nome;
        this.gravadora = gravadora;
    }

    public DVD(Integer codigo, Double precoCusto, String nome, String gravadora) {
        super(codigo, precoCusto);
        this.nome = nome;
        this.gravadora = gravadora;
    }

    public Double getValorVenda(){
        return this.getPrecoCusto() * 1.20;
    }

    @Override
    public String toString() {
        return "DVD: " +
                "nome: " + nome + '\'' +
                ", gravadora: " + gravadora + '\'' +
                "} " + super.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }
}
