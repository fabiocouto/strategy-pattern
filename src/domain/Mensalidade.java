package domain;

import java.math.BigDecimal;

public class Mensalidade {

    private BigDecimal valor;
    private Periodicidade periodicidade;
    private Desconto desconto;

    public Mensalidade(BigDecimal valor, Periodicidade periodicidade) {
        this.valor = valor;
        this.periodicidade = periodicidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Periodicidade getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(Periodicidade periodicidade) {
        this.periodicidade = periodicidade;
    }

    public Desconto getDesconto() {
        DescontoFactory descontoFactory = new DescontoFactory();
        desconto = descontoFactory.criar(this.getPeriodicidade());
        return desconto;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mensalidade{");
        sb.append("valor=").append(valor);
        sb.append(", periodicidade=").append(periodicidade);
        sb.append(", desconto=").append(desconto);
        sb.append('}');
        return sb.toString();
    }
}
