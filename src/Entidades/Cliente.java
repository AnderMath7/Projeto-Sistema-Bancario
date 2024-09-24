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

	public double transferencia() {
		 Random valorAleatorio = new Random();
	     double valorCompra = valorAleatorio.nextInt(301) + 200;
	     conta.setSaldo(conta.getSaldo() - valorCompra);
	     return valorCompra;
	}
	
}
