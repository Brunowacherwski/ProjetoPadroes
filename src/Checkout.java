import decorator.Pedido;
import strategy.StrategyPagamento;

public class Checkout {
    private Pedido pedido; // Interface do Decorator
    private StrategyPagamento StrategyPagamento; // Interface do Strategy
    
    public Checkout(Pedido pedido, StrategyPagamento StrategyPagamento) {
        this.pedido = pedido;
        this.StrategyPagamento = StrategyPagamento;
    }

    public void setStrategyPagamento(StrategyPagamento StrategyPagamento) {
        this.StrategyPagamento = StrategyPagamento;
    }

    public void finalizarCompra() {
        double valorTotal = pedido.getValor();
        System.out.println("Itens: " + pedido.getDescricao());
        System.out.println("Valor sem desconto: R$ " + valorTotal);
        StrategyPagamento.calcularValorFinal(valorTotal);
    }
}