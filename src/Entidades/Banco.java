package Entidades;

public class Banco {
	public static void main(String[] args) {
		Loja sansung = new Loja("Sansung");
		Loja americanas = new Loja("Americanas");
		Funcionario matheus = new Funcionario("Matheus");
		sansung.adicionaFuncionarios(matheus);
		Funcionario raissa = new Funcionario("Raissa");
		sansung.adicionaFuncionarios(raissa);
		Funcionario arthur = new Funcionario("Arthur");
		americanas.adicionaFuncionarios(arthur);
		Funcionario caio = new Funcionario("Caio");
		americanas.adicionaFuncionarios(caio);
		int numClientes = 10;
		double saldoInicialClientes = 2000;
		Cliente[] clientes = new Cliente[numClientes];
		
		for(int i = 0; i < numClientes; i++) {
			clientes[i] = new Cliente(saldoInicialClientes, i+1);
			clientes[i].start();
		}
		
		
		
		try{
			for(Cliente Thread : clientes) {
				Thread.join();
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.print("\n");
		for(int i = 0; i < numClientes; i++) {
			System.out.println(clientes[i].getName() + ":");
			System.out.println("Saldo inicial: R$ " + saldoInicialClientes);
			for(int j = 0; j < clientes[i].getTansferencias().length; j++) {
				if(j < clientes[i].getTansferencias().length/2) {
					sansung.receberTransferencia(clientes[i].getTansferencia(j));
					
					System.out.println("Transferiu R$ " + clientes[i].getTansferencia(j) + " para " + sansung.getNome());
				}else {
					americanas.receberTransferencia(clientes[i].getTansferencia(j));
					sansung.receberTransferencia(clientes[i].getTansferencia(j));
					System.out.println("Transferiu R$ " + clientes[i].getTansferencia(j) + " para " + americanas.getNome());
				}
			}
			System.out.println("Saldo final: R$ " + clientes[i].lerSaldo() + "\n");
		}
	}
	
}
