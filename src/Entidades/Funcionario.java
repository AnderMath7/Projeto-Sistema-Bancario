package Entidades;

public class Funcionario extends Thread {
    private String nome;
    private Conta contaSalario = new Conta();
    private Conta contaInvestimento = new Conta();
    private String movimentacaoContaSalario = "";
    private String movimentacaoContaInvestimento = "";

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public synchronized void receberSalario(double valor) {
        contaSalario.setSaldo(contaSalario.getSaldo() + valor);
        setMovimentacaoContaSalario("Recebimento de salário: R$ " + valor + "\n");

        transferirContaInvestimento(valor);
    }

    public synchronized void transferirContaInvestimento(double valorSalario) {
        double valorTransferencia = valorSalario * 0.2;
        contaSalario.setSaldo(contaSalario.getSaldo() - valorTransferencia);
        contaInvestimento.setSaldo(contaInvestimento.getSaldo() + valorTransferencia);

        setMovimentacaoContaSalario(nome + " transferiu: R$ " + valorTransferencia + " para conta de investimentos\n");
        setMovimentacaoContaInvestimento("Transferência de R$ " + valorTransferencia + " recebida da conta salário\n");
    }

    public synchronized double lerSaldoContaSalario() {
        return contaSalario.getSaldo();
    }

    public synchronized double lerSaldoContaInvestimento() {
        return contaInvestimento.getSaldo();
    }

    private synchronized void setMovimentacaoContaSalario(String movimentacao) {
        this.movimentacaoContaSalario += movimentacao;  
    }

    private synchronized void setMovimentacaoContaInvestimento(String movimentacao) {
        this.movimentacaoContaInvestimento += movimentacao;
    }

    public synchronized String getMovimentacoes() {
        return nome + ":\n" +
               "Conta Salário:\n" + movimentacaoContaSalario +
               "Saldo conta salário: R$ " + contaSalario.getSaldo() + "\n\n" +
               "Conta Investimento:\n" + movimentacaoContaInvestimento +
               "Saldo conta de investimentos: R$ " + contaInvestimento.getSaldo();
    }
}
