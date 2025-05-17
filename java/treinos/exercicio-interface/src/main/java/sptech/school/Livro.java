package sptech.school;

public class Livro extends Produto{
    private String nome;
    private String autor;
    private String isbn;

    public Livro(String nome, String autor, String isbn) {
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
    }

    public Livro(Integer codigo, Double precoCusto, String nome, String autor, String isbn) {
        super(codigo, precoCusto);
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
    }

    public Double getValorVenda(){
        return this.getPrecoCusto() * 1.10;
    }


    @Override
    public String toString() {
        return "Livro: " +
                "nome: " + nome + '\'' +
                ", autor: " + autor + '\'' +
                ", isbn: " + isbn + '\'' +
                "} " + super.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
