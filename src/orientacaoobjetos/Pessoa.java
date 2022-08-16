package orientacaoobjetos;

import java.time.LocalDate;

public class Pessoa {

    String nome;
    String sobrenome;
    LocalDate dataNascimento;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
