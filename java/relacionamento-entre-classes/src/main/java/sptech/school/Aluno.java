package sptech.school;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String ra;
    private String nome;
    private List<Double> notas;


    public Aluno(String ra, String nome){
        this.ra = ra;
        this.nome = nome;
        this.notas = new ArrayList<Double>();
    }

    public String getRa() {
        return ra;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarNota(Double nota){
        this.notas.add(nota);
    }

    public Double calcularMedia(){
        if (notas.isEmpty()){
            return 0.0;
        } else {
            Double valorNota = 0.0;
            for (Double n : notas) {
                valorNota += n;
            }
            Double media = valorNota / notas.size();

            return media;
        }
    }




}
