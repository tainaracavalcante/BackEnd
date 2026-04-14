public class Main {

    public static void main(String[] args){

        Pedido pedido = new Pedido(1, "Tainara");
        IO.println("Pedido criado" + pedido.getStatus());

        pedido.avancarStatus();
        pedido.avancarStatus();

        pedido.cancelarPedido();

        pedido.avancarStatus();

        IO.println("Status final:" + pedido.getStatus());
    }
}