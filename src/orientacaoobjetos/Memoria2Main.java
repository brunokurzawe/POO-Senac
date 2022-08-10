package orientacaoobjetos;

public class Memoria2Main {
    public static void main(String[] args) {
        Documento doc1 = new Documento();
        doc1.nome = "Alfredo";
        Documento doc2 = doc1;
        doc2.nome = "Juliana";
        Documento doc3 = new Documento();
        doc3.nome = "Ralaela";
        doc2 = doc3;

        System.out.println(doc1);
        System.out.println(doc2);
    }
}
