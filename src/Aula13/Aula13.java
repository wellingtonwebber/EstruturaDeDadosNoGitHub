package Aula13;

public class Aula13 {
    public static void main(String[] args) {
        ListaDupla l = new ListaDupla();

        for(int i = 0; i < 6; i++){
            l.inserirFim("" + (char) (i + 97));
            System.out.println(l.toString());
        }

        l.inserirMeio(2, "j");
        System.out.println(l.toString());

        l.retirarMeio(3);
        System.out.println(l.toString());

        while(l.retirarFim() != null){
            System.out.println(l.toString());
        }
    }
}
