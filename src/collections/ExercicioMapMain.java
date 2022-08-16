package collections;

import java.util.*;

public class ExercicioMapMain {

    public static void main(String[] args) {
        Map<String, Map<String, List<Integer>>> alunosDisc = new HashMap<>();
        Map<String, List<Integer>> discNotasAluno01 = new HashMap<>();

        List<Integer> nostasPortAluno01 = new ArrayList<>();
        List<Integer> nostasMateAluno01 = new ArrayList<>();
        List<Integer> notasCienciaAluno01 = new ArrayList<>();

        nostasPortAluno01.add(8);
        nostasPortAluno01.add(6);
        nostasMateAluno01.add(5);
        nostasMateAluno01.add(6);
        notasCienciaAluno01.add(9);
        notasCienciaAluno01.add(3);

        discNotasAluno01.put("Portugues", nostasPortAluno01);
        discNotasAluno01.put("Matematica", nostasMateAluno01);
        discNotasAluno01.put("Ciencia", notasCienciaAluno01);

        alunosDisc.put("Bruno", discNotasAluno01);

        Map<String, List<Integer>> discNotasAluno02 = new HashMap<>();
        List<Integer> nostasPortAluno02 = new ArrayList<>();
        List<Integer> nostasMateAluno02 = new ArrayList<>();
        List<Integer> notasCienciaAluno02 = new ArrayList<>();

        nostasPortAluno02.add(8);
        nostasPortAluno02.add(6);
        nostasMateAluno02.add(5);
        nostasMateAluno02.add(6);
        notasCienciaAluno02.add(9);
        notasCienciaAluno02.add(3);

        discNotasAluno02.put("Portugues", nostasPortAluno02);
        discNotasAluno02.put("Matematica", nostasMateAluno02);
        discNotasAluno02.put("Ciencia", notasCienciaAluno02);

        alunosDisc.put("Maria", discNotasAluno02);

        System.out.println(alunosDisc);


//        Iterator mapIterator = alunosDisc.entrySet().iterator();
//        while (mapIterator.hasNext()) {
//            Map.Entry mapElement = (Map.Entry) mapIterator.next();
//            System.out.println(mapElement.getKey());
//            Iterator mapElementSubIterator = ((Map) mapElement.getValue()).entrySet().iterator();
//            Integer somaGeral = 0;
//            while (mapElementSubIterator.hasNext()) {
//                Map.Entry mapElementSub = (Map.Entry) mapElementSubIterator.next();
//                System.out.println(mapElementSub.getKey());
//                List<Integer> notas = (List<Integer>) mapElementSub.getValue();
//                Integer soma = 0;
//                for (Integer nota : notas) {
//                    soma += nota;
//                }
//                Integer media = soma / notas.size();
//                somaGeral += media;
//                System.out.println("Média da disciplina " + mapElementSub.getKey() + " é " + media);
//            }
//            Integer mediaGeral = somaGeral / 3;
//            System.out.println("Média da geral de " + mapElement.getKey() + " é " + mediaGeral);
//        }
    }

}
