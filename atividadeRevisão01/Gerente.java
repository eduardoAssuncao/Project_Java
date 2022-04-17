package atividadeRevisão01;
public class Gerente extends Funcionario{
    private double salario;
    private String acesso;
    private double nSalario;
    public Gerente(String nome, long cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getAcesso() {
        return acesso;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }
    
    public double bonificacao(){
        nSalario = salario+(salario*0.1);
        return nSalario;
    }
    
    public boolean autenticacao(String acesso){
        try{
            if(acesso.equals("Adm@123")){
            System.out.println("Acesso confirmado");
            //bonificacao();
            System.out.println("Gerente: \n" + "Nome = " + getNome()+ "\nCpf = " + getCpf() + "\nSalário = R$" + nSalario);        
            return true;
        }
            else{
                throw new IllegalArgumentException("Acesso negado!");
            }
        }catch(IllegalArgumentException e){
            System.err.println("Exception: Houve um erro ao tentar acesso " + e);
            return false;
        }
    } 
}
