package Entidades;

import java.util.ArrayList;

public class Loja {
	private int codigoLoja = 01;
	private ArrayList<Funcionario> funcionarios = new ArrayList<>();
	Loja(){
		
	}
	public int getCodigoLoja() {
		return codigoLoja;
	}
	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void adicionaFuncionarios(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
	
}
