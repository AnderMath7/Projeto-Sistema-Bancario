package Entidades;

import java.util.ArrayList;

public class Loja {
	private ArrayList<Funcionario> funcionarios = new ArrayList<>();
	private Conta conta = new Conta();
	Loja(){
		
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
	
}
