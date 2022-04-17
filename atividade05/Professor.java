package atividade05;

public class Professor extends Funcionario {

    private float qHoras;
    private double nSalario;
    
    public Professor(String nome, double salario, float qHoras) {
        super(nome, salario);
        this.qHoras = qHoras;
    }

    public float getHorasAula() {
        return qHoras;
    }

    public void setHorasAula(float qHoras) {
        this.qHoras = qHoras;
    }
    
    public double bonus(){
        double adicional = (20 * qHoras);
        nSalario = adicional + getSalario();
        return nSalario;
    }
    
    public void gastos(double vGasto){
        nSalario -= vGasto;
    }
    
    @Override
    public void imprime()
    {
        super.imprime();
        System.out.println("Horas de Aula: "+ qHoras);
        System.out.println("Salário Total: "+ nSalario);
    }
}
