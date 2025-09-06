//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(1,"Rodrigo", "09594883677", "Avenida 15", 1200.0 );
        Cliente cliente2 = new Cliente(1,"leo","09885663030","Avenida 12", 1300.0);

        Conta conta1 = new Conta(1,"poupança",cliente1);
        Conta conta2 = new Conta(2,"corrente",cliente2);

        Banco banco1 = new Banco(1,"Itau", "itau@gmail.com","Rua 12", conta1);
        banco1.CadastrarConta(conta2);

        conta2.DepositarSalario();
        conta1.DepositarSalario();

        conta1.transferir(conta2,500);
    }
}