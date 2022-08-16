package orientacaoobjetos;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MenuMain {

    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        Integer op = 0;
        do {
            op = Integer.parseInt(JOptionPane
                    .showInputDialog(null,
                            "Menu de Opções \n 1- Cadastro \n 2 - Listagem \n 0 -Sair"));
            switch (op) {
                case 1:
                    String nomePessoa = JOptionPane
                            .showInputDialog(null,
                                    "Digite o nome da Pessoa: ");
                    String sobrenomePessoa = JOptionPane
                            .showInputDialog(null,
                                    "Digite o sobrenome da Pessoa: ");
                    String dataNascimento = JOptionPane
                            .showInputDialog(null,
                                    "Digite data de nascimento da Pessoa: ");
                    // "16/08/2016";
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
                    LocalDate dataNasc = LocalDate.parse(dataNascimento, formatter);

                    Pessoa pessoa = new Pessoa();
                    pessoa.nome = nomePessoa;
                    pessoa.sobrenome = sobrenomePessoa;
                    pessoa.dataNascimento = dataNasc;
                    pessoas.add(pessoa);
                    break;

                case 2:
                    String texto = "#### LISTAGEM DE PESSOAS #### \n";
                    texto += "Nome        Sobrenome\n";
                    for (Pessoa pessoa1 : pessoas) {
                        texto += pessoa1.nome + "        " + pessoa1.sobrenome+"\n";
                    }
                    texto += "##############################\n";
                    JOptionPane.showMessageDialog(null, texto);

                    break;
            }
        }
        while (op != 0);

        System.out.println(pessoas);
    }


}
