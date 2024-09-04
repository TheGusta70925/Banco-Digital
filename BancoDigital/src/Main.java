public class Main {

	public static void main(String[] args) {
        Banco banco = new Banco();
		Cliente venilton = new Cliente("Venilton", "21/02/1997", "Masculino");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
        banco.adcionarConta(new ContaCorrente(venilton));
        banco.adcionarConta(new ContaPoupanca(venilton));

        System.out.println(venilton.toString());
        System.out.println("");

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
        
	}

}
