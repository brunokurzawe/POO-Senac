package orientacaoobjetos;

import java.time.LocalDate;

public class DocumentoMain {
    public static void main(String[] args) {
        Documento doc1 = new Documento();
        doc1.codigo = 123456;
        doc1.nome ="Alfredo";
        doc1.foto="Img1.png";
        doc1.dataNascimento = LocalDate
                .of(1986,12,15);

        System.out.println(doc1);
    }
}


