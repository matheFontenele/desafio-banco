import models.*;

public class Main {
    public static void main(String[] args) {
        Cliente jose = new Cliente("Jose");
        Cliente maria = new Cliente("Maria");

        Conta cc = new ContaCorrente(jose.getNome());
        Conta cp = new ContaPoupanca(maria.getNome());

        cc.depositar(100);

        cc.transferir(50, cp);

        Banco banco1 = new Banco();

        banco1.adicionarConta(cc.getConta(), cc);
        banco1.adicionarConta(cp.getConta(), cp);

        banco1.exibirListaDeContas();

//        cc.imprimirExtrato();
//        cp.imprimirExtrato();

    }
}