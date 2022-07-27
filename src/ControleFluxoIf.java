public class ControleFluxoIf {

    public static void main(String[] args) {

        int idade = 18;

        if (idade >= 18) {
            System.out.println("Maior de Idade!");
        } else {
            System.out.println("Menor de Idade!");
        }

        int lotacaoMaxima = 250;

        if (lotacaoMaxima > 250) {
            System.out.println("A quantidade maxima de pessoas exedida!");
        }

        double imc = 27;

        if (imc < 17) {
            System.out.println("Muito abaixo do peso!");
        } else if (imc < 18.49) {
            System.out.println("Abaixo do peso!");
        } else if (imc < 24.99) {
            System.out.println("Peso normal!");
        } else if (imc < 29.99) {
            System.out.println("Acima do Peso!");
        } else if (imc < 34.99) {
            System.out.println("Obessidade I!");
        } else if (imc < 39.99) {
            System.out.println("Obessidade II!");
        } else {
            System.out.println("Obessidade III!");
        }


    }

}
