package Entidades;

public class Conta {
	private double saldo = 0;
	private String numConta = "";
	
	/* ORGANIZAÇÃO DOS NÚMEROS DE CONTA
	primeira parte de numero da conta:
	 *ID da entidade ex "01 - primeira loja cadastrada" "02 - segunda loja cadastrada"
	 Terceira parte:
	 	*Número da conta caso a loja um tenha mais de conta a terceira parte da segunda conta será 02...
	 */
	Conta(String numConta){
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNumConta() {
		return numConta;
	}
	
}
