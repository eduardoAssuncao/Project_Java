/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Kenny
 */
public class Soma {

    public static void main(String[] args) {
        Soma res = new Soma();
        int x = 3, y = 5, soma;

        soma = res.soma(x, y);
        res.imprime(soma);

        soma = res.soma();
        res.imprime(soma);
    }

    //Método com parâmetro e com retorno
    public int soma(int a, int b) {
        int resultado;
        resultado = a + b;
        return resultado;
    }

    //Método sem parâmetro e com retorno
    public int soma() {
        int a = 2, b = 7, resultado;
        resultado = a + b;
        return resultado;
    }

    //Método com parâmetro e sem retorno
    public void imprime(int s) {
        System.out.println("<<Imprimindo resultado>>");
        System.out.println("Soma = " + s);
    }
}
