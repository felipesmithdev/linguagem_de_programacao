package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Grupo {

    private String nome;
    private List<Contato> contatos;

    public Grupo(String nome){
        this.nome = nome;
        this.contatos = new ArrayList<Contato>();
    }

    public void adicionar(Contato contato){
        this.contatos.add(contato);
    }

    public void remover(Contato contato){
        this.contatos.remove(contato);
    }

    public void mostrarContato(){
        for (Contato contato: contatos){
            System.out.println(contato);
        }
    }

    @Override
    public String toString() {
        return "nome: " + nome + " || contatos: " + contatos;
    }
}
