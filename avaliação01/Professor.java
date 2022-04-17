package avaliação01;
public class Professor extends Pessoa {
    private float valor_hora_trabalhada;
    private float qtde_horas_disciplina;
    private double salario;
    private double nSalario;
    private String area_atuação;
    
    public Professor(){
    
    }

    public String getArea_atuação() {
        return area_atuação;
    }

    public void setArea_atuação(String area_atuação) {
        this.area_atuação = area_atuação;
    }

    public float getValor_hora_trabalhada() {
        return valor_hora_trabalhada;
    }

    public void setValor_hora_trabalhada(float valor_hora_trabalhada) {
        this.valor_hora_trabalhada = valor_hora_trabalhada;
    }

    public float getQtde_horas_disciplina() {
        return qtde_horas_disciplina;
    }

    public void setQtde_horas_disciplina(float qtde_horas_disciplina) {
        this.qtde_horas_disciplina = qtde_horas_disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        try{
            if(salario > 0){
                this.salario = salario;
        }
            else{
                throw new IllegalArgumentException("Salário inválida!");
            }
        }catch(IllegalArgumentException e){
            System.err.println("Exception: Houve um erro ao inserir o salário " + e);
        }
        
    }  

    public double getnSalario() {
        return nSalario;
    }

    public void setnSalario(double nSalario) {
        this.nSalario = nSalario;
    }
    
    public double calcularSalario(float valor_hora_trabalhada, float qtde_horas_disciplina){
        salario = (this.valor_hora_trabalhada * this.qtde_horas_disciplina);
        return salario;
    }
    
    public double calcularBonus(){
        nSalario = salario + (salario * 0.25);
        return nSalario;
    }
    
    public void exibirDadosProfessor(){
        System.out.println("Nome: "+ getNome() + " Email: "+ getEmail() + " Código: " + getCodigo() + " Salario: R$" + getSalario() + " Bonificação: R$" + getnSalario());
    }
    
}
