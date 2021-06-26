package domain;

import java.math.BigDecimal;

public class Curso {

    private String descricao;
    private Mensalidade mensalidade;

    public Curso(String descricao, Mensalidade mensalidade) {
        this.descricao = descricao;
        this.mensalidade = mensalidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Mensalidade getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(Mensalidade mensalidade) {
        this.mensalidade = mensalidade;
    }

    public BigDecimal getValorComDesconto(){
        final BigDecimal valor = getMensalidade().getValor();
        return valor
                .subtract(mensalidade.getDesconto()
                                  .calcular(valor, mensalidade.getPeriodicidade()));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Curso{");
        sb.append("descricao='").append(descricao).append('\'');
        sb.append(", mensalidade=").append(mensalidade);
        sb.append('}');
        return sb.toString();
    }
}
