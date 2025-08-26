package br.com.finflow;

public class Cartao {

    private String numero;
    private String validade;
    private String tipo;     // "Débito" ou "Crédito"
    private double limite;
    private String clienteId;

    public Cartao() {
        System.out.println("[FinFlow] Criando cartão (construtor padrão).");
    }

    public Cartao(String numero, String validade, String tipo, double limite, String clienteId) {
        this.numero = numero;
        this.validade = validade;
        this.tipo = tipo;
        this.limite = limite;
        this.clienteId = clienteId;
        System.out.println("[FinFlow] Cartão " + tipo + " criado para cliente " + clienteId + ".");
    }

    public void efetuarPagamento(double valor) {
        System.out.println("[FinFlow] Pagamento de R$ " + valor + " efetuado com cartão " + numero + ".");
    }

    public void consultarLimite() {
        System.out.println("[FinFlow] Limite disponível no cartão " + numero + ": R$ " + limite);
    }

    public void bloquear() {
        System.out.println("[FinFlow] Cartão " + numero + " foi bloqueado.");
    }
}