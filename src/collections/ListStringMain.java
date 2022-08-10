package collections;

import java.util.*;

public class ListStringMain {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Lewis Hamilton");
        lista.add("Alex Albon");
        lista.add("Yuki Tsunoda");
        lista.add("Carlos Sainz");
        lista.add("George Russel");

        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);

//        Iterator<String> iterator = lista.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
    }

//        System.out.println(lista);
//        Collections.sort(lista);
//        System.out.println(lista);
//    }


}
