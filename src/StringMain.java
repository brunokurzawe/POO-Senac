public class StringMain {

    public static void main(String[] args) {

        String primeiroTexto = "Este é nosso primeiro texto em uma String";

        System.out.println(primeiroTexto);

        int tamanhoTexto = primeiroTexto.length();

        System.out.println("Tamanho do texto: " + tamanhoTexto);

        char caracterPosicao = primeiroTexto.charAt(tamanhoTexto - 1);

        System.out.println("Caracter na ultima posição: " + caracterPosicao);

        String textoMinusculo = primeiroTexto.toLowerCase();

        System.out.println("Texto minusculo: " + textoMinusculo);

        String textoMaisculo = primeiroTexto.toUpperCase();

        System.out.println("Texto maiusculo: " + textoMaisculo);

        String parteTexto = primeiroTexto.substring(13, 21);

        System.out.println("Parte de texto: " + parteTexto);

        String textoAlterado = primeiroTexto.replace("primeiro", "segundo");

        System.out.println("Texto alterado: " + textoAlterado);

        String segundoTexto = "     Aqui temos um texto com espaços na frente e atrás     ";

        System.out.println("-" + segundoTexto + "-");

        System.out.println("-" + segundoTexto.trim() + "-");

        String stringA = "Valor A";
        String stringB = "Valor A";

        boolean iguais1 = stringA == stringB;
        boolean iguais2 = stringA.equals(stringB);

        System.out.println("Igual 1: " + iguais1);
        System.out.println("Igual 2: " + iguais2);

        String stringC = new String("Valor A");

        boolean iguais3 = stringA == stringC;
        boolean iguais4 = stringA.equals(stringC);

        System.out.println("Igual 3: " + iguais3);
        System.out.println("Igual 4: " + iguais4);
    }
}
