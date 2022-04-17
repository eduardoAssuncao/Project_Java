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
public class Q03 {
    public static void main(String[] args) {
        /*Criar um método que receba um número inteiro, em seguida, retornar a soma do antecessor desse
        número, com seu sucessor. Mostrar o resultado desta soma.*/
        Q03 soma = new Q03();
        
        Scanner read = new Scanner(System.in);
        System.out.println("Informe um valor inteiro");
        int valor = read.nextInt();
        
        soma.somaAS(valor);
    }
    
    public void somaAS(int a){
        int resultado;
        
        resultado = (a - 1) + (a + 1);
        
        System.out.println("<<O reusultado da soma do sucessor pelo antecessor é: "+resultado+">>");
    }
}
