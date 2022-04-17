/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01;

import javax.swing.JOptionPane;

/**
 *
 * @author Kenny
 */
public class Q03 {

    public static void main(String[] args) {
        /*Faça um algoritmo (em Java) que leia a idade de uma pessoa em anos. Em seguida, calcule e
        escreva quantos dias ela viveu. Considerar o ano com 365,25 dias.*/
        
        int ages;
        float diasV;
        
        ages = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade em anos:"));
        diasV = ages*365.25f;
        
        System.out.println("Você tem "+diasV+" dias de vida.");
    }
}
