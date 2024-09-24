package Entidades;

import java.util.ArrayList;

public class Loja {
	private String nome = "";
	private ArrayList<Funcionario> funcionarios = new ArrayList<>();
	private double valorSalario = 1400;
	private Conta conta = new Conta();
	private String movimentacao = "";

	Loja(String nome){
		this.nome = nome;
	}
	
	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public Funcionario getFuncionario(int indice) {
		return funcionarios.get(indice);
	}
	public void adicionaFuncionarios(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
	
	public void receberTransferencia(double valor) {
		conta.setSaldo(conta.getSaldo() + valor);
	}
	public double lerSaldo() {
		return conta.getSaldo();
	}
	public String getNome() {
		return nome;
	}
	public void pagarFuncionarios() {
		conta.setSaldo(conta.getSaldo() - valorSalario);
	}
	public double getValorSalario() {
		return valorSalario;
	}

	public String getMovimentacao() {
		return movimentacao;
	}

	public void setMovimentacao(String movimentacao) {
		this.movimentacao = this.movimentacao + movimentacao;
	}
	
	
}
