package orientacaoobjetos;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ImovelMain {

    public static void main(String[] args) {

        Imovel imovel01 = new Imovel();
        imovel01.numeroBanheiros = 2;
        imovel01.numeroQuartos = 4;
        imovel01.cor = "CINZA";
        imovel01.tamanho = 139.22;
        imovel01.tipo = "APARTAMENTO";
        imovel01.valor = BigDecimal.valueOf(300000L);
        imovel01.valorCondominio = BigDecimal.valueOf(300L);
        imovel01.dataConstrucao = LocalDate.of(1998,2,28);

        System.out.println(imovel01);
    }

}
