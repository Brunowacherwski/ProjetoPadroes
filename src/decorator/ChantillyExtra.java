package decorator;
public class ChantillyExtra extends PedidoDecorator {

    private static final double TAXA = 2.50;

    public ChantillyExtra(Pedido pedido) {
        super(pedido);
    }

    @Override
    public double getValor() {
        return super.getValor() + TAXA;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Chantilly Extra";
    }
}
