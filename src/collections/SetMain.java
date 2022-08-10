package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Lewis Hamilton");
        set.add("Alex Albon");
        set.add("Yuki Tsunoda");
        set.add("Carlos Sainz");
        set.add("George Russel");
        set.add("Yuki Tsunod");

        System.out.println(set);

//        for (String s : set) {
//            System.out.println(s);
//        }
    }

//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//    }

}
