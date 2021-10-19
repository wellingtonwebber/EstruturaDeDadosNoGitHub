package Aula03;

public class Main {
    public static void main(String[] args) {

        Aluno[] aluno = new Aluno[5];

        aluno[0] = new Aluno("Wellington", 23, "ADS");
        aluno[1] = new Aluno("Luisa", 15, "ADS");
        aluno[2] = new Aluno("Joao", 18, "Matemática");
        aluno[3] = new Aluno("Maria", 21, "Matemática");
        aluno[4] = new Aluno("José", 17, "ADS");

        Vetores.mostrarVetor(aluno);

    }
}
