import java.util.logging.Logger;

public abstract class Conta implements IConta{

    private static  final Logger LOGGER = Logger.getLogger(Conta.class.getName());
   private static final int AGENCIA_PADRAO = 001;
   private static  int SEQUENCIAL = 001;
    protected int agencia;
    protected   int numero;
    protected double saldo;


 public Conta() {
  this.agencia = AGENCIA_PADRAO;
  this.numero = SEQUENCIAL++;
 }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
     LOGGER.info("O MÉTODO getSaldo() foi acionado");
     return saldo;
    }

    @Override
    public void sacar(double valor) {
      LOGGER.info("O MÉTODO SACAR() FOI ACIANADO");
      saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        LOGGER.info("O MÉTODO DEPOSITAR() FOI ACIONADO");
        saldo += valor;
    }

    @Override
    public void tranferir(double valor, Conta contaDestino) {
        LOGGER.info("O MÉTODO TRANSFERIR() FOI ACIONADO");
     this.sacar(valor);
         contaDestino.depositar(valor);

    }

    protected void atributosComunsDeImpressao() {
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
