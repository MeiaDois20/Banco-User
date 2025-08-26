package entities;

public class Conta {
	
	private final double TAXA = 5.0;
	
	private int numConta;
	private String titular;
	private double valor;
	
	public Conta() {
	}
	
	public Conta(int numConta, String titular) {
		this.numConta = numConta;
		this.titular = titular;
	}
	
	public Conta(int numConta, String titular, double valor) {
		this.numConta = numConta;
		this.titular = titular;
		deposito(valor);
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getValor() {
		return valor;
	}

	public void deposito(double valor) {
		this.valor += valor;
	}
	
	public void saque(double valor) {
		if (valor <= 50.0) {
            this.valor -= valor;
        } else {
            this.valor -= valor + TAXA;
        }
	}
	
	public String toString() {
		return "Conta: " + String.format("%d%n", numConta)
				+ "Titular: " + String.format("%s%n", titular)
				+ "Saldo: $ " + String.format("%.2f", valor);
	}
	
}
