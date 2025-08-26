package br.com.finflow;

public class Conta {

    private String numero;
    private String agencia;
    private String tipo;
    private double saldo;
    private boolean ativa;
    private String clienteId;

    public Conta() {
        System.out.println("[FinFlow] Criando conta (construtor padrão).");
    }

    public Conta(String numero, String agencia, String tipo, double saldoInicial, String clienteId) {
        this.numero = numero;
        this.agencia = agencia;
        this.tipo = tipo;
        this.saldo = saldoInicial;
        this.ativa = true;
        this.clienteId = clienteId;
        System.out.println("[FinFlow] Conta " + numero + " criada para cliente " + clienteId + " (tipo: " + tipo + ").");
    }

    public void abrirConta() {
        this.ativa = true;
        System.out.println("[FinFlow] Abrindo conta " + numero + " na agência " + agencia + ".");
    }

    public void fecharConta() {
        this.ativa = false;
        System.out.println("[FinFlow] Fechando conta " + numero + ".");
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("[FinFlow] Depositando R$ " + valor + " na conta " + numero + ". Saldo atual: R$ " + saldo);
    }

    public void sacar(double valor) {
        this.saldo -= valor;
        System.out.println("[FinFlow] Sacando R$ " + valor + " da conta " + numero + ". Saldo atual: R$ " + saldo);
    }

    public void transferir(String contaDestino, double valor) {
        this.saldo -= valor;
        System.out.println("[FinFlow] Transferindo R$ " + valor + " da conta " + numero + " para a conta " + contaDestino + ". Saldo atual: R$ " + saldo);
    }

    public void consultarSaldo() {
        System.out.println("[FinFlow] Saldo da conta " + numero + ": R$ " + String.format("%.2f", saldo));
    }
}