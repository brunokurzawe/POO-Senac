package collections;

import java.util.*;

public class MapMain {


    public static void main(String[] args) {
        Map<String, List<Integer>> alunos = new TreeMap<>();

        List<Integer> notas01 = new ArrayList<>();
        notas01.add(7);
        notas01.add(6);
        notas01.add(8);

        List<Integer> notas02 = new ArrayList<>();
        notas02.add(9);
        notas02.add(7);
        notas02.add(7);

        alunos.put("Pedro Souza", notas01);
        alunos.put("Rafael Silva", notas02);


        Iterator mapIterator = alunos.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) mapIterator.next();
            System.out.println(mapElement.getKey());
            System.out.println(mapElement.getValue());
        }



        for (List<Integer> nota : alunos.values()) {
            System.out.println(nota);
        }


    }


}
