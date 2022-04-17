/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmarathon;

//Formas de comentar linhas:
//1º
/*
    2º
*/
/***
 * 3º
 */

/**
 *
 * @author Kenny
 */
public class ImprimindoVariaveis {
    public static void main (String[] args){
        int idade = 20;
        double salarioDouble = 3000;
        float salarioFloar = 3.45f;
        byte idadeByte = 12;
        short idadeShort = 32767;
        boolean verdadeiro = true;
        boolean falso = false;
        long numeroGrande = 1000L;
        char caractere = '\u0041'; //2 bytes
        String nome = "Eduardo";
        System.out.println("A idade informada é: " + idade);
    }
}
