package entidades;

public class ContaPolpanca extends Conta {

	public ContaPolpanca(Cliente cliente) {
		super(cliente);
	}
	public void imprimirExtrato() {
		System.out.println("--- Banco Francis ---");
		System.out.println("--- Conta Poupança Extrato ---");
		super.infosComuns();
	}

}
