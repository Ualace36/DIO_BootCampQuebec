import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Endereco enderecoHelena = new Endereco("Bela Vista","59", "São Francisco", "AP-02" , "Ilhéus", "Bahia");
        Conta cc;
        cc = new ContaCorrente(new Cliente("Helena", "Ito", "027751852-41", enderecoHelena));
        Conta pp = new ContaPoupanca(new Cliente("Helena", "Ito", "02750545", enderecoHelena));
        System.out.println("****************************************************************************************************************************");
        cc.depositar(2500);
        System.out.println("****************************************************************************************************************************");
        cc.tranferir(125,pp);
        System.out.println("****************************************************************************************************************************");
        cc.imprimirExtrato();
        System.out.println("****************************************************************************************************************************");
        pp.imprimirExtrato();
        System.out.println("****************************************************************************************************************************");
        System.out.println(cc.sacar(120));
        System.out.println("****************************************************************************************************************************");
        List<Cliente> contas = new ArrayList<>();
        contas.add(cc.getCliente());
        contas.add(pp.getCliente());
        System.out.println("****************************************************************************************************************************");
        System.out.println("Lista de Contas de Clientes: " + contas.stream().toList());
    }
}