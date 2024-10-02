package heranca.teste;

import heranca.Gerente;
import heranca.Pessoa;

public class Main {
    public static void main(String[] args) {
        var pessoa = new Pessoa("Dielme", "413.986.408-75", 30);
        System.out.println(pessoa);

        var gerente = new Gerente("Paulinho", "123.456.789-12", 32, 8000F);
        System.out.println(gerente);
        gerente.comandoGerente();

        var gerente2 = new Gerente("Paulinho", "123.456.789-12", 32, 8000F, 123);
        System.out.println(gerente2.imprimeGerente());
        System.out.println(gerente2.getIdGerente());

    }
}
