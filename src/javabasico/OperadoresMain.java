package javabasico;

public class OperadoresMain {


    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        System.out.println("######### OPERADORES #########");
        int soma = a + b;
        System.out.println("Soma: " + soma);

        int subtracao = a - b;
        System.out.println("Subtração: " + subtracao);

        int multiplicacao = a * b;
        System.out.println("Multiplicação: " + multiplicacao);

        int divisao = a / b;
        System.out.println("Divisão: " + divisao);

        int resto = a % b;
        System.out.println("Resto: " + resto);

        System.out.println("######### OPERADORES #########");

        System.out.println("");
        System.out.println("");

        System.out.println("######### EXPRESSÕES #########");

        int expressao = a + b * 10;
        System.out.println("Expressao: " + expressao);

        int expressao2 = (a + b - a) / 10;
        System.out.println("Expressao 2: " + expressao2);

        System.out.println("######### EXPRESSÕES #########");

        System.out.println("");
        System.out.println("");

        System.out.println("######### CONDICIONAIS #########");
        boolean igual = a == b;
        System.out.println("Igualdade: " + igual);

        boolean diferente = a != b;
        System.out.println("Diferente: " + diferente);

        boolean maior = a > b;
        System.out.println("Maior: " + maior);

        boolean menor = a < b;
        System.out.println("Menor: " + menor);

        boolean maiorIgual = a >= b;
        System.out.println("Maior Igual: " + maiorIgual);

        boolean menorIgual = a <= b;
        System.out.println("Menor Igual: " + menorIgual);
        System.out.println("######### CONDICIONAIS #########");
    }
}
