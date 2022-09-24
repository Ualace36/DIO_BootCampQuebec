public class FluxoControleMainClass {
    public static void main(String[] args) {

        System.out.println("************************************************************");
        //Exemplo de condição simples
        int saldo;
        saldo = 29;
        int valorSolicitado = 12;
        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;
        System.out.println(saldo);
        System.out.println("************************************************************");
        //Exemplo de condição composta

        int nota = 5;
        if(nota >= 7)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");
        System.out.println("************************************************************");
        //Exemplo de condição encadeada

        int nota2 = 2;
        if(nota2 >= 7)
            System.out.println("Aluno Aprovado");
        else if (nota2 >=5 && nota2 < 7)
            System.out.println("Aluno em Recuperação");
        else
        System.out.println("Aluno reprovado");

        System.out.println("****************************************************************");
        System.out.println("****************************************************************");
        //Condição Ternária

        double nota3 = 7.9;
        String resultado = nota3 >=7 ? "Aprovado" : "Reprovado";
        System.out.println("O resultado é " + resultado);

        System.out.println("************************************************************");


        double nota4 = 2.7;
        String resultado2 = nota4 >=7 ?  "Aprovado" : nota4 >=5 && nota4 <7 ?"Recuperação": "Reprovado";
        System.out.println("Resultado: " + resultado2);
        System.out.println("************************************************************");
        System.out.println("************************************************************");
        //Switch Case
        String sigla = "A";
        switch (sigla){
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MÉDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");

        }

    }
}
