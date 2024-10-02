package sobreescrita;

public class Jogador implements Contrato {
    private String nome = "";

    public Jogador(String nome) {
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
        System.out.println("Contrato assinado!");
    }
}
