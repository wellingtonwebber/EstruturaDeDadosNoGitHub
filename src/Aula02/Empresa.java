
package Aula02;

public class Empresa {
    private String nome;
    private int cnpj;
    private Departamento[] departamento = new Departamento[10];
    private int d;

    public Empresa(String nome, int cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.d = 0;
    }
    
    public boolean adicionaDep( Departamento dep){
        if (this.d < 100 ) {
            this.departamento[d] = dep;
            this.d ++;
            return true;
        } else {
            return false;
        }
    }
        
    public void darAumentoDep(String nome){
        int y = 0, z;
        for(int x = 0; x < d; x++){
            if (this.departamento[x].getNome().equals(nome)) {
                y = x;
            }
        }
        z = this.departamento[y].getIndiceFunc(); // retorna o indice de funcionarios do departamento
        for(int x = 0; x < z; x++){
            this.departamento[y].funcionario[x].setSalario(this.departamento[y].funcionario[x].getSalario() * 1.1f); //usa set e get de funcionario
         }
    }    

    public void mostraDep(){
        System.out.println("----------" + this.nome + "---------");
        for(int x = 0; x < d; x++){
            System.out.println(departamento[x].getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
    
    public int getIndiceDep(){ //retorna indice dos Dep
        return d;
    }
}
