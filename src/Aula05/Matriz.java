package Aula05;

public class Matriz {

    public static String buscarPrimeiraPosicaoPalavra (String matriz[][], String texto){

        int x = 0, y = 0;
        boolean flag = false;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j].contains(texto)){
                    x = i;
                    y = j;
                    flag = true;
                    break;
                }
            }
            if(flag) break;
        }
        return '"' + texto + '"' + " - Posição [" + x + "][" + y + "]";
    }

    public static String buscarUltimaPosicaoPalavra (String matriz[][], String texto){

        int x = 0, y = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j].contains(texto)){
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        return '"' + texto + '"' + " - Posição [" + x + "][" + y + "]";
    }

    public static int[][] buscarTodasPosicoesPalavra (String matriz[][], String texto){

        int matrizVerdade[][] = new int[matriz.length][matriz[0].length];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j].contains(texto)){
                    matrizVerdade[i][j] = 1;
                } else {
                    matrizVerdade[i][j] = 0;
                }
            }
        }
        return matrizVerdade;
    }

    public static int[] converterMatrizEmVetor(int[][] matriz){
        int[] vetor = new int[(matriz.length * matriz[0].length)]; //multiplica as dimensões da matriz para obter tamanho do vetor
        int indice = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                vetor[indice] = matriz[i][j];
                indice++;
            }
        }
        return vetor;
    }

    public static int[][] converterVetorEmMatriz(int[] vetor, int nlinhas, int ncolunas){ // recebe dimnesões para matriz a ser convertida
        int [][] matriz = new int[nlinhas][ncolunas];
        int indice = 0;
        for(int i = 0; i < nlinhas; i++){
            for(int j = 0; j < ncolunas; j++){
                matriz[i][j] = vetor[indice];
                indice++;
            }
        }
        return matriz;
    }


}
