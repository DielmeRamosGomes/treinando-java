package enumeradores;

import java.util.Arrays;

public enum Cpf {
    CPF(GeraCpf.geraCpf());
    private final String valor;
    Cpf(StringBuilder[] cpf) {
        this.valor = Arrays.toString(cpf);
    }

    public static void imprimeCpf() {
        System.out.println("CPF - " + CPF.valor);
    }

}
