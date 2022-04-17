package atividade04;

import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Scanner read = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        c1.setNome(read.nextLine());
        System.out.println("informe o número da conta:");
        c1.setNumero(read.nextInt());
        System.out.println("Informe o seu saldo:");
        c1.setSaldo(read.nextDouble());
        System.out.println("Informe o valor de saque:");
        c1.saca(read.nextDouble());
        System.out.println("Informe o valor de depósito:");
        c1.deposita(read.nextDouble());
        System.out.println("informe a conta e o valor para tranferência:");
        c1.transfere(read.nextInt(), read.nextDouble());      
    }
}
