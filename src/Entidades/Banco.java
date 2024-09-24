package Entidades;

public class Banco {
	public static void main(String[] args) {
		Loja sansung = new Loja("Sansung");
		Loja americanas = new Loja("Americanas");
		Funcionario matheus = new Funcionario();
		sansung.adicionaFuncionarios(matheus);
		Funcionario raissa = new Funcionario();
		sansung.adicionaFuncionarios(raissa);
		Funcionario arthur = new Funcionario();
		americanas.adicionaFuncionarios(arthur);
		Funcionario caio = new Funcionario();
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
		double tiraSaldo = 0;
		for(int i = 0; i < numClientes; i++) {
			for(int j = 0; j < clientes[i].getTansferencias().length; j++) {
				tiraSaldo = tiraSaldo + clientes[i].getTansferencia(j);
				if(j < clientes[i].getTansferencias().length/2) {
					sansung.receberTransferencia(clientes[i].getTansferencia(j));
					System.out.println(clientes[i].getName() + " transferiu R$ " + clientes[i].getTansferencia(j) + " para " +
					sansung.getNome());
					System.out.println(clientes[i].getName() + " novo saldo: R$ " + (saldoInicialClientes - tiraSaldo));
					System.out.println(sansung.getNome() + " novo saldo: R$ " + sansung.lerSaldo() + "\n");
				}else {
					americanas.receberTransferencia(clientes[i].getTansferencia(j));
					System.out.println(clientes[i].getName() + " transferiu R$ " + clientes[i].getTansferencia(j) + " para " +
							americanas.getNome());
					System.out.println(clientes[i].getName() + " novo saldo: R$ " + (saldoInicialClientes - tiraSaldo));
					System.out.println(americanas.getNome() + " novo saldo: R$ " + americanas.lerSaldo() + "\n");
				}
			}
			tiraSaldo = 0;
		}
		System.out.println(sansung.lerSaldo());
		System.out.println(americanas.lerSaldo());
		System.out.println(sansung.lerSaldo()+americanas.lerSaldo());
	}
	
}
