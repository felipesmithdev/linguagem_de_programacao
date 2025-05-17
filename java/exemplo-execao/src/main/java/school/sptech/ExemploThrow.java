package school.sptech;

import javax.swing.*;

public class ExemploThrow {
    public static void main(String[] args) {
        String snota1, snota2;
        Double nota1, nota2, media;
        try{
            snota1 = JOptionPane.showInputDialog("Digite a nota 1 (Valor entre 0 e 10) ");
            nota1 = Double.valueOf(snota1);

            if (nota1 < 0 || nota1 > 10.0){
                throw new LimiteUltrapassadoException("Valor da nota 1 Inválido");
            }
            snota2 = JOptionPane.showInputDialog("Digite a nota 2 (Valor entre 0 e 10) ");
            nota2 = Double.valueOf(snota2);

            if (nota2 < 0 || nota2 > 10.00){
                throw new LimiteUltrapassadoException("Valor da nota 2 Inválido");
            }

            media = (nota1 + nota2) / 2;
            JOptionPane.showMessageDialog(null, "A média é " + media);


        }
        catch (LimiteUltrapassadoException e){
            JOptionPane.showMessageDialog(null, e,
                    "Erro" + " - " + e.dataHora, JOptionPane.ERROR_MESSAGE);

        }
    }
}
