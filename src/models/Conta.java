package models;

public abstract class Conta {
    private static final int AGENCIA_PADRAO = 001;
    private static int SEQUENCIAL = 1;

    protected String nomeCliente;
    protected int agencia;
    protected int conta;
    protected double saldo;

    //Construtor
    public Conta(String cliente) {
        this.nomeCliente = cliente;
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
    }

    //Getters

    public String getNomeCliente() {
        return nomeCliente;
    }
    public int getAgencia() {
        return agencia;
    }
    public int getConta() {
        return conta;
    }
    public double getSaldo() {
        return saldo;
    }

    //Setters
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Metodos
    public void sacar(double valor){
        saldo -= valor;
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void imprimirExtrato(){
        System.out.println("Conta :"+getConta()+" - Agencia: "+getAgencia()+" - saldo: "+getSaldo());
    }

}
