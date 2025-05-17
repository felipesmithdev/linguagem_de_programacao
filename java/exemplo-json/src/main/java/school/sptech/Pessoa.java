package school.sptech;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true )
public class Pessoa {
    @JsonProperty("name")
    private String nome;

    @JsonProperty("document")
    private String cpf;

    public Pessoa(){
    }
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;

    }

    @Override
    public String toString() {
        return "nome= " + nome + '\'' +
                ", cpf='" + cpf + '\'';
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
