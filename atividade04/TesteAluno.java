package atividade04;

import java.util.Scanner;


public class TesteAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Scanner read = new Scanner(System.in);
        
        System.out.println("Informe o seu nome:");
        a1.setNomeAluno(read.nextLine());
        System.out.println("Informe a nota do exercício");
        a1.setNotaExercicio(read.nextFloat());
        System.out.println("Informe a nota da prova");
        a1.setNotaProva(read.nextFloat());
        System.out.println("Informe a nota do trabalho");
        a1.setNotaTrabalho(read.nextFloat());
        
        System.out.println("Informe os pesos, consecutivamente, para o exercício, trabalho e prova");
        a1.calcularMedia(read.nextFloat(), read.nextFloat(), read.nextFloat());
    } 
}
