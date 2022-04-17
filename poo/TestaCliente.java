/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Kenny
 */
public class TestaCliente {

    public static void main(String[] args) {
        /*
        Cliente clie1 = new Cliente();
        clie1.nome = "Eduardo Assunção";
        clie1.codigo = 8723;
        Cliente clie2 = new Cliente();
        clie2.nome = "José Carlos";
        clie2.codigo = 7756;
        Cliente clie3 = new Cliente();
        clie3.nome = "Carlos Gabriel";
        clie3.codigo = 5469;
        System.out.println(clie1.nome);
        System.out.println(clie1.codigo);
        System.out.println(clie2.nome);
        System.out.println(clie2.codigo);
        System.out.println(clie3.nome);
        System.out.println(clie3.codigo);
        */
        
        Cliente p1 = new Cliente();
        p1.setCodigo(123);
        p1.setNome("Carlos");
        
        //System.out.println("Nome: "+p1.getNome());
        System.out.println(p1.toString());
    }
}
