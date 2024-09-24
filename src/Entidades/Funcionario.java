package Entidades;

public class Funcionario extends Thread{
	String nome = "";
	private Conta contaSalario = new Conta();
	private Conta contaInvestimento = new Conta();
	Funcionario(String nome){
		this.nome = nome;
	}
	
	public void run(){
		
	}
	
	public void receberTransferencia(double valor) {
		contaSalario.setSaldo(contaSalario.getSaldo() + valor);
	}
	public double lerSaldoContaSalario() {
		return contaSalario.getSaldo();
	}
	public double lerInvestimentoo() {
		return contaInvestimento.getSaldo();
	}
}
