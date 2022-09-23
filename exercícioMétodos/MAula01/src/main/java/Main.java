public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("***********************************************************************");
        System.out.println("***********************************************************************");

        System.out.println("Exercício métodos (calculadora)");
        Calculadora.soma(8,9);
        Calculadora.subtracao(23,11);
        Calculadora.multiplicacao(85,42);
        Calculadora.divisao(95,7);
        System.out.println("***********************************************************************");

        //Educação Automatizada
        System.out.println("***********************************************************************");
        System.out.println("Exercício da educação Automatixada");
        EducacaoAutomatizada.mensagemDaHora(12);
        EducacaoAutomatizada.mensagemDaHora(15);
        EducacaoAutomatizada.mensagemDaHora(22);
        EducacaoAutomatizada.mensagemDaHora(25);

        //Empréstimos

        System.out.println("***********************************************************************");
        System.out.println("***********************************************************************");
        System.out.println("Exercício emprestimos para devs");
        Emprestimo.calcular(5000,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(4000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(10000,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000,8);
    }
}
