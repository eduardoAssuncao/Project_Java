package atividade05;
public class Teste {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Pedro" , 800.0);
        f.imprime();
        Professor p = new Professor("José", 1000.0, 20);
        p.bonus();
        p.imprime();
    }
}
