package Entidades;

public class Funcionario extends Thread{
	private int id = 0;
	Funcionario(int id){
		this.id = id;
	}
	
	public void run(){
		
	}
	
	public long getId() {
		return id;
	}
	
	
}
