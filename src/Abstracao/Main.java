package Abstracao;

public class Main {
	public static void main(String[] args) {
		Pessoa pf = new PessoaFisica(
				"Maria Oliveira",
				"Rua das Flores, 123",
				"(11) 98888-7777",
				"123.456.789-00",
				"12.345.678-9");
		
		Pessoa pj = new PessoaJuridica(
				"Tech Soluções LTDA",
				"Av. Paulista, 1000",
				"(11) 3333-2222",
				"12.245.678/0001-99",
				"987.654.321.112");
	
	pf.exibirDados();
	System.out.println();
	pj.exibirDados();
}
}
