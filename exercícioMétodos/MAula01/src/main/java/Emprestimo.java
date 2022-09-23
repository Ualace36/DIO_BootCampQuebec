public class Emprestimo {

    public static void calcular(double valor, int parcelas){
        if(parcelas == 2) {
           double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("Valor final a pagar para 02 parcelas: R$ " + valorFinal);
        } else if (parcelas == 3) {
            double valorFinal = valor + (valor + getTaxaTresParcelas());
            System.out.println("Valor final a pagar para 03 parcelas: R$ " + valorFinal);
        } else {
            System.out.println("Quantidade de parcelas não aceitas");
        }
    }

    private static double getTaxaTresParcelas() {
        return 0.45;
    }

    private static double getTaxaDuasParcelas() {
       return 0.3;
    }

    public static int getDuasParcelas(){
        return 2;
    }

    public static int getTresParcelas(){
        return 3;
    }

}


