package java8;

import java.math.BigDecimal;

public class OperacoesBigDecimalMain {

    public static void main(String[] args) {

        System.out.println("Subtração");
        BigDecimal subtracao = BigDecimal.valueOf(2.00)
                .subtract(BigDecimal.valueOf(1.2));
        System.out.println("Resultado: " + subtracao);


        System.out.println("Soma");
        BigDecimal soma = BigDecimal.valueOf(2.00)
                .add(BigDecimal.valueOf(1.2));
        System.out.println("Resultado: " + soma);



        System.out.println("Multiplicação");
        BigDecimal multiplicacao = BigDecimal.valueOf(2.00)
                .multiply(BigDecimal.valueOf(1.2));
        System.out.println("Resultado: " + multiplicacao);



        System.out.println("Divisão");
        BigDecimal divisao = BigDecimal.valueOf(2.00)
                .divide(BigDecimal.valueOf(1.2),BigDecimal.ROUND_UP);
        System.out.println("Resultado: " + divisao);



        System.out.println("Potênciação");
        BigDecimal potencia = BigDecimal.valueOf(2.00).pow(2);
        System.out.println("Resultado: " + potencia);




        System.out.println("Máximo");
        System.out.println(new BigDecimal("2.00")
                .max(new BigDecimal("1.5")));

        System.out.println("Mínimo");
        System.out.println(new BigDecimal("2.00")
                .min(new BigDecimal("1.6")));

        System.out.println("Compara");
        System.out.println(new BigDecimal("2.00")
                .compareTo(new BigDecimal("1.33")));


    }
}
