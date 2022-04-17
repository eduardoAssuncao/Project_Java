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
public class Q02 {

    public static void main(String[] args) {
        /*Faça um algoritmo (em Java) que efetue a leitura de um valor numérico inteiro e apresente o
        resultado do valor lido elevado ao quadrado.*/
        
        int num, operacao;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Informe um valor inteiro:");
        num = read.nextInt();
        
        operacao = (int) Math.pow(num, 2);
        System.out.println("Resultado do valor ao quadrado é: "+operacao);
    }
}
