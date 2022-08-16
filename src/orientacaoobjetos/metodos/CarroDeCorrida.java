package orientacaoobjetos.metodos;

public class CarroDeCorrida {

    String identificacao;
    Double velocidadeAtual;
    Double velocidadeMaxima;

    void ligar() {
        System.out.println("Vruuummmmmmm");
    }

    void desligar() {
        System.out.println("Mmnmmmmmmmmm");
    }

    void acelerar() {
        velocidadeAtual += 10.00;
        if (velocidadeAtual > velocidadeMaxima) {
            velocidadeAtual = velocidadeMaxima;
        }
    }

    void frear(Integer intensidadeFreada) {
        if (intensidadeFreada > 100) {
            intensidadeFreada = 100;
        } else if (intensidadeFreada < 0) {
            intensidadeFreada = 0;
        }
        velocidadeAtual -= intensidadeFreada * 0.25;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0.00;
        }
    }

}


