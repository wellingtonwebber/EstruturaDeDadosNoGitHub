package Aula13;

public class ListaDupla {
    Elemento inicio;
    Elemento fim;
    int tamanho;

    public void inserirInicio(String valor){
        Elemento elemento = new Elemento();
        elemento.setValor(valor);
        elemento.setAnterior(null);
        elemento.setProximo(inicio);
        if(inicio != null){
            inicio.setAnterior(elemento);
        }
        inicio = elemento;
        if(tamanho == 0){
            fim = inicio;
        }
        tamanho++;
    }

    public String retirarInicio(){
        if(inicio == null){
            return null;
        }
        String out = inicio.getValor();
        inicio = inicio.getProximo();
        if (inicio != null){
            inicio.setAnterior(null);
        } else {
            fim.setValor(null);
        }
        tamanho--;
        return out;
    }

    public void inserirFim(String valor){
        Elemento elemento = new Elemento();
        elemento.setValor(valor);
        elemento.setProximo(null);
        elemento.setAnterior(fim);
        if(fim != null){
            fim.setProximo(elemento);
        }
        fim = elemento;
        if(tamanho == 0){
            inicio = elemento;
        }
        tamanho++;

    }

    public String retirarFim(){
        if(fim == null){
            return null;
        }
        String out = fim.getValor();
        fim = fim.getAnterior();
        if (fim != null){
            fim.setProximo(null);
        } else {
            inicio = null;
        }
        tamanho--;
        return out;
    }

    public void inserirMeio(int indice, String valor){
        if(indice <= 0){
            inserirInicio(valor);
        } else if(indice >= tamanho){
            inserirFim(valor);
        } else {
            Elemento local = inicio;
            for (int i = 0; i < indice-1; i++){
                local = local.getProximo();
            }
            Elemento elemento = new Elemento();
            elemento.setValor(valor);
            elemento.setAnterior(local);
            elemento.setProximo(local.getProximo());
            local.setProximo(elemento);
            elemento.getProximo().setAnterior(elemento);
            tamanho++;
        }
    }

    public String retirarMeio(int indice){
        if(indice < 0 || indice >= tamanho || inicio == null){
            return null;
        } else if(indice == 0){
            return retirarInicio();
        } else if(indice == tamanho-1){
            return retirarFim();
        } else {
            Elemento local = inicio;
            for (int i = 0; i < indice; i++){
                local = local.getProximo();
            }
            if (local.getAnterior() != null){
                local.getAnterior().setProximo(local.getProximo());
            }
            if (local.getProximo() != null){
                local.getProximo().setAnterior(local.getAnterior());
            }
            tamanho--;
            return local.getValor();
        }
    }

    public String toString(){
        String str = "(" + tamanho + ") ";
        Elemento local = inicio;
        while (local != null) {
            str += local.getValor() + " ";
            local = local.getProximo();
        }
        return str;
    }
}
