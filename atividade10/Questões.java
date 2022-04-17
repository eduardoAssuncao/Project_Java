package atividade10;

import java.util.Random;
import java.util.Scanner;

public class Questões {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        //1)
        /*int[] vetor = new int[6];
        System.out.println("Informe seis valores inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = read.nextInt();
        }
        
        for (int i = 5; i >= 0; i--) {
            System.out.println("["+vetor[i]+"]");
        }*/
        
        //2)
        /*int[] vetor = {1, 2, 3, -6, -7, 22, 15, -30, 40, 7};
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] > 0){
            soma += vetor[i];
            }
        }
        System.out.println("Soma: " + soma);*/
        
        //3)
        /*int[] vetor = {1, 2, 3, -6, -7, 22, 15, -30, 40, 7};
        int maiorP, menorI;
        maiorP = vetor[0];
        menorI = maiorP;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 == 0 && vetor[i] > maiorP){
                maiorP = vetor[i];
            }else if (vetor[i] % 2 != 0 && vetor[i] < menorI) {
                menorI = vetor[i];
            }
        }
        System.out.println("Maior Par: " + maiorP);
        System.out.println("Menor Impar: " + menorI);*/
        
        //4)
        /*int[] vetor1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vetor2 = {21, 20, 19, 18, 17, 16, 15, 14, 13, 12};
        int[] vetor3 = new int[10];
        int indice1 = 0, indice2 = 0;
        
        for (int i = 0; i < vetor1.length; i++) {
            indice1 = i;
            indice2 = i;
            if(indice1 == indice2){
                vetor3[i] = vetor1[indice1] + vetor2[indice2];
            }
        }
        
        for (int i = 0; i < vetor3.length; i++) {
            System.out.println("[" + vetor3[i] +"]");
        }
        //Por alguns instantes eu achei que estava errado, ao olhar a impressão dos vetores*/
        
        //5)
        /*int[] vetor = new int[10];
        System.out.println("Informe 10 valores inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = read.nextInt();
            if(vetor[i] < 0){
                vetor[i] = -1;
            }
        }
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("["+vetor[i]+"]");
        }*/
        
        //6)
        /*Random random = new Random();
        int[] vetor = new int[10];
        int qtdImpar = 0, qtdPar = 0;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100);
            if(vetor[i] % 2 == 0){
                qtdPar++;
            }else{
                qtdImpar++;
            }
        }
        System.out.printf("Vetor: ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("[%d]", vetor[i]);
        }
        System.out.printf("\n");
        System.out.println("Quantidade par: " + qtdPar);
        System.out.println("Quantidade impar: " + qtdImpar);*/
        
        //7)
        /*int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vetorB = new int[10];
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i] * vetorA[i];
        }
        System.out.printf("VetorA: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("["+ vetorA[i] +"]");
        }
        System.out.printf("\n");
        System.out.printf("VetorB: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.printf("["+ vetorB[i] +"]");
        }
        System.out.printf("\n");*/
        
        //8)
        /*int valor, aparicao = 0;
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Random random = new Random();
        valor = random.nextInt(30);
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] == valor){
                aparicao++;
            }
        }
        System.out.println("Valor sorteado: " + valor);
        System.out.println("Aparições: " + aparicao);*/
        
        //9)
        /*int[] vetorA = {1, 2, 3, 4, 5};
        int[] vetorB = {1, 2, 3, 4, 8, 6, 7, 5};
        System.out.printf("Elementos comuns: ");
        for (int i = 0; i < 5; i++) 
            for (int j = 0; j < 8; j++) {
                if(vetorA[i] == vetorB[j]){
                    System.out.printf("["+ vetorB[j] +"]");
                }
            }
        System.out.printf("\n");*/
    }
}
