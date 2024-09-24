package Entidades;


public class Cliente extends Thread{
	private int id = 0;
	Cliente(int id){
		this.id = id;
	}
	
	public void run() {
		
	}
	public long getId() {
		return id;
	}
	
}
