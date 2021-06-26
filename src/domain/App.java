package domain;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {
        
        Curso cursoAnual = new Curso("Interfaces", new Mensalidade(new BigDecimal("250.00"), Periodicidade.ANUAL));
        Curso cursoMensal = new Curso("Interfaces", new Mensalidade(new BigDecimal("250.00"), Periodicidade.MENSAL));
        Curso cursoAvulso = new Curso("Interfaces", new Mensalidade(new BigDecimal("250.00"), Periodicidade.AVULSO));

        System.out.println("ANUAL " + cursoAnual.getValorComDesconto());
        System.out.println("MENSAL " + cursoMensal.getValorComDesconto());
        System.out.println("AVULSO " + cursoAvulso.getValorComDesconto());
    }
}
