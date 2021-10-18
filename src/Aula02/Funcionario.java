
package Aula02;

public class Funcionario {
    private String nome;
    private float salario;
    private String dataAdmissao;

    public Funcionario(String nome, float salario, String dataAdmissao) {
        this.nome = nome;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome = " + nome + ", \nsalario = " + salario + ", \ndataAdmissao = " + dataAdmissao + "}\n--------------------------------------------";
    }
    
    
}
