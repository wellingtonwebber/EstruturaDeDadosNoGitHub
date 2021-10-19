package Aula04;

public class Matrizes {

    public static void lerMatriz(String[][] livro){
        for(int i = 0; i < livro.length; i++){
            System.out.println("--------------------------");
            System.out.println("Página número " + (i+1) + "\n");
            for(int j = 0; j < livro[i].length; j++)
                System.out.printf("%02d %s\n", (j+1), livro[i][j]);

        }
    }
}
