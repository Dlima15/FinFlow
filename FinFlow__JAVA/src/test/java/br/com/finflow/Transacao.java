package br.com.finflow;

import java.time.LocalDate;

public class Transacao {

    // Atributos
    private String id;
    private String tipo;
    private double valor;
    private LocalDate data;
    private String contaOrigem;
    private String contaDestino;

    // Construtor padrão
    public Transacao() {
        System.out.println("[FinFlow] Criando transação (construtor padrão).");
    }

    // Construtor com parâmetros
    public Transacao(String id, String tipo, double valor, LocalDate data, String contaOrigem, String contaDestino) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        System.out.println("[FinFlow] Transação criada: " + tipo + " de R$ " + valor + " em " + data);
    }

    // Métodos de exemplo (prints)
    public void registrar() {
        System.out.println("[FinFlow] Registrando transação " + id + ": " + tipo + " de R$ " + valor);
    }

    public void exibirDetalhes() {
        System.out.println("[FinFlow] Detalhes -> ID: " + id + ", Tipo: " + tipo +
                ", Valor: R$ " + valor + ", Data: " + data +
                ", Origem: " + contaOrigem + ", Destino: " + contaDestino);
    }

    public void estornar() {
        System.out.println("[FinFlow] Estornando transação " + id + " no valor de R$ " + valor);
    }
}
