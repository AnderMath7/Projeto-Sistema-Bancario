package Entidades;

import java.util.Random;

public class Cliente extends Thread{
	private int id = 0;
	private Conta conta = new Conta();
	Cliente(){
		
	}
	
	public void run() {
		conta.setSaldo(2000);
	}
	public long getId() {
		return id;
	}

	
	
}
