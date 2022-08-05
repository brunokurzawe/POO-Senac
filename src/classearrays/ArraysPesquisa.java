package classearrays;

import java.util.Arrays;

public class ArraysPesquisa {

    public static void main(String[] args) {

        int[] arrayInteiros = new int[10000];

        for (int i = 0; i < 10000; i++) {
            arrayInteiros[i] = i;
        }

        int numeroPesquisado = 6500;

        for (int i = 0; i < arrayInteiros.length; i++) {
            if (arrayInteiros[i] == numeroPesquisado) {
                System.out.println("Encontrado na posição: "
                        + arrayInteiros[i]);
            }
        }

        int i = Arrays.binarySearch(arrayInteiros, numeroPesquisado);

        System.out.println("Encontrado na posição: "+ i);

    }
}
