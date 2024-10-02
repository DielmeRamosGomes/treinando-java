package palindromo.teste;

import palindromo.Palindromo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Digite um numero: ");
        var scanner = new Scanner(System.in);
        var numero = scanner.nextInt();
        System.out.println("O Palindromo de " + numero + " é = " + Palindromo.palindromo(numero));
    }
}
