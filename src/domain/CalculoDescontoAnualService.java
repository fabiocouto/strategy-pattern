package domain;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculoDescontoAnualService implements Desconto {

    private static final String TRINTA_POR_CENTO = "0.3";

    @Override
    public BigDecimal calcular(BigDecimal valorMensalidade, Periodicidade periodicidade) {
        return valorMensalidade.multiply(new BigDecimal(TRINTA_POR_CENTO))
                .setScale(2, RoundingMode.HALF_EVEN);
    }
}
