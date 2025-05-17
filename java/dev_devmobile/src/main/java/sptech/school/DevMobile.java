package sptech.school;

public class DevMobile extends Dev{
    private Integer qtdHoraMobile;
    private Double valorHoraMobile;

    @Override
    public Double getSalario(){
        return this.qtdHoraMobile * this.valorHoraMobile;
    }

    public DevMobile(Integer qtdHoraMobile, Double valorHoraMobile) {
        this.qtdHoraMobile = qtdHoraMobile;
        this.valorHoraMobile = valorHoraMobile;
    }

    public DevMobile(String nome, Integer qtdHoras, Double valorHora, Integer qtdHoraMobile, Double valorHoraMobile) {
        super(nome, qtdHoras, valorHora);
        this.qtdHoraMobile = qtdHoraMobile;
        this.valorHoraMobile = valorHoraMobile;
    }

    public Integer getQtdHoraMobile() {
        return qtdHoraMobile;
    }

    public Double getValorHoraMobile() {
        return valorHoraMobile;
    }
}
