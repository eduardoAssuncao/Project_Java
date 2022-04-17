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
public class ControleFluxo1 {

    public static void main(String[] args) {
        int idade = 20;
        float salario = 2000f;
        String categoria;
        if (idade < 15) {
            categoria = "infantil";
        } 
        else if(idade >= 15 && idade < 18){
            categoria = "juvenil";
        }else{
            categoria = "adulto";
        }
        System.out.println(categoria);
        
        

    }
}
