package Funcionales.Function;

import java.util.function.Function;


public class FunctionEJ {
    //Function es una interface funcional que toma una entrada y devuelve una salida.
    public static void main(String[] args) {
        Function<String, String> toUpper = Estudiante -> Estudiante.toUpperCase();
        String EstudianteMayus = toUpper.apply("jose");
        System.out.println("El estudiante: " + EstudianteMayus);
    }
}
