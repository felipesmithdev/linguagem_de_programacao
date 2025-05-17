package sptech.school;

public class Main {
    public static void main(String[] args) {
        Alimento arroz = new Alimento(123,
                "pacote 5kg de arroz", 25.0, 15);

        Perfume malbec = new Perfume(567,
                "Perfume Malbec", 200.00, "Amadeirado");

        Servico pintura = new Servico("pintura de uma parede",
                150.00);

        Tributo trib = new Tributo();
        trib.adicionaTributavel(arroz);
        trib.adicionaTributavel(malbec);
        trib.adicionaTributavel(pintura);

        trib.exibeTodos();

        System.out.println("\nTotal de dos tributos R$ " + trib.calculaTotalTributo());


    }
}