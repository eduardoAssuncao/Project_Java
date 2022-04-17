/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatingNewPackage;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Kenny
 */
public class EX_LP2_2021_1 {
    public static void main(String[] args) {
        /*int numInt;
        double numDec;
        
        
        numInt = Integer.parseInt(JOptionPane.showInputDialog("Digite número: "));
        System.out.println("Usuário digitou: "+numInt);
        */
        int idade;
        String nome;
        Scanner ler = new Scanner(System.in);//LEITURA
        
        
        System.out.println("Informe a sua idade:");
        idade = ler.nextInt();
        
        System.out.println("Informe o seu nome:");
        nome = ler.next();
        
        System.out.println("Nome: "+nome+"\nIdade: "+idade);
        
    }
}
