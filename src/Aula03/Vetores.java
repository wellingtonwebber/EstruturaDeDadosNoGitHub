package Aula03;

public class Vetores {

    public static void mostrarVetor(Aluno v[]){
        for(int i = 0; i < v.length; i++) {

            System.out.println(v[i].toString());
            if (v[i].getIdade() < 18){
                System.out.println("É menor de idade!\n");
            } else {
                System.out.println("Não é menor de idade!\n");
            }

        }
    }

}
