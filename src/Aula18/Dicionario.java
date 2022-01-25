package Aula18;

import java.util.Locale;

public class Dicionario {
    ListaLigada vetor[];

    public Dicionario(){
        vetor = new ListaLigada[26];
        inicializaListas();
    }
    final void inicializaListas(){
        for (int i = 0; i < 26; i++){
            vetor[i] = new ListaLigada();
        }
    }

    final int funcaoHash(String palavra){
        palavra = palavra.toLowerCase();
        int posicao = palavra.charAt(0);
        return posicao - 97;
    }

    final void addTabela(String palavra, String descricao){
        vetor[funcaoHash(palavra)].adicionar(palavra, descricao);
    }

    final void excluirItem(String palavra){
        System.out.println("*** Itens nesse indice ***\n");
        vetor[funcaoHash(palavra)].imprimirLista();
        vetor[funcaoHash(palavra)].remover(palavra);
        System.out.println("*** Itens nesse indice após exclusão ***\n");
        vetor[funcaoHash(palavra)].imprimirLista();

    }

    final void buscaPalavra(String palavra){
        vetor[funcaoHash(palavra)].buscaElemento(palavra);
    }

}
