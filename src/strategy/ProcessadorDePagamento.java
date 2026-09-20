package strategy;

public class ProcessadorDePagamento {
    private StrategyPagamento strategy;

    public void setStrategyPagamento(StrategyPagamento strategy) {
        this.strategy = strategy;
    }

    public void processar(double valor){
        this.strategy.calcularValorFinal(valor);
    }


}
