package orientacaoobjetos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlunoMain {

    public static void main(String[] args) {
        Aluno aluno01 = new Aluno();
        Map<String, List<Integer>> disciplinas = new HashMap<>();
        List<Integer> notasMatematica = new ArrayList<>();

        aluno01.codigo = 122334;
        aluno01.nome = "Dr. Webber";
        aluno01.dataNAscimento = LocalDate
                .of(1999, 12, 16);
        aluno01.endereco = "Rua tal de tal";
        aluno01.telefone = "48 999089410";

        notasMatematica.add(10);
        notasMatematica.add(9);
        disciplinas.put("Matematica", notasMatematica);
        aluno01.disciplinasNotas = disciplinas;
    }
}
