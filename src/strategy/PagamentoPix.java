package strategy;

public class PagamentoPix implements StrategyPagamento{
    @Override
    public double calcularValorFinal(double valorDaCompra) {
        double desconto = valorDaCompra * 0.05;
        return valorDaCompra - desconto;
    }
}
