package sptech.school;

public class Main {
    public static void main(String[] args) {

        Engenheiro e1 = new Engenheiro("12345", "felipe", 3500.00);
        Vendedor v1 = new Vendedor("12346", "pedro", 2000.00, 0.8);
        Horista h1 = new Horista("54321", "carlos", 40, 15.00);

        System.out.println(e1);
        System.out.println(v1);
        System.out.println(h1);


        Empresa empresa = new Empresa("Sptech");

        empresa.adicionaFunc(e1);
        empresa.adicionaFunc(v1);
        empresa.adicionaFunc(h1);

        empresa.exibeTodos();
        empresa.exibeSalario();
        empresa.exibeHorista();

    }
}