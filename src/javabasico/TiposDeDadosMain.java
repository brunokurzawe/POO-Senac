package javabasico;

public class TiposDeDadosMain {


    public static void main(String[] args) {

        boolean isTradicional = true;
        System.out.println("É tradicional " + isTradicional);

        boolean isConvencional = false;
        System.out.println("É convencional " + isConvencional);

        char gabarito = 'A';
        System.out.println("Questão selecionada " + gabarito);

        byte variavel = 27;
        System.out.println("Valor do byte " + variavel);

        short numero = 32767;
        System.out.println("Valor do numero " + numero);
        //short numero2 = 32768;

        int numeroInteiro = 2147483647;
        System.out.println("O valor maximo para um inteiro " + numeroInteiro);
        //int numeroInteiro2 = 2147483648;

        long numeroLongo = 9223372036854775807L;
        System.out.println("O valor maximo para um longo é " + numeroLongo);
        //long numeroLongo2 = 9223372036854775808L;

        float numeroPontoFlutuante = 3.40282347123214F;
        System.out.println(numeroPontoFlutuante);

        double numeroDouble = 3.402823471232145465454645645645645465454545454545645645645645645454545454545454545645645646546;
        System.out.println(numeroDouble);
    }
}
