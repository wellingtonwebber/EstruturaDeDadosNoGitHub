package Aula08;

import java.io.*;

public class EscreveVetorOrdenado {

        public File inicializa() {

            File arquivo = new File("C:\\Users\\Pichau\\OneDrive\\Documentos\\GitHub\\EstruturaDeDadosNoGitHub\\src\\Aula08\\resultados.md");
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
                if(texto.equals("\n")){
                    bw.newLine();
                } else {
                    bw.write(texto);
                }
                bw.write(texto);
                bw.close();
                fw.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
}
