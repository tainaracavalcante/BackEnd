public class ContaPessoaJuridica extends Conta {

    public ContaPessoaJuridica(int numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    public ContaPessoaJuridica() {
        super();
    }

    void sacar(double valor) {
        double taxa = 1.5;
        super.sacar(valor + taxa);
    }

    @Override
    public double calcularTarifaMensal(){
        return 20;
    }
}