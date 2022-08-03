package arraysmultidimensionais;

public class VeiculosMain {

    public static void main(String[] args) {
        String[] tiposVeiculos = {"Carros", "Motos", "Barcos"};
        String[][] marcas = {{"VW", "AUDI", "BMW"},
                {"HONDA", "YAMAHA", "KAWASAKI"},
                {"MARCA1", "MARCA2", "MARCA3"}};
        String[][][] veiculos =
                {{{"Golf", "GOL", "POLO"}, {"A1", "A2", "A3"}, {"Z1", "M6", "M3"}},
                        {{"CG", "HORNET", "RR"}, {"R1", "R6", "MT-06"}, {"NINJA", "Z650", "Z400"}},
                        {{"L12P", "L12P", "L12P"}, {"L22P", "L22P", "L22P"}, {"L32P", "L32P", "L32P"}}};

        for (int i = 0; i < veiculos.length; i++) {
            System.out.println(tiposVeiculos[i]);
            for (int j = 0; j < veiculos[i].length; j++) {
                System.out.println(marcas[i][j]);
                for (int x = 0; x < veiculos[i][j].length; x++) {
                    System.out.print(" " + veiculos[i][j][x] + " ");
                }
                System.out.println("\n");
            }
            System.out.println("\n");
        }
    }
}
