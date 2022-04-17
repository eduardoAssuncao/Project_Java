package atividade08;

import java.util.Scanner;

public class Questões {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        //1) Faça um algoritmo que dado um valor numérico, diga se ele é par ou ímpar.
        /*int valor;
        System.out.println("Informe um valor de 1 a 10:");
        
        do{
            valor = read.nextInt();

            if(valor % 2 == 0){
                System.out.println("PAR");
            }else{
                System.out.println("ÍMPAR");
            }
        }while(valor != 11);*/
        
        //2) Faça um algoritmo que leia um número inteiro qualquer e multiplique-o por dois. Apresente o resultado da
        //multiplicação se o resultado for maior que 30.
        /*float valor;
        System.out.println("Informe um valor:");
        valor = read.nextFloat() * 2;
        if(valor > 30){
            System.out.println("Valor: " + valor);
        }*/
        
        //3) Faça um algoritmo que leia dois números e imprima o quadrado deles se forem diferentes. Caso os dois
        //números sejam iguais, apresente o cubo deles.
        /*float valorX, valorY;
        System.out.println("Informe dois valores:");
        valorX = read.nextFloat();
        valorY = read.nextFloat();
        if(valorX != valorY){
            valorX = valorX*valorX;//fiquei em dúvida sobre a permissão para utilizar o Math.pow()
            valorY = valorY*valorY;
            System.out.println("ValorX: " + valorX + ", ValorY: " + valorY);
        }else{
            valorX = valorX*valorX*valorX;
            valorY = valorY*valorY*valorY;
            System.out.println("ValorX: " + valorX + ", ValorY: " + valorY);
        }*/
        
        //4) Dada a idade de um jogador de futebol classifique-o em uma das seguintes categorias:
        /*int idade;
        System.out.println("Informe a sua idade:");
        do{
            idade = read.nextInt();
            switch(idade){
                case 5: 
                case 6:
                case 7: System.out.println("INFANTIL A"); 
                    break;
                case 8: 
                case 9:
                case 10: System.out.println("INFANTIL B");       
                    break;
                case 11: 
                case 12:
                case 13: System.out.println("JUVENIL A");   
                    break;
                case 14: System.out.println("JUVENIL B");
                case 15:
                case 16:
                case 17: System.out.println("JUVENIL B");   
                    break;
            }
        }while(idade != 100);*/
        
        //5) Faça um programa que informe o mês de acordo com o número informado pelo usuário.
        /*int mes;
        System.out.println("Informe um valor entre 1 e 12:");
        do{
            mes = read.nextInt();
            switch (mes) {
                case 1: System.out.println("JANEIRO");
                    break;
                case 2: System.out.println("FEVEREIRO");
                    break;
                case 3: System.out.println("MARÇO");
                    break;
                case 4: System.out.println("ABRIL");
                    break;
                case 5: System.out.println("MAIO");
                    break;
                case 6: System.out.println("JUNHO");
                    break;
                case 7: System.out.println("JULHO");
                    break;
                case 8: System.out.println("AGOSTO");
                    break;
                case 9: System.out.println("SETEMBRO");
                    break;
                case 10: System.out.println("OUTUBRO");
                    break;
                case 11: System.out.println("NOVEMBRO");
                    break;
                case 12: System.out.println("DEZEMBRO");
                    break;    
                default:
                    throw new AssertionError();
            }
        }while(mes != 13);*/
        
        //6) A importância de R$ 780.000,00 será dividida entre três ganhadores de um concurso, sendo que:
        /*double valorS = 780.000, ganhador1 = 0, ganhador2 = 0, ganhador3 = 0;
        int posicaoG;
        System.out.println("Informe a posição do ganhador: [1, 2, 3]");
        posicaoG = read.nextInt();

        ganhador1 += (valorS * 0.46);
        ganhador2 += (valorS * 0.32);
        ganhador3 += (valorS * 0.22);
        if(posicaoG == 1){
            System.out.println("Premiação: R$" + ganhador1);
        }
        else if(posicaoG == 2){
            System.out.println("Premiação: R$" + ganhador2);
        }else{
            System.out.println("Premiação: R$" + ganhador3);
        }*/
        
        //7) Escreva um programa que receba uma senha (que contenha 5 dígitos) e, verificar se foi digitado senha
        //correta ou não. (Senha válida é 123ab).
        /*String senha;
        System.out.println("Informe a senha de acesso:");
        senha = read.nextLine();
        
        if(senha.equals("123ab")){
            System.out.println("Acesso realizado");
        }else{
            System.out.println("Acesso negado");
        }*/
        
        //8) Um endocrinologista deseja controlar a saúde de seus pacientes e, para isso, se utiliza do Índice de
        //Massa Corporal (IMC). Sabendo-se que o IMC é calculado através da seguinte fórmula:
        /*float peso, altura, imc;
        do{
            System.out.println("Informe o seu peso e altura na ordem pedida:");
            peso = read.nextFloat();
            altura = read.nextFloat();

            imc = peso/(altura*altura);
            if(imc < 20){
                System.out.println("IMC: " + imc + ", FAIXA DE RISCO: Abaixo do peso");
            }
            else if(imc > 20 && imc <= 25){
                System.out.println("IMC: " + imc + ", FAIXA DE RISCO: Normal");
            }
            else if(imc > 25 && imc <= 30){
                System.out.println("IMC: " + imc + ", FAIXA DE RISCO: Excesso de peso");
            }
            else if(imc > 30 && imc <= 35){
                System.out.println("IMC: " + imc + ", FAIXA DE RISCO: Obesidade");
            }
            else if(imc > 35){
                System.out.println("IMC: " + imc + ", FAIXA DE RISCO: Obesidade mórbida");
            }
        }while(peso != 0);*/
        
        //9) Faça um programa para verificar se determinado número inteiro é divisível por 3 ou 5, mas não
        //simultaneamente pelos dois.
        /*int valor;
        System.out.println("Informe um valor inteiro:");
        valor = read.nextInt();
        if(valor % 3 == 0 && valor % 5 == 0){
            System.out.println("Divisível pelos dois");
        }
        else if(valor % 3 == 0 && valor % 5 != 0){
            System.out.println("Divisível por 3");
        }else{
            System.out.println("Divisível por 5");
        }*/
    }
}
