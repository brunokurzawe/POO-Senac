package orientacaoobjetos;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Aluno {

    Integer codigo;
    String nome;
    LocalDate dataNAscimento;
    String telefone;
    String endereco;
    Map<String, List<Integer>> disciplinasNotas;

    @Override
    public String toString() {
        return "Aluno{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", dataNAscimento=" + dataNAscimento +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                ", disciplinasNotas=" + disciplinasNotas +
                '}';
    }
}
