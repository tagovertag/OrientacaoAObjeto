package Abstracao;

public class PessoaJuridica extends Pessoa{
	private String cnpj;
	private String inscricaoEstadual;
	
	public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String inscricaoEstadual) {
		super(nome, endereco, telefone);
		this.cnpj = cnpj;
		this.inscricaoEstadual  = inscricaoEstadual;
	}

	@Override
	public void exibirDados() {
		System.out.println("=== Dados da Pessoa Jurídica ===");
		System.out.println("Razão Social: " + getNome());
		System.out.println("Endereço: " + getEndereco());
		System.out.println("Telefone: " + getTelefone());
		System.out.println("CNPJ: " + cnpj);
		System.out.println("Inscrição Estadual: " + inscricaoEstadual);
	}

	public String getCnpj() {return cnpj; }
	public void setCnpj(String cnpj) {this.cnpj = cnpj; }
	
	public String getInscricaoEstadual() {return inscricaoEstadual; }
	public void setIscricaoEEstadual(String inscricaoEestadual) {this.inscricaoEstadual = inscricaoEstadual; }
}
