package Aula08;

import java.io.File;

public class Aula08 {

    public static void main(String[] args) {

        EscreveVetorOrdenado w1 = new EscreveVetorOrdenado();
        File arquivo = w1.inicializa();

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random()*100);
        }

        //vetor = Sort.insertionSort(vetor);
        //vetor = Sort.bubbleSort(vetor);
        vetor = Sort.quickSort(vetor, 0, 9);

        for (int i = 0; i < vetor.length; i++) {
            //System.out.print(vetor[i] + " ");
            w1.escreve(arquivo, vetor[i] + " ", false);
        }
        w1.escreve(arquivo, "\n", false);

    }
}
