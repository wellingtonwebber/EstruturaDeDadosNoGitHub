
package EE.IntelliJ;

public class Main {

    public static void main(String[] args) {
        
        Empresa e1 = new Empresa("Gerdau", 165161854);
        
        Funcionario[] f = new Funcionario[3];
        f[0] = new Funcionario("Wellington", 2000.0f, "22/05/1996");
        f[1] = new Funcionario("Maria", 5000.0f, "22/09/2000");
        f[2] = new Funcionario("Joao", 5210.0f, "12/04/2013");
        
        Departamento[] d = new Departamento[3];
        d[0] = new Departamento("Juridico");
        d[1] = new Departamento("Financeiro");
        d[2] = new Departamento("Manutenção");
        
        for(int x = 0; x < 3; x++) {
             for(int y = 0; y < 3; y++) {
                 d[x].adicionaFunc(f[y]);
             }
             e1.adicionaDep(d[x]);
        }

        //e1.mostraDep();
        d[1].mostraFunc();
        e1.darAumentoDep("Financeiro");
        d[1].mostraFunc();
          
    }
    
}
