package enumeradores;

public enum DiaSemana {
    SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);

    private int valor;

    DiaSemana(int valor) {
        this.valor = valor;
    }

    public static void imprimeTodosDiaSemana() {
        for (DiaSemana diaSemana: DiaSemana.values()) {
            System.out.println("Dia - " + diaSemana);
        }
    }

    public static void imprimeDiaSemana(DiaSemana diaSemana) {
        System.out.println("Dia - " + diaSemana + " Valor - " + diaSemana.valor);
    }

}
