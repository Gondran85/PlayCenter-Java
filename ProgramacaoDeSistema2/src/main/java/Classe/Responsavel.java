package Classe;


import javax.swing.JOptionPane;

public class Responsavel {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String endereco;
    private int idade;

    // Construtor
    public Responsavel(String nome, String cpf, String telefone, String email, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;        
    }

    public Responsavel() {
    }
    

    // Getters e Setters (métodos para acessar e modificar os atributos)

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public boolean setIdade(String idadeStr) {
        // Verificar se a idade é em branco
        if (idadeStr.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "A idade não pode ser em branco.");
            return false;
        }

        try {
            // Tentar converter a idade para um número inteiro
            int idade = Integer.parseInt(idadeStr);

            // Verificar se a idade é negativa
            if (idade <= 0) {
                JOptionPane.showMessageDialog(null, "A idade não pode ser negativa.");
                return false;
            }

            // Verificar se a idade é maior ou igual a 18
            if (idade >= 18) {
                this.idade = idade;
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "A idade mínima para ser responsável é 18 anos.",
                            "Erro de validação",
                            JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (NumberFormatException e) {
            // Tratar o caso em que a entrada não é um número válido
            JOptionPane.showMessageDialog(null, "Por favor, insira uma idade válida.");
            return false;
        }
    }

}
