import decorator.Pedido;
import decorator.CafeBase;
import decorator.LeiteVaporizado;
import decorator.EmbalagemTermicaViagem;
import strategy.Modalidade;
import strategy.StrategyPagamento;
import strategy.PagamentoPix;
import strategy.PagamentoCartao;

public class Main {
    public static void main(String[] args) {
        Pedido meuCafe = new CafeBase("Café Comum", 19.99);
        meuCafe = new LeiteVaporizado(meuCafe);
        meuCafe = new EmbalagemTermicaViagem(meuCafe);

        StrategyPagamento pagamentoPix = new PagamentoPix();

        Checkout checkout = new Checkout(meuCafe, pagamentoPix);
        checkout.finalizarCompra();

        System.out.println("    Cliente mudou de ideia e vai pagar no cartão    ");

        StrategyPagamento pagamentoCartao = new PagamentoCartao("Lucas Correia", "000111222333444", Modalidade.CREDITO, "01/27", "666", "14360143958");
        checkout.setStrategyPagamento(pagamentoCartao);
        checkout.finalizarCompra();
    }
}