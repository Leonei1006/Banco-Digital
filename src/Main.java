
public class Main {

	public static void main(String[] args) {
		Cliente leonei = new Cliente();
		leonei.setNome("Leonei");
		
		Conta cc = new ContaCorrente(leonei);
		cc.depositar(500000);
		cc.sacar(160);
		
		Conta cp = new ContaPoupanca(leonei);
		cc.transferir(150, cp);
		cp.sacar(80);
		
		
		System.out.println("<==== Extrato Conta Corrente ====>");
		cc.extrato();
		
		System.out.println("<==== Extrato Conta Poupança ====>");
		cp.extrato();
	}

}
