package Funcionales.BiConsumer;

import java.util.function.BiConsumer;

public class Biconsumer {
    //BiConsumer es una interface funcional en Java que se utiliza para representar una operación
    //que toma dos argumentos de entrada y no devuelve ningún resultado.
    public static void main(String[] args) {
        BiConsumer<String, Integer> printDetails = (TipoCel, Memoria) -> System.out.println("Su celular" + TipoCel +" tiene una capacidad de: " + Memoria + "GB de almacenamiento ");
        printDetails.accept("Iphone", 64);
        printDetails.accept("Samsung", 128);
    }
}
