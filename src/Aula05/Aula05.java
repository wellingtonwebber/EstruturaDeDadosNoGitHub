/*
   Escreva um programa que pergunte ao usuário o tamanho de uma matriz, inicialize-a, e
   em seguida preencha a matriz com inteiros, de forma crescente (1, 2, 3, etc.). Por fim, imprima a matriz preenchida.
 */
package Aula05;

import java.util.Arrays;
import java.util.Scanner;

public class Aula05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas da matriz: ");
        int nl = sc.nextInt();
        System.out.println("Digite a quantidade de colunas da matriz: ");
        int nc = sc.nextInt();

        int[][] matrizInt = new int[nl][nc];
        int[] vetor;

        System.out.println("Digite os valores de cada posição da matriz: ");

        for(int i = 0; i < matrizInt.length; i++){
            for(int j = 0; j < matrizInt[i].length; j++){
                System.out.println("Posição [" + i + "][" + j + "] = ");
                matrizInt[i][j] = sc.nextInt();
            }
        }
/*
        //teste
        int[][] matrizInt = {{8, 6, 2}, {5, 9, 7}, {4, 3, 1}};
        int[] vetor;
*/
        vetor = Matriz.converterMatrizEmVetor(matrizInt);
        Arrays.sort(vetor);
        matrizInt = Matriz.converterVetorEmMatriz(vetor, nl, nc);


        for(int i = 0; i < matrizInt.length; i++){
            for(int j = 0; j < matrizInt[i].length; j++){
                System.out.print(matrizInt[i][j] + " ");
            }
            System.out.println();
        }

 /*
        Escreva um método que receba uma matriz de Strings e uma String "texto" como parâmetros.
        O método deve fazer uma busca na matriz para encontrar a posição que contém o texto informado.
        Obs: o conteúdo armazenado na matriz não precisa ser idêntico ao buscado, mas sim conter o conteúdo buscado
        em parte de seu conteúdo.
  */

        String[][] matriz = new String[3][3];
        int[][] posicoes;
        matriz[0][0] = "Escreva um programa que pergunte ao usuário";
        matriz[0][1] = "o tamanho de uma matriz, inicialize-a,";
        matriz[0][2] = "e em seguida preencha a matriz com inteiros,";
        matriz[1][0] = "de forma crescente (1, 2, 3, etc.).";
        matriz[1][1] = "Por fim, imprima a matriz preenchida.";
        matriz[1][2] = "método que receba uma matriz";
        matriz[2][0] = "fazer uma busca na matriz para encontrar a posição";
        matriz[2][1] = "Adicione seu programa ao seu repositório";
        matriz[2][2] = "poste aqui as instruções para acesso";

        System.out.println(Matriz.buscarPrimeiraPosicaoPalavra(matriz, "matriz"));
        System.out.println(Matriz.buscarUltimaPosicaoPalavra(matriz, "matriz"));
        posicoes = Matriz.buscarTodasPosicoesPalavra(matriz, "matriz");


        //mostra a matriz com cada posição que contenha a palavra buscada sendo 1
        for(int i = 0; i < posicoes.length; i++){
            for(int j = 0; j < posicoes[i].length; j++){
                System.out.println("Posição[" + i + "][" + j + "] = " + posicoes[i][j]);
            }
        }

    }

}

