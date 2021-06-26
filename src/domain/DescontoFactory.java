package domain;

import java.util.HashMap;
import java.util.Map;

public class DescontoFactory {

    private Map<Periodicidade, Desconto> mapDescontoPeriodicidade;
    
    public DescontoFactory() {
        mapDescontoPeriodicidade = new HashMap<>();
        mapDescontoPeriodicidade.put(Periodicidade.ANUAL, new CalculoDescontoAnualService());
        mapDescontoPeriodicidade.put(Periodicidade.MENSAL, new CalculoDescontoMensalService());
        mapDescontoPeriodicidade.put(Periodicidade.AVULSO, new CalculoDescontoAvulsoService());
    }

    public Desconto criar(Periodicidade periodicidade){
        return mapDescontoPeriodicidade.get(periodicidade);
    }
}
