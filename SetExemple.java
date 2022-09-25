import java.util.*;

public class SetExemple {
    public static void main(String[] args) {

        System.out.println("Crie um conjunto e adicione as notas");
        System.out.println("No Set não aceita elementos repetidos");
        System.out.println("No Set não não é possível trabalhar com métodos que utilizam posições como no List");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8d, 8d,5.8,7.4,2d,4.9));
        System.out.println(notas);
        System.out.println("*****************************************");
        System.out.println("*****************************************");
        System.out.println("Verifica se a nota 5.0 contém no Set: " + notas.contains(5d));
        System.out.println("*****************************************");
        System.out.println("*****************************************");
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("*****************************************");
        System.out.println("*****************************************");
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        System.out.println("*****************************************");
        System.out.println("*****************************************");
        System.out.println("Exiba a soma do Set: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);
        System.out.println("*****************************************");
        System.out.println("*****************************************");
        System.out.println("Exiba a média das notas no Set: " + soma / notas.size());
        System.out.println("*****************************************");
        System.out.println("*****************************************");
        System.out.println("Remova as notas menores que 7.0 : " );
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7)
                iterator1.remove();
        }
        System.out.println(notas);

    }
}
