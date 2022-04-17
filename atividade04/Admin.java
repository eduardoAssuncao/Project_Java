package atividade04;
public interface Admin {
    public abstract boolean saca(double valor);
    public abstract void deposita(double valor);
    public abstract void transfere(int Conta, double valor);
}
