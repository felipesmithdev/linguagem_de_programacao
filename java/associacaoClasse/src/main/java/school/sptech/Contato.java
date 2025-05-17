package school.sptech;

public class Contato {

    private String nome;
    private String telefone;
    private Boolean bloqueado = false;


    public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public void bloquear(){
        this.bloqueado = true;
    }

    public void desbloquear(){
        this.bloqueado = false;
    }


    @Override
    public String toString() {
        return "\n nome: " + nome +" || telefone: " + telefone;
    }
}
