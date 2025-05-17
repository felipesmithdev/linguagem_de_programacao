package sptech.school;

import java.util.ArrayList;
import java.util.List;

public class Tributo {

    private List<Tributavel> listaTrib;

    public Tributo(){
        this.listaTrib = new ArrayList<Tributavel>();
    }

    public Tributo(List<Tributavel> listaTrib) {
        this();
    }

    @Override
    public String toString() {
        return "Tributo : "+ listaTrib + "\n";
    }

    public void adicionaTributavel(Tributavel t){
        listaTrib.add(t);
    }

    public Double calculaTotalTributo(){
        Double total = 0.0;

        for (Tributavel t: listaTrib){
            total += t.getValorTributo();
        }
        return total;
    }

    public void exibeTodos(){
        for (Tributavel t: listaTrib){
            System.out.println(t);
        }
    }


}
