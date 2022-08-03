import java.util.Scanner;

public class MainSenac {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Resolução Exercicio 06");
        /*
         * Solução proposta numero 01
         * */
        for (int i = 15; i <= 35; i++) {
            if (i % 2 == 0) {
                System.out.println(" é par:" + i);
                continue;
            }
            System.out.println(i + " >> " + (int) i * i);
        }

        /*
         * Solução proposta numero 02
         * */
        for (int i = 15; i <= 35; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " >>>> " + (int) Math.pow(i, 2));
            }
        }

        /*
         * Solução proposta numero 03
         * */
        for (int xa = 15; xa <= 35; xa++) {
            if (xa % 2 != 0) {
                System.out.println(xa + " é um número ímpar e o seu quadrado é " + (xa * xa));
            } else {        //retirando esse else, não imprime os números pares
                System.out.println(xa + " é um número par");
            }
        }

        /*
         * Solução proposta numero 04
         * */
        int ia = 15;
        while (ia <= 35) {
            if (ia % 2 != 0) {
                System.out.println("O quadrado do número " + ia + " é igual a " + ia * ia);
            }
            ia++;
        }


    }


}
