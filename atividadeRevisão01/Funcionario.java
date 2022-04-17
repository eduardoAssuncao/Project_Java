package atividadeRevisão01;
public class Funcionario {
    private String nome;
    private long cpf;
    private double salario;

    public Funcionario(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario:\n" + "Nome = " + nome + "\nCpf = " + cpf + "\nSalario = R$" + salario + "";
    }

    
}
