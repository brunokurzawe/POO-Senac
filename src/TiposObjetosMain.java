public class TiposObjetosMain {

    public static void main(String[] args) {

        boolean verdadeiro = true;

        Boolean verdadeiroObjeto = verdadeiro;

        boolean testeBoolean = verdadeiroObjeto.equals(true);

        System.out.println(testeBoolean);



        char caractere = 'A';

        Character caractereObjeto = caractere;

        boolean testeChar = caractereObjeto.equals(caractere);

        System.out.println(testeChar);



        double numero = 10;

        Double numeroObjeto = numero;

        boolean testeDOuble = numeroObjeto.equals(numero);

        System.out.println(testeDOuble);


        float numero2 = 10F;

        Float numeroObjeto2 = numero2;

        boolean testeFloat = numeroObjeto2.equals(numero2);

        System.out.println(testeFloat);


        int inteiro = 1;

        Integer inteiroObjeto = inteiro;

        boolean testeInt = inteiroObjeto.equals(inteiro);

        System.out.println(testeInt);


        long longo = 10L;

        Long longoObjeto = longo;

        boolean testeLongo = longoObjeto.equals(longo);

        System.out.println(testeLongo);

    }

}


