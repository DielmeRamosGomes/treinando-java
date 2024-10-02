package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Listas {

    public static void imprimeUmaLista() {
        var lista = new ArrayList<Integer>();
        var random = new Random();
        for (int i = 0; i < 11; i++) {
            lista.add(random.nextInt(9));
        }
        System.out.println("A lista é " + lista);
    }

    public static void imprimeListaStream() {
        var lista = new ArrayList<Integer>();
        var random = new Random();
        for (int i = 0; i < 10; i++) {
            lista.add(i);
        }
        lista.stream().
                map(elemento -> random.nextInt(9)).
                forEach(elemento -> System.out.print(elemento + " "));
    }


}
