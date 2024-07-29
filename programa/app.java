package programa;
import entidades.Cliente;
import entidades.Conta;
import entidades.ContaCorrente;
import entidades.ContaPolpanca;

public class app {

	public static void main(String[] args) {
		
		Cliente francimar = new Cliente();
		francimar.setNome("Francimar");
		francimar.setSobrenome("Vasconcelos");
		francimar.setCpf(1234567891);
		francimar.setDataNascimento("20/09/1992");
		francimar.setEndereco("Rua: Qualquer Um");
		
		Conta corrente = new ContaCorrente(francimar);
		Conta poupanca = new ContaPolpanca(francimar);
		
		corrente.depositar(100);
		corrente.transferir(100, poupanca);
		
		corrente.imprimirExtrato();
		System.out.println("________________________________");
		System.out.println();
		poupanca.imprimirExtrato()
;		
		
	}

}
