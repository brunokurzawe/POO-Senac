package java8;

import java.math.BigDecimal;

public class ArredondamentoMain {

    public static void main(String[] args) {
        BigDecimal bigDecimal = BigDecimal.valueOf(2.8989);
        System.out.println(bigDecimal
                .setScale(2, BigDecimal.ROUND_UP));
        System.out.println(bigDecimal
                .setScale(3, BigDecimal.ROUND_DOWN));
    }

}
