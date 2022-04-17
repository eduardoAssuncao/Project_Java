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
public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        // ==, -=, +=, *=, /=, %=
        float salario = 1800f;
        //salario += 1800;
        //salario -= 1800;
        //salario *= 0.1;
        //salario = salario + (int)/*forcar com que o resultado seja im inteio*/ (salario * 0.1);
        //salario %= 11;
        salario /= 2;
        System.out.println(salario);
    }
}
