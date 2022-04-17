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
public class ex03 {
    public static void main(String[] args) {
        float salario = 8000f;
        double imposto;
        if (salario < 1000) {
            imposto = salario * 0.05;
        }
        else if (salario >= 1000 && salario < 2000) {
            imposto = salario * 0.1;
        }
        else if (salario >= 2000 && salario < 4000) {
            imposto = salario * 0.15;
        }else{
            imposto = salario * 0.2;
        }
        
        System.out.println(imposto);
    }
}
