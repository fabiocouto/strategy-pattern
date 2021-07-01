package domain;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculoDescontoMensalService implements Desconto{

    private static final String QUINZE_POR_CENTO = "0.15";

    @Override
    public BigDecimal calcular(BigDecimal valorMensalidade, Periodicidade periodicidade) {
        return valorMensalidade.multiply(new BigDecimal(QUINZE_POR_CENTO))
                .setScale(2, RoundingMode.HALF_EVEN);
    }
}
