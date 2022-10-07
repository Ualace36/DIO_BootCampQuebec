public class Main {
    public static void main(String[] args) {
        Endereco enderecoHelena = new Endereco("Bela vista", "59", "São Francisco", "AP-02" , "Ilhéus", "Bahia");
        Conta cc;
        cc = new ContaCorrente(new Cliente("Helena", "Ito", "027751852-41", enderecoHelena));
        Conta pp = new ContaPoupanca(new Cliente("Helena", "Ito", "027751852-41", enderecoHelena));
        cc.depositar(200.00);
        cc.tranferir(95.00,pp);
        cc.imprimirExtrato();
        pp.imprimirExtrato();
    }
}