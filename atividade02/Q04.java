/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02;

import java.util.Scanner;

/**
 *
 * @author Kenny
 */
public class Q04 {
    public static void main(String[] args) {
        /*Criar um método que receba o número de horas trabalhadas, e o valor que recebe da hora trabalhada. Em
        seguida, este método deve retornar o cálculo do salário desse funcionário. Também, deve ser lido o nome
        desse funcionário, e por fim, deve ser apresentado o nome e salário final desse funcionário.*/
        Q04 funcionario = new Q04();
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Informe o seu nome:");
        String nome = read.nextLine();
        System.out.println("Informe o número de horas trabalhadas:");
        float horasT = read.nextFloat();
        System.out.println("Informe o valor recebido por hora trabalhada:");
        double valorH = read.nextDouble();
        double salarioF = funcionario.inFuncio(horasT, valorH);
        
        System.out.println("Horas trabalhadas: "+horasT+"\n"+"Valor hora: R$"+valorH+"\n"+"Salário: R$"+salarioF+"\n"+"Nome: "+nome);

    }
    
    public double inFuncio(float horas, double valorH){
        double salarioF;
        
        salarioF = valorH * horas;
        
        return salarioF;
    }
}
