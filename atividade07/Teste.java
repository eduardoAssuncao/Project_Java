package atividade07;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Depositar f = new Depositar(1000.0);
        Scanner read = new Scanner (System.in);
        //f.setSaldo(10);
        System.out.println("Informe o valor de depósito:");
        f.deposito(read.nextDouble());
        System.out.println(f);      
    }
}

