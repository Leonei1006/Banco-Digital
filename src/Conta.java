
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	
	private static  int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	
	public Conta(Cliente cliente) {		
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++; 
		this.cliente = cliente; 
	}
	
	
	@Override
	public void sacar(double valor) {
		saldo -= valor; 
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta ContaDestino) {
		this.sacar(valor);
		ContaDestino.depositar(valor);
	}
	
	
	public int getAg�ncia() {
		return agencia;
	}


	public int getConta() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo; 
	}
	

	protected void extrato() {
		
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Ag�ncia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	


}