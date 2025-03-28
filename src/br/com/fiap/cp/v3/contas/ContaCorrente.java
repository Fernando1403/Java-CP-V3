package br.com.fiap.cp.v3.contas;

import br.com.fiap.cp.v3.Conta;
import br.com.fiap.cp.v3.interfaces.Imposto;

public class ContaCorrente extends Conta implements Imposto{

    public ContaCorrente(String nome, double saldo){
        super(nome, saldo);
    }

    @Override
    public double calcularImposto() {
        double saldo = super.getSaldo();
        double imposto = saldo * 0.02;
        saldo -= imposto;

        super.setSaldo(saldo);

        System.out.println("O valor do imposto é R$: " + imposto + " o saldo agora é R$: " + saldo);
        return imposto;
    }
}
