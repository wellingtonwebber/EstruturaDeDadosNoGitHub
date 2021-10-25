package Aula06;

import java.io.*;

public class ManipuladorDeArquivos {

    public File inicializa() {

        File arquivo = new File("C:\\Users\\Pichau\\OneDrive\\Documentos\\GitHub\\MeusArquivos\\aula06.txt");
        boolean existe = arquivo.exists();

        if(!existe){
            try{
                arquivo.createNewFile();
            } catch(IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return arquivo;
    }

    public void escreve(File arquivo, String texto, boolean sobrescrever){
        try{

            FileWriter fw = new FileWriter(arquivo, !sobrescrever);
            BufferedWriter bw = new BufferedWriter(fw);
            //escreve o conteúdo no arquivo
            bw.write(texto);
            bw.newLine();
            bw.close();
            fw.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void leia(File arquivo){

        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);

            while(br.ready()){
                String linha = br.readLine();
                System.out.println(linha);
            }

            br.close();
            fr.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public Ponto[] leiaPontos(File arquivo){

        Ponto[] retornoPontos = new Ponto[2];
        retornoPontos[0] = new Ponto(0,0);
        retornoPontos[1] = new Ponto(0,0);

        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            int indice = 0;

            while(br.ready()){
                String linha = br.readLine();
                String[] pedacosLinha = linha.split(",");
                double coordX = Double.parseDouble(pedacosLinha[0]);
                double coordY = Double.parseDouble(pedacosLinha[1]);
                retornoPontos[indice].setCoordX(coordX);
                retornoPontos[indice].setCoordY(coordY);
                indice++;
            }

            br.close();
            fr.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return retornoPontos;
    }

}
