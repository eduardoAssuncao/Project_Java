package atividade06;

public class Horista extends Professor {
    
    private double salario;
    
    public Horista(int matricula, String nome, int idade) {
        super(matricula, nome, idade);
    }
    
    public double retornaSalario(double qtHoras, double valorHora){
        salario = qtHoras * valorHora;        
        return this.salario;
    }

    @Override
    public String toString() {
        return "Horista: \n" + "Matrícula = " + getMatricula() + "\nNome = " + getNome() + "\nIdade = " + getIdade() + "\nSalário = " + salario;
    }
}