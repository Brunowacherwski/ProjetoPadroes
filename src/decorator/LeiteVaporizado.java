package decorator;

public class LeiteVaporizado extends PedidoDecorator {

    private static final double TAXA = 3.00;

    public LeiteVaporizado(Pedido pedido) {
        super(pedido);
    }

    @Override
    public double getValor() {
        return super.getValor() + TAXA;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Leite Vaporizado";
    }
}