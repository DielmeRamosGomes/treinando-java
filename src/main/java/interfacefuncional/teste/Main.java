package interfacefuncional.teste;

import interfacefuncional.OperacoesMatematicas;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        OperacoesMatematicas adicao = (lista) -> {
            int soma = 0;
            for (Integer elemento : lista) {
                soma += elemento;
            }
            return soma;
        };

        OperacoesMatematicas multiplicacao = (lista) -> {
            int resultado = 1;
            for (Integer elemento : lista) {
                resultado *= elemento;
            }
            return resultado;
        };

        int soma = adicao.operacao(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("Soma = " + soma);

        int multi = multiplicacao.operacao(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Multiplicação = " + multi);

    }
}
