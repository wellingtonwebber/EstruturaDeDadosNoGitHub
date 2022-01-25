package Aula18;

public class Aula18 {
    public static void main(String[] args) {
        Dicionario teste = new Dicionario();
        teste.addTabela("Alienado", "Bolsominion");
        teste.addTabela("Apatico", "Expressa apatia");

        //teste.vetor[0].imprimirLista();

        teste.addTabela("Bolo", "Doce gostoso");
        teste.addTabela("Bolinho", "Doce gostoso em miniatura");

        //teste.vetor[1].imprimirLista();

        //teste.excluirItem("Bolo");


        teste.buscaPalavra("bolo");
    }
}
