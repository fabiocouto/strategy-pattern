package domain;

import java.math.BigDecimal;

public class CalculoDescontoMensalService implements Desconto{

    @Override
    public BigDecimal calcular(BigDecimal valorMensalidade, Periodicidade periodicidade) {
        return valorMensalidade.multiply(new BigDecimal("0.15"));
    }
}
