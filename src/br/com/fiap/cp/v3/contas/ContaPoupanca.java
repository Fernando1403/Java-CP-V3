package br.com.fiap.cp.v3.contas;

import br.com.fiap.cp.v3.Conta;
import br.com.fiap.cp.v3.interfaces.Rentavel;

public class ContaPoupanca extends Conta implements Rentavel {

    @Override
    public double calcularRendimento() {
        double saldo = super.getSaldo();
        double rendimento =saldo * 0.05;
        saldo += rendimento;

        super.setSaldo(saldo);

        System.out.println("Neste mes a conta rendeu um total de R$: " + rendimento + " o saldo atual é R$: " + saldo);
        return rendimento;
    }

    public ContaPoupanca(String nome, double saldo){
        super(nome, saldo);
    }
}
