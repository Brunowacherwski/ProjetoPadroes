# Atividade de Design de Software - Padrões de Projeto

Atividade prática desenvolvida para a disciplina de Design de Software com o objetivo de aplicar conceitos de Orientação a Objetos e Padrões de Projeto (GoF).

O projeto implementa o fechamento de pedidos de uma cafeteria (**Cafeteria Java**), utilizando dois padrões:

* **Decorator:** Adiciona taxas e itens extras ao pedido de forma dinâmica (como leite vaporizado, chantilly, embalagem especial e entrega rápida).
* **Strategy:** Permite selecionar e alternar formas de pagamento (Pix ou Cartão) sem usar estruturas de `if/else`.

## Estrutura das Pastas

* `decorator`: classes do pedido base e seus adicionais.
* `strategy`: interface e implementações das formas de pagamento.
* `checkout`: classe que finaliza a compra e a classe `Main`.

## Como Executar

1. Abra o projeto no IntelliJ IDEA.
2. Certifique-se de que a pasta `src` está marcada como **Sources Root**.
3. Execute a classe `Main.java` (em `src/checkout/Main.java`).
