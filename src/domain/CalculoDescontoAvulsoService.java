package domain;

import java.math.BigDecimal;

public class CalculoDescontoAvulsoService implements Desconto {

    @Override
    public BigDecimal calcular(BigDecimal valorMensalidade, Periodicidade periodicidade) {
        return valorMensalidade.multiply(BigDecimal.ZERO);
    }
}
