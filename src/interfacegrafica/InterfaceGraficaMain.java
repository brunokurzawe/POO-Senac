package interfacegrafica;

import javax.swing.*;

public class InterfaceGraficaMain {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");

        String mensagem = nome + " está estudando POO em ADS 2";

        JOptionPane.showMessageDialog(null,
                mensagem,
                "Teste",
                JOptionPane.QUESTION_MESSAGE);

        double sqrt = Math.sqrt(2);
        System.out.println(sqrt);
    }


}
