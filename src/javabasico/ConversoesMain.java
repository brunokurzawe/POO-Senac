package javabasico;

public class ConversoesMain {

    public static void main(String[] args) {

        /* Um byte pode ser convertido em um short, int, long, float ou double */
        byte numero = 1;
        short numeroShort = numero;
        int numeroInt = numero;
        long numeroLong = numero;
        float numeroFloat = numero;
        double numeroDouble = numero;

        System.out.println("#### BYTE  ####");
        System.out.println(numeroShort);
        System.out.println(numeroInt);
        System.out.println(numeroLong);
        System.out.println(numeroFloat);
        System.out.println(numeroDouble);
        System.out.println("###############");

        /* Um short pode ser convertido em um int, long, float ou double */
        short numeroShort2 = 1;
        int numeroInt2 = numeroShort2;
        long numeroLong2 = numeroShort2;
        float numeroFloat2 = numeroShort2;
        double numeroDouble2 = numeroShort2;

        System.out.println("#### SHORT ####");
        System.out.println(numeroShort2);
        System.out.println(numeroInt2);
        System.out.println(numeroLong2);
        System.out.println(numeroFloat2);
        System.out.println(numeroDouble2);
        System.out.println("###############");


        /* Um char pode ser convertido em um int, long, float ou double  */
        char char1 = 'A';
        int charInt = char1;
        long charLong = char1;
        float charFloat = char1;
        double charDouble = char1;

        System.out.println("#### CHAR ####");
        System.out.println(char1);
        System.out.println(charInt);
        System.out.println(charLong);
        System.out.println(charFloat);
        System.out.println(charDouble);
        System.out.println("###############");


        /* Um int pode ser convertido em um long, float ou double  */
        int intNumero = 1;
        long intLong = intNumero;
        float intFloat = intNumero;
        double intDouble = intNumero;

        System.out.println("#### INT  ####");
        System.out.println(intNumero);
        System.out.println(intLong);
        System.out.println(intFloat);
        System.out.println(intDouble);
        System.out.println("###############");

        /* Um long pode ser convertido em um float ou double  */
        long longNumero = 1;
        float floatNumero = longNumero;
        double doubleNumero = longNumero;

        System.out.println("#### LONG ####");
        System.out.println(longNumero);
        System.out.println(floatNumero);
        System.out.println(doubleNumero);
        System.out.println("##############");

        /* Um float pode ser convertido em um double​  */
        float floatNumero2 = 1;
        double floatDouble = floatNumero2;

        System.out.println("#### FLOAT ####");
        System.out.println(floatNumero2);
        System.out.println(floatDouble);
        System.out.println("##############");

        /*
        double doubleNumero2 = 1.0;
        float doubleFloat = doubleNumero2;
        System.out.println(doubleFloat);
        */

        /*
        double doubleNumero3 = 1.0;
        float doubleFloat3 = (float) doubleNumero3;
        System.out.println(doubleFloat3);
        */

    }
}
