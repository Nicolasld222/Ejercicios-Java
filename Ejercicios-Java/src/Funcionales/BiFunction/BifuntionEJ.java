package Funcionales.BiFunction;

import java.util.function.BiFunction;

public class BifuntionEJ {
    //BiFunction en Java funcional representa una función
    //que toma dos argumentos de diferentes tipos y produce un resultado de otro tipo.
    public static void main (String [] arg){
        BiFunction Aprendiz = (Nombre, Ficha) -> "El estudiante: "+Nombre + " Pertenece a la ficha: " + Ficha;
        System.out.println(Aprendiz.apply("Jose Fernando", "2994283")); 
    }
}
