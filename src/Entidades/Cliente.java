package Entidades;

import java.util.Random;

public class Cliente extends Thread{
	private int numCliente = 0;
	private Conta conta = new Conta();
	private double[] transferencias = new double[4];
	Cliente(double saldoInicial, int numCliente){
		conta.setSaldo(saldoInicial);
		this.numCliente = numCliente;
	}
	
	public void run() {
		Thread.currentThread().setName("cliente-" + numCliente);
		System.out.println(Thread.currentThread().getName() + " Saldo Inicial: " + conta.getSaldo());
		transferencia();
		//System.out.println(Thread.currentThread().getName() + " Saldo: " + conta.getSaldo());
	}
	public long numCliente() {
		return numCliente;
	}

	public void transferencia() {
		for(int i = 0; i < 4; i++) {
			Random valorAleatorio = new Random();
		    double valorCompra = valorAleatorio.nextInt(301) + 200;
		    conta.setSaldo(conta.getSaldo() - valorCompra);
		   //System.out.println(Thread.currentThread().getName()+" transferencia: R$ "+valorCompra);
		    transferencias[i] = valorCompra;
		}
	}
	
	public double[] getTansferencias() {
		return transferencias;
	}
	
	public double getTansferencia(int indice) {
		return transferencias[indice];
	}
	
	public double lerSaldo() {
		return conta.getSaldo();
	}
}
