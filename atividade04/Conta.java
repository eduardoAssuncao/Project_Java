package atividade04;

public class Conta implements Admin {

    private int numero;
    private double saldo;
    private double limite;
    private String nome;

    public Conta() {
        this.limite = 2000;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean saca(double valor) {
        
        if (valor <= saldo) {
            System.out.println("Saque feito com sucesso");
            saldo -= valor;
            System.out.println("Novo Saldo: "+ saldo);
            return true;
        } else {
            System.out.println("Limite para saque insuficiente");
            return false;
        }
    }

    @Override
    public void deposita(double valor) {
        
        saldo += valor;
        System.out.println("Novo Saldo: "+ saldo);
    }

    @Override
    public void transfere(int conta, double valor) {
        
        if (valor <= saldo && valor <= limite) {
            System.out.println("Transferência bem sucedida");
            saldo -= valor;
            System.out.println("Novo Saldo: "+ saldo);
        }else{
            System.out.println("Saldo insuficiente ou limite ultrapassado");
        }
    }

}
