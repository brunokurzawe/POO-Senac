package interfacegrafica;

import javax.swing.*;

public class ExpressaoMain {

    public static void main(String[] args) {
        double valorA = Double.valueOf(JOptionPane.showInputDialog("Digite valor de A: "));
        double valorB = Double.valueOf(JOptionPane.showInputDialog("Digite valor de B: "));
        double valorC = Double.valueOf(JOptionPane.showInputDialog("Digite valor de C: "));


        double delta = (valorB * valorB) + (-4 * (valorA * valorC));

        if (delta >= 0) {
            double x1 = (((valorB * (-1)) + Math.sqrt(delta)) / (2 * valorA));
            double x2 = (((valorB * (-1)) - Math.sqrt(delta)) / (2 * valorA));

            JOptionPane.showMessageDialog(null, "Valor de X1: " + x1 + " Valor de x2: " + x2);
        }


    }


}
