package arraysmultidimensionais;

public class JogoDaVelhaMain {

    public static void main(String[] args) {
        String[][] jogoDaVelha;
        jogoDaVelha = new String[3][3];
        jogoDaVelha[0] = new String[]{"X", "O", "O"};
        jogoDaVelha[1] = new String[]{"O", "X", "O"};
        jogoDaVelha[2] = new String[]{"O", "O", "X"};

        for (int i = 0; i <jogoDaVelha.length; i++){
            System.out.print("Linha "+i+" :");
            String linha = "";
            for (int j = 0; j < jogoDaVelha[i].length; j++){
                linha += " "+jogoDaVelha[i][j];
            }
            System.out.print(linha+"\n");
        }
    }

}
