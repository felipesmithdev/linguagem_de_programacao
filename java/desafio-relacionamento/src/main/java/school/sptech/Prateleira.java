package school.sptech;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Prateleira {

    private List<Livro> livros;
    private Integer limite;
    private Double peso; // Peso em gramas da prateleira

    public Prateleira(Integer limite, Double peso){
        this.livros = new ArrayList<Livro>();
        this.limite = limite;
        this.peso = peso;
    }

    public void adicionarLivro(Livro livro){
        if (livros.size() >= limite){
            System.out.println("Limite de livros excedidos");
        } else {
            livros.add(livro);
            this.peso += livro.calcularPeso();
        }
    }

    public void removerLivro(String codigo){
        int indiceDoLivro = -1;
        for (int i = 0; i < livros.size(); i++) {
            Livro livroAtual = this.livros.get(i);
            if (livroAtual.getCodigo().equals(codigo)){
                indiceDoLivro = i;
            }
        }
        this.livros.remove(indiceDoLivro);
    }

    public Integer quantidadeLivros(){
        return this.livros.size();
    }

    public Double getPesoTotal(){
        return this.peso;
    }

    public Livro getLivroPorNome(String nome){
        int inicio = 0;
        int fim = livros.size() -1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (nome.equals(livros.get(meio).getNome())) {
                return livros.get(meio);
            } else if (nome.compareTo(livros.get(meio).getNome()) > 0) {
                inicio = meio + 1;
            } else if (nome.compareTo(livros.get(meio).getNome()) < 0) {
                fim = meio - 1;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Prateleira{" +
                "livros=" + livros +
                ", limite=" + limite +
                ", peso=" + peso +
                '}';
    }
}
