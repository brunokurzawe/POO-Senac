package arrays;

public class ArrayFind {

    public static void main(String[] args) {

        String[] nomesPessoas = {"L. Hamilton", "A. Albon",
                "N. Latifi", "M. Verstapen", "G. Russel"};

        String nomeFind = "Latifi";

        for (int i = 0; i < nomesPessoas.length; i++) {
            if (nomesPessoas[i].contains(nomeFind)) {
                System.out.println("O nome ("+nomeFind+") foi " +
                        "encontrado na posição " + i);
            }
        }


    }

}
