package school.sptech;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Empresa> empresas = new ArrayList<Empresa>();
        Faker faker = new Faker();
        List<String> mercado = List.of("Técnologia", "Agricultura", "Varejo", "Automóvel", "Construção");

        for (int i = 0; i < 10; i++) {
            int idEmpresa = i + 1;
            String nome = faker.company().industry();
            String cnpj = faker.number().digits(14);
            Double patrimonio = faker.number().randomDouble(2, 300000, 5000000);
            String paisOrigem = faker.country().name();
            String segmento = mercado.get(faker.number().numberBetween(0,4));

            empresas.add(new Empresa(idEmpresa, nome, cnpj, patrimonio, paisOrigem, segmento));
        }

        Empresa.ordenarNome(empresas);
//        Empresa.ordenarDecrescente(empresas);
        for (int i = 0; i <= empresas.size() -1 ; i++) {
            System.out.println(empresas.get(i));
        }


    }
}