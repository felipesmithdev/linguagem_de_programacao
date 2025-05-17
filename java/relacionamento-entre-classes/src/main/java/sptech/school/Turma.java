package sptech.school;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private String turma;
    private List<Aluno> alunos;

    public Turma(String turma){
        this.turma = turma;
        this.alunos = new ArrayList<Aluno>();
    }

    @Override
    public String toString() {
        return "turma= " + turma + '\n' +
                "alunos=" + alunos + '\n';
    }

    public void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public Aluno getAlunoPorRa(String ra){
        for (Aluno a: this.alunos){
            if (a.getRa().equals(ra)){
                return a;
            }
        }
        return null;
    }

    public List<Aluno> getAlunoPorNome(String nome){
        List<Aluno> alunosPeloNome = new ArrayList<Aluno>();
        for (Aluno a: this.alunos){
            if (a.getNome().toLowerCase().contains(nome)){
                alunosPeloNome.add(a);
            }
        }
        if (alunosPeloNome.isEmpty()){
            return null;
        }
        return alunosPeloNome;
    }

    public Aluno getAlunoComMaiorNota(){
        if (this.alunos.isEmpty()){
            return null;
        }
        Double comparativo = 0.0;
        Aluno maiorNota = null;

        for (Aluno a: this.alunos){
            if (a.calcularMedia() > comparativo){
                comparativo = a.calcularMedia();
                maiorNota = a;
            }
        }
        return maiorNota;
    }

    public Aluno getAlunoComMenorNota(){
        if (this.alunos.isEmpty()){
            return null;
        }
        Double comparativo = alunos.get(0).calcularMedia();
        Aluno menorNota = alunos.get(0);

        for (Aluno a: this.alunos){
            if (a.calcularMedia() < comparativo){
                comparativo = a.calcularMedia();
                menorNota = a;
            }
        }
        return menorNota;
    }

    public Double calcularMediaDaTurma(){
        if (alunos.isEmpty()){
            return 0.0;
        }
        Double mediaTurma = 0.0;
        Double valorNota = 0.0;
        for (Aluno a: this.alunos){
            valorNota += a.calcularMedia();
        }
        return mediaTurma = valorNota / alunos.size();
    }

    public Double getMediaPorRa(String ra){
        for (Aluno a: this.alunos){
            if (a.getRa().equals(ra)){
                return a.calcularMedia();
            }
        }

        return 0.0;
    }

    public Double getMediana (){
        List<Double> medias = new ArrayList<>();
        for (Aluno a: this.alunos){
            medias.add(a.calcularMedia());
        }


        for (int i = 0; i < medias.size(); i++){
            int menorIndice = i;
            for (int j = i + 1; j < medias.size(); j++) {
                if (medias.get(j) < medias.get(menorIndice)){
                    menorIndice = j;
                }
            }
            double aux = medias.get(i);
            medias.set(i, medias.get(menorIndice));
            medias.set(menorIndice, aux);
        }

        int n = medias.size();

        if (n == 0){
            return 0.0;
        }

        if (n % 2 == 1){
            return medias.get(n / 2);
        } else {
            Double meio1 = medias.get((n /2) -1);
            Double meio2 = medias.get(n /2);

            return (meio1 + meio2) / 2;
        }
    }

}
