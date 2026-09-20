package decorator;
public class EmbalagemTermicaViagem extends PedidoDecorator {

    private static final double TAXA = 5.00;

    public EmbalagemTermicaViagem(Pedido pedido) {
        super(pedido);
    }

    @Override
    public double getValor() {
        return super.getValor() + TAXA;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Embalagem Térmica para Viagem";
    }
}
