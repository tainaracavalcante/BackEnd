public enum StatusPedido {

    AGUARDANDO_PAGAMENTO("Aguardando pagamento do cliente"),
    PROCESSANDO("Pedido está sendo preparado"),
    ENVIADO("Pedido está sendo enviado"),
    ENTREGUE("Pedido foi entregue ao cliente"),
    CANCELADO("Pedido cancelado");

    private String descricao;

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
