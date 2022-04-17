package atividadeRevisão01;

import java.util.Scanner;

public class Systems {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Funcionario f1 = new Funcionario("Carlos Henrique", 44486832325L);
        f1.setSalario(2400);
        System.out.println(f1);
        Gerente g1 = new Gerente("Francisco Souza", 56772344367L, 4500);
        //g1.setSalario(1000);
        g1.bonificacao();
        System.out.println("Gerente, informe a código de acesso:");
        g1.autenticacao(read.nextLine());
    }
}
