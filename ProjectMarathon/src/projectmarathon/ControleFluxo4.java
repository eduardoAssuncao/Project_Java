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
public class ControleFluxo4 {

    public static void main(String[] args) {
        int contador = 11;
        while (contador < 10) {
            System.out.println(++contador);
        }
        do {
            System.out.println("Dentro do do while: " + contador++);
        } while (contador < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("Valor de i é: " + i);
            if (i == 5) {
                break;
            }
        }
    }
}
