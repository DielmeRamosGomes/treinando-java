package heranca;

public class Gerente extends Pessoa implements Atribuicoes {
    private float salario;
    protected  int idGerente;

    public Gerente(String nome, String cpf, int idade, float salario, int idGerente) {
        super(nome, cpf, idade);
        setSalario(salario);
        setIdGerente(idGerente);
    }

    public Gerente(String nome, String cpf, int idade, float salario) {
        super(nome, cpf, idade);
        setSalario(salario);
    }

    public int getIdGerente() {
        return idGerente;
    }

    public void setIdGerente(int idGerente) {
        this.idGerente = idGerente;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Gerente {nome = " + super.getNome() + ", cpf = " + super.getCpf() + ", idade = " + super.getIdade() + ", salario = " + getSalario() + "}";
    }

    public String imprimeGerente() {
        return "Gerente {nome = " + super.getNome() + ", cpf = " + super.getCpf() + ", idade = " + super.getIdade() + ", salario = " + getSalario() + ", idGerente = " + getIdGerente() + "}";
    }

    @Override
    public void comandoGerente() {
        System.out.println("O gerente manda o funcionário trabalhar em casa");
    }
}
