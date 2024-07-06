
public class ContaCorrente extends Conta {
	//protected static List<Conta> contasCorrentes = new ArrayList<>();
	public ContaCorrente(Cliente cliente, Banco banco, String telefone) {
		super(cliente, banco, telefone);
		Banco.contasCorrentes.add(this);
		this.tipoConta = "Corrente";
	}

	public ContaCorrente(Cliente cliente, Banco banco) {
		super(cliente, banco);
		Banco.contasCorrentes.add(this);
		this.tipoConta = "Corrente";
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
}
