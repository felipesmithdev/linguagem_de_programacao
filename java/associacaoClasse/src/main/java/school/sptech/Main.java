package school.sptech;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        Grupo grupo = new Grupo("Kattegart");

        for (int i = 0; i <= 10 ; i++) {
            String nome = faker.name().fullName();
            String telefone = faker.number().digits(11);
            Contato contato = new Contato(nome, telefone);
            grupo.adicionar(contato);
        }

        grupo.mostrarContato();
//            System.out.println(grupo);

    }
}