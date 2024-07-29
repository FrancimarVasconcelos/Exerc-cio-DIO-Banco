package entidades;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	public void imprimirExtrato() {
		System.out.println("--- Banco Francis ---");
		System.out.println("--- Conta Corrente Extrato ---");
		super.infosComuns();
	}

}
