
public class Main {

	public static void main(String[] args) {
		Banco santander = new Banco();
		santander.setNome("Santander");
		Cliente venilton = new Cliente("32321321");
		Cliente thaynara = new Cliente("15751325");
		thaynara.setNome("Thaynara");
		venilton.setNome("Venilton");
		
		Conta ccThaynara = new ContaCorrente(thaynara, santander);
		Conta cc = new ContaCorrente(venilton, santander);
		Conta poupancaVenilton = new ContaPoupanca(venilton, santander, "+55 22 99754-1243");
		poupancaVenilton.depositar(15000);

		
		System.out.println(poupancaVenilton.getSaldo());
		santander.aplicarRendimentoPoupanca();
		System.out.println(poupancaVenilton.getSaldo());

		//cc.imprimirExtrato();
		//poupanca.imprimirExtrato();
		//cc.imprimirInfosComuns();

		//poupanca.listarContasTipo();
		//cc.listarContasTipo();
		//santander.listarContas(thaynara);first changes
		santander.listarContasCorrente();
		santander.listarContasPoupanca();
	}
}
