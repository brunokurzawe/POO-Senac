package arrays;

public class CaixaEletronicoMain {

    public static void main(String[] args) {
        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};
        int[] qtdeCedulas = {2, 2, 1, 1, 1, 1, 0};
        int quantidadeTotal = 0;
        int valorReais = 178;
        String resultado = "";
        boolean semQtdeNotas = false;

        int totalCaixa = 0;
        for (int j = 0; j < qtdeCedulas.length; j++) {
            totalCaixa += qtdeCedulas[j] * cedulas[j];
        }
        System.out.println("Total de dinheiro no caixa: " + totalCaixa);

        if (valorReais > totalCaixa) {
            System.out.println("Saldo do caixa insuficiente!");
        } else {
            for (int i = 0; i < cedulas.length; i++) {

                int diferenca = 0;
                if (i == (cedulas.length - 1)) {
                    if (valorReais > (qtdeCedulas[i] * cedulas[i])) {
                        resultado = "Quantidade de notas disponiveis insuficientes para o valor solicitado!";
                        semQtdeNotas = true;
                    }
                }

                if (qtdeCedulas[i] == 0) {
                    continue;
                }

                int quantidadeCedulas = valorReais / cedulas[i];

                if (qtdeCedulas[i] < quantidadeCedulas) {
                    diferenca = (quantidadeCedulas - qtdeCedulas[i]) * cedulas[i];
                    quantidadeCedulas = qtdeCedulas[i];
                }

                resultado += "Quantidade de cedulas de " + cedulas[i] + ": " + quantidadeCedulas + "\n";

                valorReais %= cedulas[i];
                valorReais += diferenca;
                quantidadeTotal += quantidadeCedulas;
            }

            System.out.println(resultado);
            if (!semQtdeNotas) {
                System.out.println("Quantidade total: " + quantidadeTotal);
            }
        }
    }

}
