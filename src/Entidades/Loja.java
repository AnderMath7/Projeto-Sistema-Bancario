package Entidades;

import java.util.ArrayList;

public class Loja {
	private String nome = "";
	private ArrayList<Funcionario> funcionarios = new ArrayList<>();
	private Conta conta = new Conta();
	Loja(String nome){
		this.nome = nome;
	}
	
	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
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
	
}
