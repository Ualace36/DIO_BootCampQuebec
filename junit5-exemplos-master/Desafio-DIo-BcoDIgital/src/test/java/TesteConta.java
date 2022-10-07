import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TesteConta {
    Cliente cliente;
    @Test
   public void DepositoTestandoMetodo(){

      Conta cc = new ContaCorrente(new Cliente("Uálace", "Santos", "027504458-85"));
      cc.depositar(200);
        Assertions.assertEquals(200.00,cc.getSaldo());

  }
  @Test
  void metodoDePegarSaldoTeste(){
      Conta cc = new ContaCorrente(new Cliente("Leilane", "Ito", "016215562-78"));
      cc.depositar(20000);
      Assertions.assertEquals(20000, cc.getSaldo());
  }
  @Test
  public void transferenciaTestandoMetodo (){
        Conta cp = new ContaPoupanca(new Cliente("Leilane", "Ito", "016215562-78"));
        Conta cp2 = new ContaPoupanca(new Cliente("Leilane", "Ito", "016215562-78"));

        cp.depositar(250);
        cp.tranferir(150,cp2);
        Assertions.assertEquals(150,cp2.getSaldo());
  }
  @Test
  void saqueTestandoMetodo(){
        Conta cc = new ContaCorrente(new Cliente("Leilane", "Ito", "016215562-78"));
        Conta cc2 = new ContaCorrente(new Cliente("Leilane", "Ito", "016215562-78"));
        cc.depositar(450);
        cc.tranferir(450, cc2);
        cc2.sacar(450);
        Assertions.assertEquals(0, cc2.getSaldo());

  }
}
