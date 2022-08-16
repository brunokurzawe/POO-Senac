package orientacaoobjetos.metodos;

public class CarroDeCorridaMain {

    public static void main(String[] args) {
        CarroDeCorrida f144 = new CarroDeCorrida();
        f144.identificacao = "#44 LH";
        f144.velocidadeAtual = 0.00;
        f144.velocidadeMaxima = 321.6;

        f144.ligar();
        f144.acelerar();
        f144.acelerar();
        f144.acelerar();
        f144.acelerar();
        f144.frear(30);
        f144.frear(30);
        f144.frear(100);

        System.out.println(f144.velocidadeAtual);
        f144.desligar();
    }

}
