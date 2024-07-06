
public class ContaPoupanca extends Conta {
	//protected static List<Conta> contasPoupancas = new ArrayList<>();
	public ContaPoupanca(Cliente cliente, Banco banco, String telefone) {
		super(cliente,banco,telefone);
		Banco.contasPoupancas.add(this);
		this.tipoConta = "Poupança";
	}
	
	public ContaPoupanca(Cliente cliente, Banco banco) {
		super(cliente,banco);
		Banco.contasPoupancas.add(this);
		this.tipoConta = "Poupança";
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}
