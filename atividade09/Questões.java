package atividade09;

import java.security.spec.NamedParameterSpec;
import java.util.Scanner;

public class Questões {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        //1) Faça um programa que imprima os valores no intervalo de 33 a 3.
        /*for(int x = 32; x > 3; x--){
            System.out.println("Valor: " + x);
        }*/
        
        //2) Elabore um programa que apresente a soma dos valores pares situados no intervalo de 40 até 80.
        /*int soma = 0;
        for(int x = 41; x < 80; x++){
            if(x % 2 == 0){
                soma += x;
            }
        }
        System.out.println("Soma: " + soma);*/
        
        //3) Faça um programa que leia o limite inferior e superior de um intervalo e imprima todos os números
        //naturais no intervalo fechado. Suponha que os dados digitados são para um intervalo crescente.
        /*int limiteI, limiteS;
        System.out.println("Digite o limite inferior e superior do intervalo:");
        limiteI = read.nextInt();
        limiteS = read.nextInt();
        if(limiteI == (int)limiteI && limiteS == (int)limiteS){//acabou sendo desnecessário
            for(int x = limiteI; x <= limiteS; x++){
                System.out.print("[" + x + "]");
            }
        }else{
            System.out.println("O número digitado não era inteiro");
        }*/
        
        //4) Faça um programa que leia 10 números inteiros e imprima quantos são pares e quantos são ímpares.
        /*int num, contador = 0, par = 0, impar = 0;
        while(contador != 10){
            System.out.println("Informe um número inteiro:");
            num = read.nextInt();
            if(num % 2 == 0){
                par++;
            }else{
                impar++;
            }
            contador++;
        }
        System.out.println("Quatidade de valores ímpares: " + "[" + impar + "]");
        System.out.println("Quatidade de valores par: " + "[" + par + "]");*/
        
        //5) Escreva um programa que leia um número inteiro positivo N e imprima todos os números naturais de 0 até
        //N em ordem decrescente.
        /*int num;
        System.out.println("Informe um número natural:");
        num = read.nextInt();
        if(num >= 0){
            do{
                System.out.println("[" + num + "]");
                num--;
            }while(num != -1);
        }*/
        
        //6) Escreva um programa que receba um número e calcule o fatorial deste número, usando while.
        //(Lembre-se que 0!=1 e 1!=1).
        /*int num, fat = 1;
        System.out.println("Informe um número natural:");
        num = read.nextInt();
        while(num != 1){
            switch (num) {
                case 0:
                    fat = 1;
                    break;
                case 1:
                    fat = 1;
                    break;
                default:
                    fat *= num;
                    num--;
                    break;
            }
        }
        System.out.println("Fatorial: " + fat);*/
        
        //7) Escreva um programa que leia vários números inteiros e calcule o somatório dos números negativos. O
        //fim da leitura será indicado pelo número 0.
        /*int num, soma = 0;
        do{
            System.out.println("Informe um número inteiro:");
            num =read.nextInt();
            if(num < 0){
                soma += num;
            }
        }while(num != 0);
        System.out.println("Soma: " + soma);*/
        
        //8) Escreva um programa que leia um número inteiro N e depois imprima os N primeiros números naturais
        //ímpares. Obs: utiliza o comando FOR.
        /*int num;
        System.out.println("Informe um número inteiro:");
        num = read.nextInt();
        for(int x = 0;  x <= num; x++){
            if(x % 2 != 0){
                System.out.println("[" + x + "]");
            }
        }*/
        
        //9) Escreva um programa que leia valores, parando no momento em que o valor ZERO, seja lido (utilize o
        //comando FOR). Mostrar os seguintes itens:
        /*int num, par = 0, maior = 0, menor = 0, nLidos = 0;
        float media, soma = 0;
        for(int i = 0; ; i++){
            System.out.println("Informe alguns valores:");
            num = read.nextInt();
            if(num == 0){
                break;
            }
            
            if(i == 0){
                maior = num;
                menor = num;
            }else{
                if(num >= maior){
                    maior = num;
                }
                if(num <= menor){
                    menor = num;
                }
            }
            

            if(num % 2 == 0){
                par++;
            }
            
            nLidos ++;
            soma += num;
        }
        media = soma/nLidos;
        System.out.println("Números lidos: " + "[" +nLidos+ "]");
        System.out.println("Pares: " + "[" +par+ "]");
        System.out.println("Somatória: " + "[" +soma+ "]");
        System.out.println("Média: " + "[" +media+ "]");
        System.out.println("Maior: " + "[" +maior+ "]");
        System.out.println("Menor: " + "[" +menor+ "]");*/
        
        //10) Durante uma corrida de automóveis com N voltas de duração foram anotados para um piloto, na ordem,
        //os tempos registrados em cada volta. Fazer um programa para ler os tempos das N voltas (utilize o
        //comando FOR), calcular e imprimir:
        /*int voltas, x;
        
        float media, soma = 0, melhorT = 0;
        System.out.println("Informe a quantidade de voltas:");
        voltas = read.nextInt();
        float tempo[] = new float[voltas];
        for(x = 0; x < voltas; x++){
            System.out.println("Informe o tempo da volta [" + x +"]");
            tempo[x] = read.nextFloat();
            if(x == 0){
                melhorT = tempo[x];
            }else{
                if(tempo[x] <= melhorT){
                    melhorT = tempo[x];
                }
            }
            soma += tempo[x];
        }
        media = soma/voltas;
        System.out.println("Melhor tempo: " + melhorT);
        System.out.printf("Volta do melhor tempo [%.1f] do índice [%d]: \n", melhorT, x-1);//Fiquei em dúvida quanto a exibição do índice do vetor de melhor tempo
        System.out.println("Tempo médio: " + media);*/
    }
}
