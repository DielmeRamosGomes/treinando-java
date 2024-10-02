package sobreescrita;

public class Agente implements Contrato {
    private String nome = "";

    public Agente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void assinarContrato() {
        System.out.println("Avalia o contrato para o jogador");
    }
}
