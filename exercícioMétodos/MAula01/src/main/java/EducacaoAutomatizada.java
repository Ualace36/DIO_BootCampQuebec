public class EducacaoAutomatizada {

    public static void mensagemDaHora(int hora){

        switch (hora){
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagemBomdia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                mensagemBoaTarde();
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 00:
            case 01:
            case 02:
            case 03:
                mensagemBoaNoite();
                break;
            default:
                System.out.println("Hora inválida, por favor, passe uma hora de 0 hora a 23 horas" );
                break;
        }

    }

    public static void mensagemBomdia(){
        System.out.println("Bom dia, cambada de devs, vamos codar!");
    }

    public static void mensagemBoaTarde(){
        System.out.println("Boa Tarde, cambada de devs, vamos codar!");
    }

    public static void mensagemBoaNoite(){
        System.out.println("Boa noite, cambada de devs, vamos codar!");
    }


}
