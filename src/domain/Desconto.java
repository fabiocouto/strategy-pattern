package domain;

import java.math.BigDecimal;

public interface Desconto {

    BigDecimal calcular(BigDecimal valorMensalidade, Periodicidade periodicidade);
}
