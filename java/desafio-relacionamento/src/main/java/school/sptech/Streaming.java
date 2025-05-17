package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class Streaming {
    private List<Filme> filmes;

    public Streaming(List<Filme> filmes){
        this.filmes = new ArrayList<Filme>();
    }

    public void adicionarFilme(Filme filme){
        this.filmes.add(filme);
    }

    public void removerFilme(Integer id){
        for (int i = 0; i < filmes.size() -1; i++) {
            if (filmes.get(i).getId().equals(id)){
                filmes.remove(i);
            }
        }
    }

    public Integer getQuantidadeDeFilmes(){
        return this.filmes.size();
    }

    public Double getMediaFilmes(){
        Double notaSomada = 0.0;
        Double media = 0.0;

        for (Filme f: filmes){
            notaSomada += f.getNotaImdb();
        }
        media = notaSomada / filmes.size();

        return media;
    }

    public Filme getFilmePeloNome(String nome){
        int contador = 0;
        for (Filme f: filmes){
            if (f.getNome().equalsIgnoreCase(nome)){
                return filmes.get(contador);
            }
            contador += 1;
        }
        return null;
    }

    public List<Filme> getFilmesPorCategoria(String categoria){
        List<Filme> retornarFilmes = new ArrayList<Filme>();
        int contador = 0;
        for (Filme f: filmes){
            if (f.getCategoria().equalsIgnoreCase(categoria)){
                retornarFilmes.add(filmes.get(contador));
            }
            contador += 1;
        }
        return retornarFilmes;
    }

    public Filme getFilmeMaiorNota(){
        if (filmes.isEmpty()){
            return null;
        }

        int contador = 0;
        int indiceMaior = 0;
        double maiorNota = 0;
        for (Filme f: filmes){
            if (f.getNotaImdb() > maiorNota){
                indiceMaior = contador;
                maiorNota = f.getNotaImdb();
            }
            contador += 1;
        }
        return filmes.get(indiceMaior);
    }

    public Filme sortearFilme(){
        Random random = new Random();
        return filmes.get(random.nextInt(filmes.size()));
    }






}
