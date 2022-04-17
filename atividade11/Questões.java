package atividade11;

import java.util.Scanner;

public class Questões {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        //1)
        /*int[][] matrizA = {{1, 3, 1}, {-3, 2, 0}, {3, 5, 2}};
        int[][] matrizB = {{2, 8, 1}, {-1, 1, 0}, {5, 1, -2}};
        int[][] matrizE = new int[3][3];
        
        for (int i = 0; i < matrizA.length; i++)
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizE[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        
        System.out.print("Matriz E:\n");
        for (int i = 0; i < matrizE.length; i++)
            for (int j = 0; j < matrizE[i].length; j++) {
                System.out.print("|"+matrizE[i][j]+"|");
                if(j>1){
                    System.out.print("\n");
                }
            }*/
        
        //2)
        /*System.out.println("Informe a quantidade de linhas e colunas da matriz:");
        int linha = read.nextInt();
        int coluna = read.nextInt();
        int[][] matrizA = new int[linha][coluna];
        System.out.println("Informe os valores da matriz:");
        for (int i = 0; i < matrizA.length; i++)
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = read.nextInt();
            }
        
        System.out.print("Matriz:\n");
        for (int i = 0; i < matrizA.length; i++)
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print("|"+matrizA[i][j]+"|");
                if(j>0){
                    System.out.print("\n");
                }
            }
            
        for (int i = 0; i < matrizA.length; i++)
            for (int j = i + 1; j < matrizA[i].length; j++) {
                if(matrizA[i][j] != matrizA[j][i]){
                    System.out.println("Matriz não simétrica");
                }else{
                    if(matrizA[i][j] == matrizA[j][i]){
                        System.out.println("Matriz simétrica");
                    }
                }
            }*/
        
        //3)
        /*int matrizA[][] = new int[4][4];
        int matrizB[][] = new int[4][4];
        int matrizC[][] = new int[4][4];
        int i, j, k, soma;
        int ordem = 4;
        System.out.printf("1° Matriz:\n");
        for (i = 0; i < ordem; i++) {
          System.out.printf("Informe os elementos da %d° linha:\n", (i+1));
          for (j = 0; j < ordem; j++) {
            System.out.printf("matrizA[%d][%d] = ", i, j);
            matrizA[i][j] = read.nextInt();
          }
          System.out.printf("\n");
        }

        System.out.printf("\n2° Matriz:\n");
        for (i = 0; i < ordem; i++) {
          System.out.printf("Informe os elementos da %d° linha:\n", (i+1));
          for (j = 0; j < ordem; j++) {
            System.out.printf("matrizB[%d][%d] = ", i, j);
            matrizB[i][j] = read.nextInt();
          }
          System.out.printf("\n");
        }

        for (i = 0; i < ordem; i++) {
          for (j = 0; j < ordem; j++) {
            soma = 0;
            for (k = 0; k < ordem; k++) {
              soma = soma + (matrizA[i][k] * matrizB[k][j]);//variável k utilização para que haja a multiplicação de linha por coluna entre as matrizes
            }
            matrizC[i][j] = soma;
          }
        }

        System.out.printf("\n1° Matriz:\n");
        for (i = 0; i < ordem; i++) {
          System.out.printf("%d° linha: ", (i+1));
          for (j = 0; j < ordem; j++) {
            System.out.printf("%d ", matrizA[i][j]);
          }
          System.out.printf("\n");
        }

        System.out.printf("\n2° Matriz:\n");
        for (i = 0; i < ordem; i++) {
          System.out.printf("%d° linha: ", (i+1));
          for (j = 0; j < ordem; j++) {
            System.out.printf("%d ", matrizB[i][j]);
          }
          System.out.printf("\n");
        }

        System.out.printf("\nProduto___________\n");
        for (i = 0; i < ordem; i++) {
          System.out.printf("%d° linha: ", (i+1));
          for (j = 0; j < ordem; j++) {
            System.out.printf("%d ", matrizC[i][j]);
          }
          System.out.printf("\n");
        }*/
        
        /*//4)INCOMPLETA - Não consegui pensar em nenhuma solução viável
        Mas pensei no seguinte. Uma variável recebia o valor do primeiro elemento da matriz
        e realizava a comparação com todos os outros valores, assim que terminasse, essa variável
        recebia o próximo valor da matriz. Se o valor fosse igual, o mesmo era armazenado em outra matriz resposta.
        int[][] matrizA = new int[3][3];
        int[][] matrizR = new int[3][3];
        int m = 0, n = 0, l = 0, k = 0;
        int achou = 0;
        System.out.println("Informe os valores da matriz:");
        for (int i = 0; i < matrizA.length; i++) {
            System.out.printf("Valores da linha %d:\n", (i+1));
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = read.nextInt();
            }
        }
        System.out.println("Matriz:");
        for (int i = 0; i < matrizA.length; i++) {
          System.out.printf("%d° linha: ", (i+1));
          for (int j = 0; j < matrizA[i].length; j++) {
            System.out.printf("%d ", matrizA[i][j]);
          }
          System.out.printf("\n");
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(m == 0){
                    matrizR[k][l] = matrizA[i][j];
                    m = 1;
                }
                if(matrizR[k][l] == matrizA[i][j]){
                    achou++;
                    k++;
                    l++;
                }
                matrizR[k][l] = matrizA[i][j];
            }
        }
        System.out.println(achou);*/
        
