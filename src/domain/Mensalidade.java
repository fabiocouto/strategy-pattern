package domain;

import java.math.BigDecimal;

public class Mensalidade {

    private BigDecimal valor;
    private Periodicidade periodicidade;

    public Mensalidade(BigDecimal valor, Periodicidade periodicidade) {
        this.valor = valor;
        this.periodicidade = periodicidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Periodicidade getPeriodicidade() {
        return periodicidade;
    }

    public Desconto getDesconto() {
        DescontoFactory descontoFactory = new DescontoFactory();
        return descontoFactory.criar(this.getPeriodicidade());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mensalidade{");
        sb.append("valor=").append(valor);
        sb.append(", periodicidade=").append(periodicidade);
        sb.append('}');
        return sb.toString();
    }
}
