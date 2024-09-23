package Entidades;

public class Funcionario extends Thread{
	private int id = 0;
	private int codigoFuncionario = 02;
	Funcionario(int id){
		this.id = id;
	}
	
	public void run(){
		
	}
	
	public long getId() {
		return id;
	}
	public int getCodigoFuncionario() {
		return codigoFuncionario;
	}
}
