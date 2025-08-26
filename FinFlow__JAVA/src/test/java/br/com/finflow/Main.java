package br.com.finflow;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Cliente
        Cliente cliente = new Cliente("C001", "Danilo Lima Cruz", "533.648.778-31", "danilo.lima7456@gmail.com", "11 93425-9549");
        cliente.exibirDados();
        cliente.atualizarContato("danilo.limacr@icloud.com", "11 96833-2758");
        cliente.solicitarAberturaConta();

        // Conta
        Conta conta = new Conta("000123-4", "0001", "Corrente", 1500.0, "C001");
        conta.consultarSaldo();
        conta.depositar(250.0);
        conta.sacar(100.0);
        conta.transferir("000999-0", 200.0);
        conta.consultarSaldo();

        // Transação
        Transacao t1 = new Transacao("T001", "Depósito", 250.0, LocalDate.now(), "000123-4", "000123-4");
        t1.registrar();
        t1.exibirDetalhes();
        t1.estornar();

        // Cartão
        Cartao cartao = new Cartao("5555 4444 3333 2222", "12/28", "Crédito", 3000.0, "C001");
        cartao.consultarLimite();
        cartao.efetuarPagamento(189.90);
        cartao.bloquear();
    }
}
