/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosLP04_II;

import java.util.Scanner;

/**
 *
 * @author Kenny
 */
public class Ex_9 {

    public static void main(String[] args) {
        String nameF;
        float salario, nSalario, comissao;
        comissao = .1f;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        nameF = ler.nextLine();

        System.out.println("Informe o seu salário:");
        salario = ler.nextFloat();

        nSalario = salario+(salario*comissao);
        
        System.out.println("O novo salário do funcionário "+nameF+" é: R$"+nSalario);
    }
}
