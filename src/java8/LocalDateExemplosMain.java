package java8;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExemplosMain {


    public static void main(String[] args) {

        LocalDate dataDeHoje = LocalDate.now();

        System.out.println("É um ano bissexto: "
                + dataDeHoje.isLeapYear());

        System.out.println("Que dia foi a 3 dias atrás? "
                + dataDeHoje.minusDays(3));

        System.out.println("Que dia foi a 2 meses atrás? "
                + dataDeHoje.minusMonths(2));

        System.out.println("Que dia será em 10 dias? "
                + dataDeHoje.plusDays(10));

        System.out.println("Que dia será em 3 meses? "
                + dataDeHoje.plusMonths(3));

        System.out.println("Que dia da semama é hoje? "
                + dataDeHoje.getDayOfWeek());

        LocalDate diaPgto = LocalDate.of(2022, Month.AUGUST, 01);
        LocalDate diaBolto = LocalDate.of(2022, Month.AUGUST, 10);

        System.out.println(diaBolto.isAfter(diaPgto)); //Depois
        System.out.println(diaBolto.isBefore(diaPgto)); //Antes


    }


}
