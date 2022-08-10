package collections;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);

        for (int i = 0; i < lista.size(); i++) {
            Integer integer = lista.get(i);
            System.out.println(integer);
        }
    }

}
