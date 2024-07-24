package models;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<Integer, Conta> clientes = new HashMap<>();


    public Map<Integer, Conta> getClientes() {
        return clientes;
    }

    public void adicionarConta(Integer contaC, Conta conta){
        clientes.put(contaC, conta);
        System.out.println("Bem vindo ao banco tal "+conta.getNomeCliente());
    }


    public void exibirListaDeContas(){
        for (Map.Entry<Integer, Conta> cliente : clientes.entrySet()){
            System.out.println("Conta: "+cliente.getKey()+" - usuario: "+cliente.getValue().nomeCliente);
            System.out.println("Saldo: "+cliente.getValue().getSaldo());
        }
    }
}
