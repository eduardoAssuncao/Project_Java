/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01;

import java.util.Scanner;

/**
 *
 * @author Kenny
 */
public class Q05 {

    public static void main(String[] args) {
        /*Faça um algoritmo (em Java) que dado o nome de um funcionário, seu número de horas
        trabalhadas, o valor que recebe da hora trabalhada, calcule o salário desse funcionário e
        apresente seu nome e salário.*/
        
        String name;
        float horasTrab, valorHoras, salario;
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Informe o seu nome:");
        name = read.nextLine();
        
        System.out.println("Informe a quantidade de horas trabalhadas:");
        horasTrab = read.nextFloat();
        
        System.out.println("Informe o valor pago para cada hora de trabalho:");
        valorHoras = read.nextFloat();
        
        salario = horasTrab*valorHoras;
        
        System.out.println("O funcionário "+name+" recebe R$"+salario+" reais");
    }
}
