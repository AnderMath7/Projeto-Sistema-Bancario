package Entidades;

import java.util.ArrayList;

public class Loja {
	private ArrayList<Funcionario> funcionarios = new ArrayList<>();
	private int id = 0;
	Loja(int id){
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void adicionaFuncionarios(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
	
}
