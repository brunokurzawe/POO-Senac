package arrays;

import java.util.Scanner;

public class CadastroExercicioMain {

    public static void main(String[] args) {

        String[] nomes = new String[3];
        String[] sobrenomes = new String[3];
        int[] filhos = new int[3];
        double[] alturas = new double[3];
        double[] pesos = new double[3];


        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome da pessoa: ");
            String nome = s.nextLine();
            nomes[i] = nome;

            System.out.println("Digite o sobrenome da pessoa: ");
            String sobrenome = s.nextLine();
            sobrenomes[i] = sobrenome;

            System.out.println("Digite a quantidade de filhos: ");
            int quantidadeFilhos = Integer.parseInt(s.nextLine());
            filhos[i] = quantidadeFilhos;

            System.out.println("Digite a altura da pessoa: ");
            double altura = Double.parseDouble(s.nextLine());
            alturas[i] = altura;

            System.out.println("Digite o peso da pessoa: ");
            double peso = Double.parseDouble(s.nextLine());
            pesos[i] = peso;
        }

        for (int i = 0; i < 3; i++) {
            double imc = pesos[i] / (alturas[i] * alturas[i]);
            System.out.println("A pessoa " + nomes[i] + " "
                    + sobrenomes[i] + " tem " + filhos[i]
                    + " filhos. IMC :" + imc);
        }


    }

}
