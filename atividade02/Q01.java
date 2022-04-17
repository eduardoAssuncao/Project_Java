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
public class Q01 {
    public static void main(String[] args) {
        /*Criar um método sem retorno que receba a idade de uma pessoa em anos. Em seguida, calcule e escreva
        quantos dias ela viveu. Considerar o ano com 365,25 dias.*/
        Q01 diasA = new Q01();
        
        Scanner read = new Scanner(System.in);
        int idadeA = read.nextInt();
        
        diasA.dVida(idadeA);  
    }
    
    public void dVida(int idadeA){
        float resultado;
        
        resultado = idadeA * 365.25f;
        System.out.println("Você viveu "+resultado+" dias!");
    }
}
