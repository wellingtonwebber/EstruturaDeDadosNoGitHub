package Aula16;

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

   public boolean contem(String valor){
        return contem(raiz, valor);
   }

   private boolean contem(No n, String valor){
        if (n == null) return false;
        if (n.getValor().equals(valor)) return true;
        return contem(n.getLeft(), valor) || contem(n.getRight(), valor);
   }

   public void escrevaPreOrdem(){
       System.out.print("Pre Ordem: ");
       escrevaPreOrdem(raiz);
       System.out.println();
   }

   private void escrevaPreOrdem(No n){
        if(n == null) return;
       System.out.print(" " + n.getValor());
       escrevaPreOrdem(n.getLeft());
       escrevaPreOrdem(n.getRight());
   }

    public void escrevaEmOrdem(){
        System.out.print("Em Ordem: ");
        escrevaEmOrdem(raiz);
        System.out.println();
    }

    private void escrevaEmOrdem(No n){
        if(n == null) return;
        escrevaEmOrdem(n.getLeft());
        System.out.print(" " + n.getValor());
        escrevaEmOrdem(n.getRight());
    }

    public void escrevaPosOrdem(){
        System.out.print("Pos Ordem: ");
        escrevaPosOrdem(raiz);
        System.out.println();
    }

    private void escrevaPosOrdem(No n){
        if(n == null) return;
        escrevaPosOrdem(n.getLeft());
        escrevaPosOrdem(n.getRight());
        System.out.print(" " + n.getValor());
    }

/*    public void printBFS(){

        Fila q = new Fila();
        q.adicionar();
        while()

    }

 */

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
