package Funcionales.Supplier;

import java.util.function.Supplier;

public class SupplierEJ {
    //Supplier es una interface funcional que representa una función
    //que no toma argumentos y devuelve un valor de tipo genérico.
    public static void main (String [] arg) {
        Supplier getMessage = () -> "Hola, Estudiantes";
        System.out.println(getMessage.get());
    }
}
