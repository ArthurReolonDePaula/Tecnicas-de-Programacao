package Pacote1;

public class Endereco {

	private String rua;
	private String numero;
	private String bairro;
	private String complemento;
	private String cep;
	private String tipo;
	private Cidade cidade;

	public Endereco(String rua, String bairro, String cep, String tipo, Cidade cidade){
		this.rua = rua;
		this.bairro = bairro;
		this.cep = cep;
		this.tipo = tipo;
		this.cidade = cidade;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getRua() {
		return rua;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCep() {
		return cep;
	}

	public String getTipo() {
		return tipo;
	}

	public Cidade getCidade() {
		return cidade;
	}

	
}
