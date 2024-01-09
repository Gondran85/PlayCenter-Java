package Classe;


import javax.swing.JOptionPane;

public class Crianca {
    private Responsavel responsavel;
    private String nome;
    private int idade;
    private String sexo;

    // Construtor
    public Crianca(Responsavel responsavel, String nome,  String sexo) {
        this.responsavel = responsavel;
        this.nome = nome;
        this.sexo = sexo;
    }

    public Crianca() {
    }
    

    // Getters e Setters

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
                JOptionPane.showMessageDialog(null, "A idade minima para Criança brincar é 1 ano.");
                return false;
            }

            // Verificar se a idade é menor ou igual a 10
            if (idade <=10 && idade > 0) {
                this.idade = idade;
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "A idade maxima para Criança Brincar é 10 anos.",
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
