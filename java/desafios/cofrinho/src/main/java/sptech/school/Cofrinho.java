package sptech.school;

import java.util.Random;

public class Cofrinho {

    String dono;
    Double saldo = 0.0;
    Boolean quebrado = false;

    public void depositar(Double valor){
        if (quebrado){
            return;
        } else {
            saldo += valor;
        }
    }

    public Double sacar(Double valor){
        if (quebrado || valor > saldo){
            return 0.0;
        }else {
            saldo -= valor;
            return saldo;
        }
    }

    public Double quebrar(){
        if (quebrado){
            return 0.0;
        } else {
            quebrado = true;
            Double saldoAntigo = saldo;
            saldo = 0.0;
            return saldoAntigo;
        }
    }

    public Double sacudir (){
        Random random = new Random();
        Double remover = random.nextDouble(saldo);
        if (remover <= saldo && !quebrado){
            saldo -= remover;
            return saldo;
        } else {
            return 0.0;
        }
    }

    public Boolean isMaiorQue(Cofrinho cofrinho){
        Double cofreAtual = this.saldo;
        Double cofreVisitante = cofrinho.saldo;

        if (cofreAtual > cofreVisitante){
            return true;
        } else {
            return false;
        }
    }

    public String getDono(){
        return dono;
    }

    public void setDono(String dono){
        this.dono = dono;
    }

    public Double getSaldo(){
        return saldo;
    }

    public Boolean getQuebrado(){
        return quebrado;
    }
}
