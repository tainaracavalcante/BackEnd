abstract class Conta {

    int numero;
    String agencia;
    String titular;
    double saldo;

    public Conta(int numero, String agencia, String titular, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Conta() {

    }

    void depositar(double valor) {
      saldo =  saldo + valor;
      IO.println("depositou:" + valor);
    }

    void sacar(double valor) {
        if (saldo < valor) {
            IO.println("Sem Saldo");
            return;
        }
        saldo = saldo - valor;
        IO.println("Saldo: " + saldo);
    }

     public abstract double calcularTarifaMensal();

    public void exibirSaldo() {
    }
}