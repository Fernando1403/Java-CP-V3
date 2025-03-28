package br.com.fiap.cp.v3;

import br.com.fiap.cp.v3.contas.ContaCorrente;
import br.com.fiap.cp.v3.contas.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<ContaCorrente> contasCorrente;
    private List<ContaPoupanca> contasPoupanca;

    public Banco(){
        this.contasCorrente = new ArrayList<>();
        this.contasPoupanca = new ArrayList<>();
    }

    public void adicionarContaCorrente(ContaCorrente conta){
        contasCorrente.add(conta);
    }

    public void adicionarContaPoupanca(ContaPoupanca conta){
        contasPoupanca.add(conta);
    }

    public void aplicarAtributos(){
        for(ContaCorrente conta : contasCorrente){
            conta.calcularImposto();
        }
    }

    public void aplicarRendimentos(){
        for(ContaPoupanca conta : contasPoupanca){
            conta.calcularRendimento();
        }
    }

    public void mostrarSaldos(){
        for(ContaCorrente conta : contasCorrente){
            System.out.println("O saldo da conta corrente é R$: " + conta.getSaldo());
        }
        for(ContaPoupanca conta : contasPoupanca){
            System.out.println("O saldo da conta poupanca é R$: " + conta.getSaldo());
        }
    }
}
