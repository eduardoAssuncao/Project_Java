/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargaMetodos.test;

import sobrecargaMetodos.classes.Funcionario;

/**
 *
 * @author Kenny
 */
public class FuncionarioTest {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Chica da Silva", "111.222.333-44", 4500, "122212-9");
        Funcionario funcionario2 = new Funcionario();
        funcionario.imprime();
        funcionario2.imprime();
        //System.out.println(funcionario.toString());
    }
}
