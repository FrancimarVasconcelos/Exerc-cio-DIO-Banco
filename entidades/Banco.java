package entidades;

import java.util.List;

public class Banco {
	
	private List<Conta> contas;

	public Banco(List<Conta> contas) {
		this.contas = contas;
	}

	public List<Conta> getContas() {
		return contas;
	}
	

}
