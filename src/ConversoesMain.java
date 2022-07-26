public class ConversoesMain {

    public static void main(String[] args) {

        byte numero = 1;
        short numeroShort = numero;
        int numeroInt = numero;
        long numeroLong = numero;
        float numeroFloat = numero;
        double numeroDouble = numero;

        System.out.println(numeroShort);
        System.out.println(numeroInt);
        System.out.println(numeroLong);
        System.out.println(numeroFloat);
        System.out.println(numeroDouble);

        short numeroShort2 = 1;
        int numeroInt2 = numeroShort2;
        long numeroLong2 = numeroShort2;
        float numeroFloat2 = numeroShort2;
        double numeroDouble2 = numeroShort2;

        System.out.println(numeroShort2);
        System.out.println(numeroInt2);
        System.out.println(numeroLong2);
        System.out.println(numeroFloat2);
        System.out.println(numeroDouble2);

        char char1 = 'A';
        int charInt = char1;
        long charLong = char1;
        float charFloat = char1;
        double charDouble = char1;

        System.out.println(char1);
        System.out.println(charInt);
        System.out.println(charLong);
        System.out.println(charFloat);
        System.out.println(charDouble);

        int intNumero = 1;
        long intLong = intNumero;
        float intFloat = intNumero;
        double intDouble = intNumero;

        System.out.println(intNumero);
        System.out.println(intLong);
        System.out.println(intFloat);
        System.out.println(intDouble);

        long longNumero = 1;
        float floatNumero = longNumero;
        double doubleNumero = longNumero;

        System.out.println(longNumero);
        System.out.println(floatNumero);
        System.out.println(doubleNumero);

        float floatNumero2 = 1;
        double floatDouble = floatNumero2;

        System.out.println(floatNumero2);
        System.out.println(floatDouble);

        double doubleNumero2 = 1.0;
        float doubleFloat = (float) doubleNumero2;

        System.out.println(">>"+doubleFloat);

    }
}
