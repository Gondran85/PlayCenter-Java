package Classe;

import javax.swing.JOptionPane;

public class Estadia {
    private Responsavel responsavel;
    private Crianca crianca;
    private int tempoUtilizado;

    // Construtor
    public Estadia(Responsavel responsavel, Crianca crianca, int tempoUtilizado) {
        this.responsavel = responsavel;
        this.crianca = crianca;
        this.tempoUtilizado = tempoUtilizado;
    }

    // Métodos para cálculos e resumo

    public double calcularCusto() {
        double custoPorMinuto = 1.5;
        double custoTotal = custoPorMinuto * tempoUtilizado;

        // Aplicar descontos cumulativos conforme as faixas
        if (tempoUtilizado > 20 && tempoUtilizado <= 39) {
            custoTotal *= 0.95; // Desconto de 5%
        }
        if (tempoUtilizado > 40 && tempoUtilizado <= 59) {
            custoTotal *= 0.90; // Desconto de 10%
        }
        if (tempoUtilizado > 60) {
            custoTotal *= 0.85; // Desconto de 15%
        }

    return custoTotal;
}


    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public Crianca getCrianca() {
        return crianca;
    }

    public void setCrianca(Crianca crianca) {
        this.crianca = crianca;
    }

    public int getTempoUtilizado() {
        return tempoUtilizado;
    }

    public void setTempoUtilizado(int tempoUtilizado) {
        this.tempoUtilizado = tempoUtilizado;
    }
    

    public String gerarResumo() {
        String dados= "Dados da Estadia\n"
                + "Nome do Responsável: "+responsavel.getNome()
                +"\nCPF do Responsável: "+responsavel.getCpf()+
                "\nTelefone do Responsável: "+responsavel.getTelefone()+
                "\nE-mail do Responsável: "+responsavel.getEmail()+
                "\nEndereço do Responsável: "+responsavel.getEndereco()+
                "\nIdade do Responsável: "+responsavel.getIdade()+
                "\nNome da Criança: "+crianca.getNome()+
                "\nIdade da Criança: "+crianca.getIdade()+
                "\nSexo da Criança: "+crianca.getSexo()+
                "\nTempo no Brinquedo: "+getTempoUtilizado()+
                "\nValor a Pagar: "+calcularCusto();
        
        return dados;
    }
}
