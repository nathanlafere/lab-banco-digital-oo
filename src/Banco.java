import java.util.ArrayList;
import java.util.List;
public class Banco {
	private String nome;
	protected List<Conta> contas = new ArrayList<Conta>();
	protected static List<Conta> contasPoupancas = new ArrayList<>();
	protected static List<Conta> contasCorrentes = new ArrayList<>();
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void listarClientes() {
		System.out.println("=== Listando contas ativas no banco "+this.nome+" ===");
		for (Conta conta : contas) {
			System.out.println("-=-=-=-=-=-=-=-=-");
			System.out.println("Conta número "+String.format("%04d", conta.numero));
			System.out.println("Nome: "+conta.cliente.getNome());
			System.out.println("Contato: "+conta.telefone);
			System.out.println("Cpf: "+conta.cliente.getCpf());
		}
	}

	public void listarContas() {
		System.out.println("=== Listando contas ativas no banco "+this.nome+" ===");
		for (Conta conta : contas) {
			System.out.println("-=-=-=-=-=-=-=-=-");
			System.out.println("Conta número "+String.format("%04d", conta.numero));
			System.out.println("Agência: "+conta.getAgencia());
			System.out.println("Nome: "+conta.cliente.getNome());
			System.out.println("Contato: "+conta.telefone);
			System.out.println("Cpf: "+conta.cliente.getCpf());
		}
	}

	public void listarContas(Cliente cliente) {
		System.out.println("=== Listando contas ativas de "+cliente.getNome()+" no banco "+this.nome+" ===");
		for (Conta conta : contas) {
			if (conta.cliente.getNome() == cliente.getNome()) {
				System.out.println("-=-=-=-=-=-=-=-=-");
				System.out.println("Conta número "+String.format("%04d", conta.numero));
				System.out.println("Agência: "+conta.getAgencia());
				System.out.println("Contato: "+conta.telefone);
			}
		}
	}

	public void listarContas(int agencia) {
		System.out.println("=== Listando contas ativas da agência de número "+agencia+" no banco "+this.nome+" ===");
		for (Conta conta : contas) {
			if (conta.agencia == agencia) {
				System.out.println("-=-=-=-=-=-=-=-=-");
				System.out.println("Conta número "+String.format("%04d", conta.numero));
				System.out.println("Agência: "+conta.getAgencia());
				System.out.println("Nome: "+conta.cliente.getNome());
				System.out.println("Contato: "+conta.telefone);
				System.out.println("Cpf: "+conta.cliente.getCpf());
			}
		}
	}

	public void listarContasCorrente() {
		System.out.println("=== Listando todas contas correntes ativas no banco "+this.nome+" ===");
		for (Conta conta : contas) {
			if (conta.tipoConta == "Corrente") {
				System.out.println("-=-=-=-=-=-=-=-=-");
				System.out.println("Conta número "+String.format("%04d", conta.numero));
				System.out.println("Agência: "+conta.getAgencia());
				System.out.println("Nome: "+conta.cliente.getNome());
				System.out.println("Contato: "+conta.telefone);
				System.out.println("Cpf: "+conta.cliente.getCpf());
			}
		}
	}

	public void listarContasPoupanca() {
		System.out.println("=== Listando todas contas poupanças ativas no banco "+this.nome+" ===");
		for (Conta conta : contas) {
			if (conta.tipoConta == "Poupança") {
				System.out.println("-=-=-=-=-=-=-=-=-");
				System.out.println("Conta número "+String.format("%04d", conta.numero));
				System.out.println("Agência: "+conta.getAgencia());
				System.out.println("Nome: "+conta.cliente.getNome());
				System.out.println("Contato: "+conta.telefone);
				System.out.println("Cpf: "+conta.cliente.getCpf());
			}
		}
	}

	public void aplicarRendimentoPoupanca() {
		System.out.println("Aplicando rendimento as contas poupança!");
		for (Conta conta : contasPoupancas) {
			conta.depositar(conta.saldo*0.2/100);
		}
	}
}