        //5)
        int ordem = 3;
        int[][] matrizA = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        /*for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                if(i == j){
                    matrizA[i][j] = 0;
                }
            }
        }
        
        System.out.printf("\nMatriz:\n");
        for (int i = 0; i < ordem; i++) {
          System.out.printf("%d° linha: ", (i+1));
          for (int j = 0; j < ordem; j++) {
            System.out.printf("%d ", matrizA[i][j]);
          }
          System.out.printf("\n");
        }*/
        
        //6)
        /*for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                if(i + j < 2){
                    matrizA[i][j] = 0;
                }
            }
        }
        
        System.out.printf("\nMatriz:\n");
        for (int i = 0; i < ordem; i++) {
          System.out.printf("%d° linha: ", (i+1));
          for (int j = 0; j < ordem; j++) {
            System.out.printf("%d ", matrizA[i][j]);
          }
          System.out.printf("\n");
        }*/
        
        //7)
        /*for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                if(i + j < 3){
                    matrizA[i][j] = 0;
                }
            }
        }
        
        System.out.printf("\nMatriz:\n");
        for (int i = 0; i < ordem; i++) {
          System.out.printf("%d° linha: ", (i+1));
          for (int j = 0; j < ordem; j++) {
            System.out.printf("%d ", matrizA[i][j]);
          }
          System.out.printf("\n");
        }*/
        
        //8)
        /*int maior = 0;
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                if(i + j < 3){
                    matrizA[i][j] = 0;
                }
                maior = matrizA[i][j];
            }
        }
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                if(maior < matrizA[i][j]){
                    maior = matrizA[i][j];
                }
            }
        }
        
        System.out.printf("\nMatriz:\n");
        for (int i = 0; i < ordem; i++) {
          System.out.printf("%d° linha: ", (i+1));
          for (int j = 0; j < ordem; j++) {
            System.out.printf("%d ", matrizA[i][j]);
          }
          System.out.printf("\n");
        }
        
        System.out.println("Maior: " + maior);*/
        
        //9)
        /*for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                if(i + j > 2){
                    matrizA[i][j] = 0;
                }
            }
        }
        
        System.out.printf("\nMatriz:\n");
        for (int i = 0; i < ordem; i++) {
          System.out.printf("%d° linha: ", (i+1));
          for (int j = 0; j < ordem; j++) {
            System.out.printf("%d ", matrizA[i][j]);
          }
          System.out.printf("\n");
        }*/
        
        //10)
        /*int produto = 1;
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                if(i + j > 1){
                    matrizA[i][j] = 0;
                }
                if(matrizA[i][j] > 0){
                    produto *= matrizA[i][j];
                }
            }
        }
        
        System.out.printf("\nMatriz:\n");
        for (int i = 0; i < ordem; i++) {
          System.out.printf("%d° linha: ", (i+1));
          for (int j = 0; j < ordem; j++) {
            System.out.printf("%d ", matrizA[i][j]);
          }
          System.out.printf("\n");
        }
        
        System.out.println("Produto: " + produto);*/
        
        //11)
        /*for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                if(i + j == 2){
                    matrizA[i][j] = 0;
                }
            }
        }
        
        System.out.printf("\nMatriz:\n");
        for (int i = 0; i < ordem; i++) {
          System.out.printf("%d° linha: ", (i+1));
          for (int j = 0; j < ordem; j++) {
            System.out.printf("%d ", matrizA[i][j]);
          }
          System.out.printf("\n");
        }*/
        
        //12)
        /*int soma = 0;
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                if(j == ordem - i - 1){
                    soma += matrizA[i][j];
                }
            }
        }
        
        System.out.printf("\nMatriz:\n");
        for (int i = 0; i < ordem; i++) {
          System.out.printf("%d° linha: ", (i+1));
          for (int j = 0; j < ordem; j++) {
            System.out.printf("%d ", matrizA[i][j]);
          }
          System.out.printf("\n");
        }
        
        System.out.println("Produto: " + soma);*/
        
        //12.1
        /*int soma = 0;
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                if(i + j < 2 || i + j > 2){
                    matrizA[i][j] = 0;
                }
                if(matrizA[i][j] > 0){
                    soma += matrizA[i][j];
                }
            }
        }
        
        System.out.printf("\nMatriz:\n");
        for (int i = 0; i < ordem; i++) {
          System.out.printf("%d° linha: ", (i+1));
          for (int j = 0; j < ordem; j++) {
            System.out.printf("%d ", matrizA[i][j]);
          }
          System.out.printf("\n");
        }
        
        System.out.println("Produto: " + soma);*/
    }
}
