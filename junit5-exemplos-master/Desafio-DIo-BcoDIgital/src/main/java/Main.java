public class Main {
    public static void main(String[] args) {
        Conta cc;
        cc = new ContaCorrente();
        Conta pp = new ContaPoupanca();
        cc.depositar(200.00);
        cc.tranferir(95.00,pp);
        cc.imprimirExtrato();
        pp.imprimirExtrato();
    }
}