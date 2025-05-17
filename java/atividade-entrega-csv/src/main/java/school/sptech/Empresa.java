package school.sptech;

import java.util.List;

public class Empresa {

    private Integer idEmpresa;
    private String nome;
    private String cnpj;
    private Double patrimonio;
    private String paisOrigem;
    private String segmento;
    private Integer unidades;

    public Empresa ( Integer idEmpresa, String nome, String cnpj, Double patrimonio, String paisOrigem, String segmento, Integer unidades){

        this.idEmpresa = idEmpresa;
        this.nome = nome;
        this.cnpj = cnpj;
        this.patrimonio = patrimonio;
        this.paisOrigem = paisOrigem;
        this.segmento = segmento;
        this.unidades = unidades;
    }

    public static void ordenarNome(List<Empresa> lista){
        for (int i = 0; i < lista.size() -1 ; i++) {
            int menorLetra = i;

            for (int j = i + 1; j < lista.size() ; j++) {
                if (lista.get(j).nome.compareTo(lista.get(menorLetra).nome) < 0){
                    menorLetra = j;
                }
            }
            Empresa aux = lista.get(i);
            lista.set(i, lista.get(menorLetra));
            lista.set(menorLetra, aux);

        }
    }

    public static void ordenarCnpj(List<Empresa> lista){
        for (int i = 0; i < lista.size() -1 ; i++) {

            for (int j = 1; j < lista.size() - i ; j++) {
                if (lista.get(j -1).cnpj.compareTo(lista.get(j).cnpj) > 0){
                    Empresa aux = lista.get(j -1);
                    lista.set(j -1, lista.get(j));
                    lista.set(j, aux);
                }
            }

        }
    }

    public static Integer pesquisaBinaria(List<Empresa> lista, Integer x){
        Integer inicio = 0;
        Integer fim = lista.size();

        while(inicio < fim){
            int contador = 0;
            Integer meio = (inicio + fim) / 2;
            if (x == lista.get(meio).idEmpresa){
                return  meio;
            } else if (x > lista.get(meio).idEmpresa){
                inicio = meio + 1;
            } else if (x < lista.get(meio).idEmpresa){
                fim = meio - 1;
            }
        }
        return -1;

    }

    public static void ordenarComecandoDoMaior(List<Empresa> lista){
        for (int i = lista.size() -1; i >= 0; i--) {
            int indiceAtual = i;
            for (int j = i - 1 ; j >= 0; j--) {
                if (lista.get(j).idEmpresa > lista.get(i).idEmpresa){
                    indiceAtual = j;
                }
            }
            Empresa aux = lista.get(i);
            lista.set(i, lista.get(indiceAtual));
            lista.set(indiceAtual, aux);
        }
    }

    public static void ordenarDecrescente(List<Empresa> lista){
        for (int i = lista.size() -1 ; i >= 0; i--) {
            int indiceMaior = i;
            for (int j = i -1 ; j >= 0; j--) {
                if (lista.get(j).idEmpresa < lista.get(indiceMaior).idEmpresa){
                    indiceMaior = j;
                }
            }
            Empresa aux = lista.get(i);
            lista.set(i, lista.get(indiceMaior));
            lista.set(indiceMaior, aux);

            
        }
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Double getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(Double patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public Integer getUnidades() {
        return unidades;
    }

    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "idEmpresa: " + idEmpresa + " || nome: " + nome + " || cnpj: " + cnpj + " || patrimonio: " + patrimonio + " || paisOrigem: " + paisOrigem +
                " || segmento: " + segmento + " || unidades: " + unidades;
    }
}
