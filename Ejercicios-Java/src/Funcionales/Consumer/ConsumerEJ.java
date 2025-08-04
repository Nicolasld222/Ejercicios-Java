package Funcionales.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEJ {
    //Consumer es una interface funcional en Java que representa una operación
    //que toma un argumento de entrada y no devuelve ningún resultado.
    public static void main(String[] args) {
        List<String> herramientas = new ArrayList<>();
        herramientas.add("Martillo");
        herramientas.add("Pala");
        herramientas.add("Destornillador");


        Consumer<String> consumer = herramienta -> System.out.println("Se va a utilizar la herramienta: " + herramienta);
        herramientas.forEach(consumer);
    }
}
