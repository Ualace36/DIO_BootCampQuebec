import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetExempleOrdenacao {
    public static void main(String[] args) {

        Set<Serie> minhasSerie = new HashSet<>(){{
            add(new Serie("GoT", "Fantasia", 60));
            add(new Serie("A casa do Dragão", "Fantasia", 45));
            add(new Serie("O poder do Anel", "Fantasia", 55));
        }};
        for (Serie serie: minhasSerie){
            System.out.println("Nome: " + serie.getNome() + " - Genero: " + serie.getGenero()+ " - Tempo do Episódio: " + serie.getTempoEpisodio() + " Min" );
        }

    }
}