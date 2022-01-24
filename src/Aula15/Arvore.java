package Aula15;

public class Arvore {
    private No raiz;

    public Arvore() {
        this.raiz = null;
    }

   public int contarNos(){
        return contarNos(raiz);
   }

   private int contarNos(No n) {
        if(n == null) return 0;
        return 1 + contarNos(n.getLeft()) + contarNos(n.getRight());
   }

   public int profundidade(){
        return profundidade(raiz);
   }

   private int profundidade(No n){
        if(n == null) return -1;
        return 1 + Math.max(profundidade(n.getLeft()), profundidade(n.getRight()));
   }

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

    public boolean isEmpty(){
        return raiz == null;
    }
}
