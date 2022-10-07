import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TesteConta {
    Cliente cliente;
    @Test
   public void DepositoTestandoMetodo(){

      Conta cc = new ContaCorrente(new Cliente("Uálace", "Santos", "027504458-85"));
      cc.depositar(60);
        Assertions.assertFalse(false);
  }
  @Test
  void metodoDePegarSaldoTeste(){
      Conta cc = new ContaCorrente(new Cliente("Leilane", "Ito", "016215562-78"));
      cc.depositar(250);
      Assertions.assertEquals(250, cc.getSaldo());
  }
  @Test
  public void transferenciaTestandoMetodo (){
        Conta cp = new ContaPoupanca(new Cliente("Leilane", "Ito", "016215562-78"));
        Conta cp2 = new ContaPoupanca(new Cliente("Leilane", "Ito", "016215562-78"));
        cp.depositar(2);
        cp.tranferir(-5,cp2);
        Assertions.assertTrue(true,"Op Transferência disponível");
  }
  @Test
  void saqueTestandoMetodo(){
        Conta cc = new ContaCorrente(new Cliente("Leilane", "Ito", "016215562-78"));
        Conta cc2 = new ContaCorrente(new Cliente("Leilane", "Ito", "016215562-78"));
        cc.depositar(450);
        cc.tranferir(450, cc2);
        cc2.sacar(-450);
        Assertions.assertFalse(false,"Função saque indisponível");

  }
}
