
package Aula02;

public class Departamento {
    private String nome;
    protected Funcionario[] funcionario = new Funcionario[100];
    public int i; //indice de funcionarios

    public Departamento(String nome) {
        this.nome = nome;  
        this.i = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario[] getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario[] funcionario) {
        this.funcionario = funcionario;
    }
    
    public boolean adicionaFunc( Funcionario func){
        if (this.i < 100 ) {
            this.funcionario[i] = func;
            this.i ++;
            return true;
        } else {
            return false;
        }
    }

    public void mostraFunc(){
        System.out.println("----------" + this.nome + "---------");
        for(int x = 0; x < i; x++){
            System.out.println(funcionario[x].toString());
        }
    }
    
    public int getIndiceFunc(){
        return i;
    }
    
 }
