package Pacote1;

public class Produto {

	private String nome;
	private String descricao;
	private Double valor;

	public Produto(String nome, Double valor) {
		this.nome = nome;
		this.valor = valor;
		deveValidarSeValorMaiorQueZero();
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	private void deveValidarSeValorMaiorQueZero() {
		if ((valor <= 0)) {
			throw new RuntimeException("Valor deve ser maior que zero");
		}
	}
}
