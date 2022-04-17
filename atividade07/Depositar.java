package atividade07;

public class Depositar {

    private double saldo;
    
    public Depositar(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void deposito(double valor){
        try{
            if(valor > 0){
                saldo += valor;
                System.out.println("Valor depositado");
            }
            else{
                throw new IllegalArgumentException("Depósito inválido!");
            }
        }catch(IllegalArgumentException e){
            System.err.println("Exception: Houve um erro ao depositar " + e);
        }
        
    }

    @Override
    public String toString() {
        return "saldo = R$" + saldo + '}';
    }
    
    

}
