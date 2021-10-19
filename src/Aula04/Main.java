package Aula04;


public class Main {

    public static void main(String[] args) {

        String[][] livro = new String[5][5];

        for(int i = 0; i < livro.length; i++){
            for(int j = 0; j < livro[i].length; j++){
                livro[i][j] = "Texto da linha " + (j+1);
            }
        }

        Matrizes.lerMatriz(livro);

    }
}
