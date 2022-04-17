package atividade06;

public class Seletista extends Professor {
    
    private double salario = 1000.00;
    
    public Seletista(int matricula, String nome, int idade) {
        super(matricula, nome, idade); 
    }

    @Override
    public String toString() {
        return "Seletista: \n" + "Matrícula = " + getMatricula() + "\nNome = " + getNome() + "\nIdade = " + getIdade() + "\nSalário = " + salario;
    }
}
