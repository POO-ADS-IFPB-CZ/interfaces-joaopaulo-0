public class Main {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca(10, "João Paulo");

        contaPoupanca.depositar(100000);
        System.out.println("Saldo após o depósito:");
        contaPoupanca.exibirSaldo();

        contaPoupanca.reajustar(22);
        System.out.println("Saldo após o reajuste de 22%:");
        contaPoupanca.exibirSaldo();
    }
}