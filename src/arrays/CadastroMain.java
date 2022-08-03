package arrays;

import java.util.Scanner;

public class CadastroMain {

    public static void main(String[] args) {

        String[] nomes = new String[3];
        String[] sobrenomes = new String[3];
        int[] filhos = new int[3];


        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            System.out.println("Digite o nome da pessoa: ");
            String nome = s.nextLine();
            nomes[i] = nome;

            System.out.println("Digite o sobrenome da pessoa: ");
            String sobrenome = s.nextLine();
            sobrenomes[i] = sobrenome;

            System.out.println("Digite a quantidade de filhos: ");
            int quantidadeFilhos = Integer.parseInt(s.nextLine());
            filhos[i] = quantidadeFilhos;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("A pessoa "+nomes[i]+" "
                    +sobrenomes[i]+" tem "+filhos[i]+" filhos.");
        }


    }

}
