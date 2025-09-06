public class Cliente {
    public int codigo;
    public String nome;
    public String cpf;
    public String endereco;
    public double salario;

    public Cliente(int codigo, String nome, String cpf, String endereco, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.salario = salario;
    }

    public double VerificarSalario(){
        return this.salario;
    }

    public void AlterarSalario(double salario) {
        this.salario = salario;
    }
}
