package enumeradores;

import java.util.Random;

public class GeraCpf {

    public static StringBuilder[] geraCpf() {
        var random = new Random();
        var cpfInt = new Integer[14];
        var cpf = new StringBuilder[14];

        for (int i = 0; i < cpfInt.length; i++) {
            cpfInt[i] = random.nextInt(9);
            cpf[i] = new StringBuilder(Integer.toString(cpfInt[i]));
        }
        cpf[3] = new StringBuilder(".");
        cpf[7] = new StringBuilder(".");
        cpf[11] = new StringBuilder("-");
        return cpf;
    }

}
