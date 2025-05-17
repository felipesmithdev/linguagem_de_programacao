public class carro {
    // atributos (caracteristicas)
    String cor;
    String placa;
    String modelo;
    Integer quantidadeCavalo;
    Integer velocidade;
    Boolean ligado;
    Boolean automatico;
    Integer dash;
    // metodos (funcionalidades/ comportamentos/ acoes)

    public void ligar(){
        if (!ligado) {
            System.out.println("Ruuuuuuuuuuuuuuuuuuum!!!");
            ligado = true;
        } else {
            System.out.println("ja ta ligado mano");
        }
    }

    public void desligar(){
        if (ligado) {
            System.out.println("puuuuuuuuuuuuuuuuuuff!!!!");
            ligado = false;
        } else {
            System.out.println("liga ai mano");
        }
    }

    public void acelerar(){
        if (ligado) {
            System.out.println("Randamdamadamdamdmadma");
            System.out.println("Puf puf");
            velocidade += 10;
            System.out.println("Velocidade atual: " + velocidade);
        } else {
            System.out.println(". . .");
        }
    }
    public void acelerar(Integer quantidade){
        if (ligado) {
            System.out.println("Randamdamadamdamdmadma");
            System.out.println("Puf puf");
            velocidade += quantidade;
            System.out.println("Velocidade atual: " + velocidade);
        }
        else {
            System.out.println(". . .");
        }
    }

    public void reduzir(){
        if (!ligado){
            System.out.println(". . .");
        } else {
            System.out.println("Iuuuuuuuuunnnnnn");
            if (velocidade < 10) {
                velocidade = 0;
                System.out.println("Velocidade atual: " + velocidade);

            } else {
                velocidade -= 10;
            }
            System.out.println("Velocidade atual: " + velocidade);

        }
    }

    @Override
    public String toString() {
        return "carro{" +
                "\ncor='" + cor + '\'' +
                ", \nplaca='" + placa + '\'' +
                ", \nmodelo='" + modelo + '\'' +
                ", \nquantidadeCavalo=" + quantidadeCavalo +
                ", \nvelocidade=" + velocidade +
                ", \nligado=" + ligado +
                ", \nautomatico=" + automatico +
                ", \ndash=" + dash +
                '}';
    }
}
