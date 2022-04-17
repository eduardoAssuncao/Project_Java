/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;

/**
 *
 * @author Kenny
 */
public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Francisco");
        p1.setPeso(95.0f);
        p1.setAltura(1.72f);
        p1.setIdade(42);
        
        Pessoa p2 = new Pessoa();
        p2.setNome("Patrícia");
        p2.setPeso(55.0f);
        p2.setAltura(1.50f);
        p2.setIdade(23);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
                
    }
}
