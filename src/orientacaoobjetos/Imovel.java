package orientacaoobjetos;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Imovel {
    String cor;
    String tipo;
    Integer numeroBanheiros;
    Integer numeroQuartos;
    String endereco;
    Double tamanho;
    BigDecimal valor;
    BigDecimal valorCondominio;
    LocalDate dataConstrucao;

    @Override
    public String toString() {
        return "Imovel{" +
                "cor='" + cor + '\'' +
                ", tipo='" + tipo + '\'' +
                ", valorCondominio=" + valorCondominio +
                ", dataConstrucao=" + dataConstrucao +
                '}';
    }
}
