package br.com.finflow;

public class Cliente {

    private String id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;

    public Cliente() {
        System.out.println("[FinFlow] Criando cliente (construtor padrão).");
    }

    public Cliente(String id, String nome, String cpf, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        System.out.println("[FinFlow] Cliente criado: " + nome);
    }

    public void exibirDados() {
        System.out.println("[FinFlow] Dados do cliente -> ID: " + id + ", Nome: " + nome +
                ", CPF: " + cpf + ", Email: " + email + ", Telefone: " + telefone);
    }

    public void atualizarContato(String novoEmail, String novoTelefone) {
        this.email = novoEmail;
        this.telefone = novoTelefone;
        System.out.println("[FinFlow] Contato do cliente " + nome +
                " atualizado para Email: " + novoEmail + ", Telefone: " + novoTelefone);
    }

    public void solicitarAberturaConta() {
        System.out.println("[FinFlow] Cliente " + nome + " solicitou abertura de conta.");
    }
}
