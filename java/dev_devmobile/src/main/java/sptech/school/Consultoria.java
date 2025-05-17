package sptech.school;

import java.util.ArrayList;
import java.util.List;

public class Consultoria {
    private String nome;
    private Integer vagas;
    private List<Dev> devs;

    public Consultoria(){
        this.devs = new ArrayList<Dev>();
    }


    public Consultoria(String nome, Integer vagas, List<Dev> devs) {
        this();
        this.nome = nome;
        this.vagas = vagas;
    }

    public Boolean existePorNome(String nome){
        if (this.devs.isEmpty()){
            return false;
        }

        for (Dev d: this.devs){
            if (d.getNome().equalsIgnoreCase(nome)){
                return true;
            }
        }

        return false;
    }

    public void contratarDev(Dev dev){
        if (dev == null){
            return;
        }
        this.devs.add(dev);
    }

    public Integer getQuantidadeDevs(){
        int contador = 0;
        for (Dev d: this.devs){
            if (!(d instanceof DevMobile)){
                contador += 1;
            }
        }
        return contador;
    }

    public Integer getQuantidadeDevsMobile(){
        int contador = 0;
        for (Dev d: this.devs){
            if (d instanceof DevMobile){
                contador += 1;
            }
        }
        return contador;
    }

    public Double getTotalSalario(){
        Double total = 0.0;
        for (Dev d: this.devs){
            total += d.getSalario();
        }
        return total;
    }

    public Dev getDevPorNome(String nome){
        for (Dev d: this.devs){
            if (d.getNome().equalsIgnoreCase(nome)){
                return d;
            }
        }
        return null;
    }



}
