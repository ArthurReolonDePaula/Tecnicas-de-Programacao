package Pacote1;

public class Fornecedor extends Pessoa {

	private String razaoSocial;
	private String nomeFantasia;
	private String cnpj;
	private String inscricaoEstadual;
	Endereco endereco;

	public Fornecedor(String razaoSocial, String nomeFantasia, String cnpj, String inscricaooEstadual,Endereco endereco, Contato contato) {
		super(contato);
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaooEstadual;
		this.endereco=endereco;

	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public Endereco getEndereco() {
		return endereco;
	}
}
