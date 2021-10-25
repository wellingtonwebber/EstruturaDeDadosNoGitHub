package Aula06;

import java.io.File;

public class Aula06 {

    public static void main(String[] args) {

        Ponto p1 = new Ponto(5.0d, 8.0d);
        Ponto p2 = new Ponto(3.0d, 6.0d);
/*
        System.out.println(p1.distancia(p2));
        p1.soma(p2);
        System.out.println(p1.distancia(p2));
 */

        ManipuladorDeArquivos mp = new ManipuladorDeArquivos();
        File arquivo = mp.inicializa();
        mp.escreve(arquivo, "8,4", true);
        mp.escreve(arquivo, "6,3", false);
        Ponto[] vetor = mp.leiaPontos(arquivo);

        System.out.println(vetor[0].getCoordX() + "," + vetor[0].getCoordY());
        System.out.println(vetor[1].getCoordX() + "," + vetor[1].getCoordY());
    }
}
