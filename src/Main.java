public class Main {
  public static void main(String[] args) {

    Conta cc = new ContaCorrente(1, "001", "Tainara", 1000.0);
    Conta cp = new ContaPoupanca(2, "001", "Joao", 2000);
    Conta pj = new ContaPessoaJuridica(3, "001", "Empresa Tix",5000);

    IO.println("Conta Corrente");
    cc.depositar(200);
    cc.sacar(150);
    cc.exibirSaldo();
    IO.println("Tarifa Mensal: R$" + cc.calcularTarifaMensal());

    IO.println("Conta Poupanca");
    cp.depositar(300);
    cp.sacar(100);
    cp.exibirSaldo();
    IO.println("Tarifa Mensal: R$" + cp.calcularTarifaMensal());

    IO.println("Conta PJ");
    pj.depositar(500);
    pj.sacar(200);
    pj.exibirSaldo();
    IO.println("Tarifa Mensal: R$" + pj.calcularTarifaMensal());
    }
  }