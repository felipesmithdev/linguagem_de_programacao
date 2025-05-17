package school.sptech;

import java.util.Random;

public class votacao {
    public static void main(String[] args) {

        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer quatroQueijos = 0;
        Integer numeroSorteado = 0;
        String saborPreferido = "";
        Integer contador = 1;
        Random random = new Random();

        while(contador <= 10){
            numeroSorteado = random.nextInt(3) + 1;
            if (numeroSorteado.equals(1)){
                mussarela++;
            } else if(numeroSorteado.equals(2)){
                calabresa++;
            } else {
                quatroQueijos++;
            }

            if (mussarela > calabresa && mussarela > quatroQueijos ){
                saborPreferido = "O sabor preferido foi o de Mussarela";
            } else if (calabresa > mussarela && calabresa > quatroQueijos){
                saborPreferido = "O sabor preferido foi o de Calabresa";
            } else if (quatroQueijos > calabresa && quatroQueijos > mussarela ){
                saborPreferido = "O sabor preferido foi o de Quatro Queijos";
            } else {
                saborPreferido = "Tivemos um empate!";
            }
            contador ++;
        }
        System.out.println("Votos \n" + "Mussarela: " + mussarela + "\n" + "Calabresa: " + calabresa + "\n" + "Quatro Queijos: " + quatroQueijos);
        System.out.println(saborPreferido);
    }
}
