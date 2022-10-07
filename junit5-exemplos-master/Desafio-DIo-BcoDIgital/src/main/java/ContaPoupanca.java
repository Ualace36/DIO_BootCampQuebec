public class ContaPoupanca extends Conta {
     Cliente cliente;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato () {
            System.out.println("*** Extrato Conta Poupança ***");
            super.atributosComunsDeImpressao();
    }
}