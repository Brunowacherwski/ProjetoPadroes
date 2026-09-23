package strategy;

public class PagamentoCartao implements StrategyPagamento{
    private String nomeTitular;
    private String numeroDoCartao;
    private Modalidade modalidade;
    private String validade;
    private String cvv;
    private String cpfDoTitular;

    public PagamentoCartao(String nomeTitular, String numeroDoCartao, Modalidade modalidade, String validade, String cvv, String cpfDoTitular) {

        if (cvv == null || !cvv.matches("\\d{3}")) {
            System.out.println("O CVV precisa conter necessáriamente 3 dígitos numéricos!");
            System.exit(0);
        }

        String cpfLimpo = cpfDoTitular != null ? cpfDoTitular.replaceAll("\\D", "") : "";
        if (cpfLimpo.length() != 11){
            System.out.println("O CPF do titular deve conter exatamente 11 dígitos numéricos!");
            System.exit(0);
        }

        String cartaoLimpo = numeroDoCartao != null ? numeroDoCartao.replaceAll("\\D", "") : "";
        if (cartaoLimpo.length() < 13 || cartaoLimpo.length() > 16) {
            System.out.println("O número do cartão deve ter entre 13 e 16 dígitos numéricos!");
            System.exit(0);
        }

        if (validade == null || !validade.matches("^(0[1-9]|1[0-2])/[0-9]{2}$")) {
            System.out.println("A validade deve estar no formato MM/AA!");
            System.exit(0);
        }

        if (modalidade == null) {
            System.out.println("A modalidade do cartão deve ser informada!");
            System.exit(0);
        }

        this.nomeTitular = nomeTitular;
        this.numeroDoCartao = cartaoLimpo;
        this.modalidade = modalidade;
        this.validade = validade;
        this.cvv = cvv;
        this.cpfDoTitular = cpfLimpo;
    }

    @Override
    public double calcularValorFinal(double valorDaCompra) {
        System.out.println("Processando pagamento na modalidade: " + modalidade);
        System.out.printf("Total pago no cartão: R$ %.2f%n", valorDaCompra);
        return valorDaCompra;
    }
}
