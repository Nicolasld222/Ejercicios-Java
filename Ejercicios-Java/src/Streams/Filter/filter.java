package Streams.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filter {
    public static void main(String[] args) {
        List<String> Animales = Arrays.asList("Pez", "Tortuga", "Caballo", "Ballena");

        List<String> animalesFiltrados = Animales.stream()
                .filter(animales -> animales.startsWith("P"))
                .collect(Collectors.toList());

        System.out.println(animalesFiltrados);
    }
}
