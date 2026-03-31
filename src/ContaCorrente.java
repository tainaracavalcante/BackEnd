public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }


    public double calcularTarifaMensal() {
        return 12;
    }
}