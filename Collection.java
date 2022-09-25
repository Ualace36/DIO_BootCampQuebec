import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Collection {
    public static void main(String[] args) {

        //Crie uma lista e adicione as sete notas:

        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(5d);
        notas.add(3.2);
        notas.add(9.1);
        notas.add(8d);
        notas.add(4d);
        System.out.println(notas);
        System.out.println(notas.toString());
        System.out.println("**************************************************");
        System.out.println("**************************************************");

        // Exiba a posição da nota 5.0

        System.out.println("Exiba a posição da nota 5.0, é: " + notas.indexOf(5d));

        System.out.println("**************************************************");
        System.out.println("adicione na lista a nota 8.0 na posição 4: "  );
        notas.add(4,8d);
        System.out.println(notas);
        System.out.println("**************************************************");
        System.out.println("**************************************************");
        System.out.println("Substitua a nota 5.0 pela 6.0: ");
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);
        System.out.println("**************************************************");
        System.out.println("**************************************************");
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
        System.out.println("**************************************************");
        System.out.println("**************************************************");
        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for (Double nota: notas) {
            System.out.println(nota);
        }
        System.out.println("**************************************************");
        System.out.println("**************************************************");
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());
        System.out.println("**************************************************");
        System.out.println("**************************************************");
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("**************************************************");
        System.out.println("**************************************************");
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        System.out.println("**************************************************");
        System.out.println("**************************************************");

        System.out.println("Exiba a soma da lista: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;

        }

        System.out.println(soma.intValue());
        System.out.println("**************************************************");
        System.out.println("**************************************************");
        System.out.println("Exiba a média das notas: " + (soma.intValue() / notas.size()));
        System.out.println("**************************************************");
        System.out.println("**************************************************");
        System.out.println(notas);
        System.out.println("Remova a nota 8: " );
        notas.remove(8d);
        System.out.println(notas);
        System.out.println("**************************************************");
        System.out.println("**************************************************");
        System.out.println("Remova os elementos menores que 5: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
           Double next = iterator1.next();
            if (next < 5) iterator1.remove();
        }
        System.out.println(notas);
        System.out.println("**************************************************");
        System.out.println("**************************************************");
        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);
        System.out.println("**************************************************");
        System.out.println("**************************************************");
        System.out.println("A lista está vazia, é uma afirmação True ou false? " + notas.isEmpty() + notas);
        
    }

}
