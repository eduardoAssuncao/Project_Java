/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmarathon;

/**
 *
 * @author Kenny
 */
public class Operadores {

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        long numeroLong = 200000L;
        double numeroDouble = 10d;
        float numeroFloat = 20f;
        int soma = numero1+numero2;
        System.out.println("A soma dos dois valores é: "+soma);
        System.out.println("A soma dos dois valores é: "+ (numero1+numero2));
        System.out.println("A div dos dois valores é: "+ (numero1/numero2));
        System.out.println("A mult dos dois valores é: "+(numero1*numero2));
        System.out.println("A sub dos dois valores é: "+(numero1-numero2));
        System.out.println("O resto dos dois valores é: "+(numero1%numero2));
        System.out.println("Numero long: "+numeroLong);
        System.out.println("Numero double: "+numeroDouble);
        System.out.println("Numero float: "+numeroFloat);
    }
}
