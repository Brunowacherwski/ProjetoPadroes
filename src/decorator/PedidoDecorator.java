package decorator;

public abstract class PedidoDecorator implements Pedido {
    protected Pedido pedido;

    public PedidoDecorator(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String getDescricao() {
        return pedido.getDescricao();
    }

    @Override
    public double getValor() {
        return pedido.getValor();
    }
}