/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargaConstrutores.test;

import sobrecargaConstrutures.classes.Estudante;

/**
 *
 * @author Kenny
 */
public class EstudanteTest {
    public static void main(String[] args) {
        Estudante est = new Estudante("12212", "Paôla", new double[]{8,7,9}, "13/08/2006");
        est.imprime();
    }
}
