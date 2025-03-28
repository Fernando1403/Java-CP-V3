package br.com.fiap.cp.v3;

import br.com.fiap.cp.v3.contas.ContaCorrente;
import br.com.fiap.cp.v3.contas.ContaPoupanca;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();

        ContaCorrente contaCorrente = new ContaCorrente("Fernando", 700);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Gabriel", 900);

        banco.adicionarContaCorrente(contaCorrente);
        banco.adicionarContaPoupanca(contaPoupanca);

        contaCorrente.depositar(300);
        contaCorrente.sacar(100);

        contaPoupanca.depositar(1000);
        contaPoupanca.sacar(3000);
        contaPoupanca.sacar(400);

        banco.aplicarAtributos();
        banco.aplicarRendimentos();
        banco.mostrarSaldos();
    }
}
