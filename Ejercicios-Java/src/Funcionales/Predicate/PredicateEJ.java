package Funcionales.Predicate;

import java.util.function.Predicate;

public class PredicateEJ {
    //la interface funcional Predicate representa una función
    // que acepta un argumento y devuelve un valor booleano.
    public static void main(String[] args) {
        Ciclovia ciclovia = new Ciclovia(false);

        Predicate<Ciclovia> estado = Ciclovia::isActivo;

        if(estado.test(ciclovia)) {
            System.out.println("La ciclovia esta Activa");
        } else{
            System.out.println("La ciclovia esta desactivada");
        }
    }

}
