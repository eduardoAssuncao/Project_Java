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
public class Q02 {
    public static void main(String[] args) {
        /*Criar um método que receba por parâmetros os lados de um retângulo, e apresente: perímetro e área.*/
        Q02 operacRet = new Q02();
        
        Scanner read = new Scanner(System.in);
        System.out.println("Infome o valor da base:");
        float base = read.nextFloat();
        System.out.println("Infome o valor da altura:");
        float altura = read.nextFloat();
        
        operacRet.lRet(base, altura);
    }
    
    public void lRet(float a, float h){
        float perimetro, area;
        
        perimetro = (a * 2) + (h * 2);
        area = a * h;
        
        System.out.println("<<Perímetro: "+perimetro+">>");
        System.out.println("<<Área: "+area+">>");
    }
}
