package decorator;

public class EntregaExpressa extends PedidoDecorator {

    private static final double TAXA = 10.00;

    public EntregaExpressa(Pedido pedido) {
        super(pedido);
    }

    @Override
    public double getValor() {
        return super.getValor() + TAXA;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Entrega Expressa";
    }
}