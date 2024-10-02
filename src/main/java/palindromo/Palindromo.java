package palindromo;

import java.util.LinkedList;
import java.util.Stack;

public class Palindromo {

    public static LinkedList<Integer> palindromo(int numero) {
        var pilha = new Stack<Integer>();
        var lista = new LinkedList<Integer>();
        while (numero > 0) {
            var resto = numero % 10;
            numero = numero / 10;
            pilha.push(resto);
        }
        while (!pilha.isEmpty()) {
            lista.addFirst(pilha.pop());
        }
        return lista;
    }

}
