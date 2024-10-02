package sobreescrita.teste;

import sobreescrita.Agente;
import sobreescrita.Jogador;

public class Main {
    public static void main(String[] args) {
        var agente = new Agente("Sebastião");
        var jogador = new Jogador("Dielme");
        agente.assinarContrato();
        jogador.assinarContrato();
    }
}
