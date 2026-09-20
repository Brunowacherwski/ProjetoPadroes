package strategy;

public enum Modalidade {
    CREDITO("Crédito"),
    DEBITO("Débito");

    private final String descricao;

    Modalidade(String descricao) {
        this.descricao = descricao;
    }
}
