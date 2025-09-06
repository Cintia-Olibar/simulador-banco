import java.util.ArrayList;
import java.util.List;

public class Banco {
    public int it;
    public String nome;
    public String email;
    public String endereco;
    public List<Conta> contas = new ArrayList<>();

    public Banco(int it, String nome, String email, String endereco, Conta conta) {
        this.it = it;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        CadastrarConta(conta);
    }

    public void CadastrarConta(Conta conta){
        this.contas.add(conta);
    }

    public void ConsultarTipoConta(){
        for (Conta conta: contas){
            System.out.println(conta.tipo);
        }
    }

}
