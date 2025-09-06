import java.util.Date;
import java.util.Scanner;

public class Conta {
    public int id;
    public String tipo;
    public Date data;
    public double saldo;
    public Cliente cliente;

    Scanner scan = new Scanner(System.in);

    public Conta(int id, String tipo, Cliente cliente) {
        this.id = id;
        this.tipo = tipo;
        this.data = new Date();
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public void DepositarSalario(){
        this.saldo = this.saldo +  cliente.salario;
    }
    public void Depositar(double valor){
        this.saldo += valor;
    }

    public void Sacar(double valor){
        if(saldo >= valor){
            this.saldo = this.saldo - valor;
        }else{
            System.out.println("O valor está acima do saldo");
        }
    }

    public double ConsultarSaldo(){
        return this.saldo;
    }

    public void transferir(Conta conta, double valor){
        this.Sacar(valor);
        conta.Depositar(valor);
    }
}
