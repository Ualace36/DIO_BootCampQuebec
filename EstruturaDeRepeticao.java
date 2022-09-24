import  java.util.Random;
public class EstruturaDeRepeticao {
    public static void main(String[] args) {


    // Controle de Fluxo For
    for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos++){
        System.out.println("***************************************************");
        System.out.println("****************************************************");

        System.out.println("Contando carneirinhos" + carneirinhos);
    }

        System.out.println("João dormiu");
        System.out.println("****************************************************");

       //Exemplo For Array
        String alunos [] = {"Arthur", "Helena", "Leilane", "Uálace"};
        for (int x = 0;x < alunos.length; x++) {

            System.out.println("O aluno no índice x=" + x + " é "+ alunos[x]);
        }

        System.out.println("************************************************");
        System.out.println("************************************************");

        //Exemplo de For / each
        String alunos1 [] = {"Arthur", "Helena", "Leilane", "Uálace"};
        for (String aluno1: alunos1) {
            System.out.println("Nome do aluno é " + aluno1);
        }

        // Implementanto o Break e o Cntinue na estrutura for
       // Exemplo Break
        for (int num = 1; num <= 5; num++){
            if (num==3)
                break;
            System.out.println(num);
        }
        System.out.println("************************************************");
        System.out.println("************************************************");
    //Exemplo Continue
        for (int num = 1; num <= 5; num++){
            if (num==3)
                continue;
            System.out.println(num);
        }
        System.out.println("************************************************");
        System.out.println("************************************************");

        //Exemplo DoWhile
        System.out.println("Diacando...");
        do {
            System.out.println("telefone tocando");
        }while (tocando());
        System.out.println("Alô !!!");

    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
            System.out.println("Atendeu?" + atendeu);
            //negando o ato de continuar tocando
            return ! atendeu;

    }
}





