import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenaxaoList {
    public static void main(String[] args) {
        List<Gato> gato = new ArrayList<>() {{
            add(new Gato("Uálace", 37, "branco"));
            add(new Gato("Arthur", 3, "branco"));
            add(new Gato("Helena", 1, "rosa"));
            add(new Gato("Leilane", 36, "preto"));
        }};
        System.out.println(gato);
        System.out.println("***************************************");
        System.out.println("***************************************");
        System.out.println("Ordem de inserção: ");
        System.out.println(gato);
        System.out.println("***************************************");
        System.out.println("***************************************");
        System.out.println("Ordem aleatória");
        Collections.shuffle(gato);
        System.out.println(gato);
        System.out.println("***************************************");
        System.out.println("***************************************");
        System.out.println("Ordem natural: ");
        Collections.sort(gato);
        System.out.println(gato);
        System.out.println("***************************************");
        System.out.println("***************************************");
        System.out.println("Criar ordem por idade: ");
        Collections.sort(gato, new ComparateIdade());
        gato.sort(new ComparateIdade());
        System.out.println(gato);
       // gato.sort(new ComparateIdade());
        System.out.println("Ordem Nome/Cor/Idade");
        Collections.sort(gato, new ComparatePorCorNomeIdade());
        System.out.println(gato);
    }
}
