package school.sptech;

public class Filme {
    private Integer id;
    private String nome;
    private String categoria;
    private Double notaImdb;

    public Filme(Integer id, String nome, String categoria, Double notaImdb){
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.notaImdb = notaImdb;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }
    public String getNomeComBusca(Integer contador) {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getNotaImdb() {
        return notaImdb;
    }

    public void setNotaImdb(Double notaImdb) {
        this.notaImdb = notaImdb;
    }


}
