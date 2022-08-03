package arrays;

public class ArrayMain {

    public static void main(String[] args) {

        int[] jogoSena; //DECLARAÇÃO
        jogoSena = new int[6];  //CRIAÇÃO
        jogoSena[0] = 23;  // INICIALIZAÇÃO DA POSIÇÃO 0
        jogoSena[1] = 12;  // INICIALIZAÇÃO DA POSIÇÃO 1
        jogoSena[2] = 55;  // INICIALIZAÇÃO DA POSIÇÃO 2
        jogoSena[3] = 2;  // INICIALIZAÇÃO DA POSIÇÃO 3
        jogoSena[4] = 7;  // INICIALIZAÇÃO DA POSIÇÃO 4
        jogoSena[5] = 19;  // INICIALIZAÇÃO DA POSIÇÃO 5

        int[] outroJogoSena = {23, 16, 25, 48, 51, 12};

        System.out.println("Tamanho do array :: " + outroJogoSena.length);


        //Array de Strings
        String[] nomesPessoas = new String[4];
        nomesPessoas[0] = "João";
        nomesPessoas[1] = "Maria";
        nomesPessoas[2] = "Pedro";
        nomesPessoas[3] = "Dr. Webber";

        for (int i = nomesPessoas.length - 1; i >= 0; i--) {
            System.out.println("Nome pessoa " + i +
                    " é " + nomesPessoas[i]);
        }

        for (int i = 0; i < nomesPessoas.length; i++) {
            System.out.println("Nome pessoa " + i +
                    " é " + nomesPessoas[i]);
        }


        //Array de double
        double[] alturasPessoas = new double[3];
        alturasPessoas[0] = 1.88;
        alturasPessoas[1] = 1.74;
        alturasPessoas[2] = 1.81;

        int i = 0;
        while (i < alturasPessoas.length) {
            System.out.println("Altura  pessoa " + i +
                    " é " + alturasPessoas[i]);
            i++;
        }


        //Array de float
        float[] pesoPessoas = new float[5];
        pesoPessoas[0] = 88.2F;
        pesoPessoas[1] = 64.7F;
        pesoPessoas[2] = 48.8F;
        pesoPessoas[3] = 71.3F;
        pesoPessoas[4] = 56.8F;

        float somaPeso = 0;
        for (int x = 0; x < pesoPessoas.length; x++) {
            somaPeso += pesoPessoas[x];
        }
        float mediaPeso = somaPeso / pesoPessoas.length;
        System.out.println("Média :: " + mediaPeso);

        //Array de Integer
        Integer[] numeroFilhos = new Integer[3];
        numeroFilhos[0] = 3;
        numeroFilhos[1] = 2;
        numeroFilhos[2] = 0;

    }
}
