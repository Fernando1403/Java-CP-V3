package br.com.fiap.cp.v3;

public class Conta {

    private String nome;
    private double saldo;
    private int numeroConta;

    public Conta(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Deposito no valor R$: " + valor + " realizado com sucesso! Saldo total R$: " + this.saldo);
    }

    public void sacar(double valor){
        if(valor > this.saldo){
            System.out.println("Saque maior que o saldo da conta");
        }
        else{
            this.saldo -= valor;
            System.out.println("Saque no valor R$: " + valor + " realizado com sucesso! Saldo total R$: " + this.saldo);
        }
    }
}
