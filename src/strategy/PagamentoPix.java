package strategy;

public class PagamentoPix implements StrategyPagamento{
    @Override
    public double calcularValorFinal(double valorDaCompra) {
        double desconto = valorDaCompra * 0.05;
        double valorFinal = valorDaCompra - desconto;

        System.out.printf("Desconto de 5%% (R$ %.2f) aplicado.%n", desconto);
        System.out.printf("Total via PIX: R$ %.2f%n", valorFinal);
        return valorFinal;
    }
}
