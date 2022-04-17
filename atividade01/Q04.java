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
public class Q04 {

    public static void main(String[] args) {
        /*Todo restaurante, embora por lei não possa obrigar o cliente a pagar, cobra 10% de comissão
        para o garçom. Faça um algoritmo (em Java) que leia o valor gasto com despesas realizadas em
        um restaurante e imprima o valor da gorjeta e o valor total com a gorjeta.*/
        
        float vGasto, gorjeta, vTotal;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Informe o valor das despesas:");
        vGasto = read.nextFloat();
        
        vTotal = (vGasto*1.1f);
        gorjeta = vGasto*0.1f;
        
        System.out.println("Valor da gojeta: R$"+gorjeta);
        System.out.println("Valor total: R$"+vTotal);
    }
}
