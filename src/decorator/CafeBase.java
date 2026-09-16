package decorator;

public class CafeBase implements Pedido {
    private String nome;
    private double preco;

    public CafeBase(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getDescricao() {
        return this.nome;
    }

    @Override
    public double getValor() {
        return this.preco;
    }
}