package listas;

import java.util.Random;
import java.util.Stack;

public class Pilha {

    public static void imprimePilha() {
        var pilha = new Stack<Integer>();
        var random = new Random();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        System.out.println(pilha);
        pilha.stream().
                map(elemento -> random.nextInt(9)).
                forEach(elemento -> System.out.print(elemento + " "));
    }

}
