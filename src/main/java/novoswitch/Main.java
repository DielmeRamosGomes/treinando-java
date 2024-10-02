package novoswitch;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog(null, "Digite um numero ");
        int diaDaSemana = Integer.parseInt(numero);

        String nomeDoDia = switch (diaDaSemana) {
            case 1 -> "Segunda-feira";
            case 2 -> "Terça-feira";
            case 3 -> "Quarta-feira";
            case 4 -> "Quinta-feira";
            case 5 -> "Sexta-feira";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> throw new IllegalArgumentException("Número do dia inválido: " + diaDaSemana);
        };

        JOptionPane.showMessageDialog(null, "O dia da semana é " + nomeDoDia);
    }
}
