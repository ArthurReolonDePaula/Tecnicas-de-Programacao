package Pacote1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Cliente extends Pessoa {
	private String nome;
	private String cpf;
	private Calendar dataNascimento;
	private String rg;
	private List<Endereco> enderecos;
	
	public Cliente(String nome, String cpf, Contato contato, Calendar dataNascimento, Endereco endereco) {
		super(contato);
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.enderecos = new ArrayList<>();
		deveAdicionarEnderecosLista(endereco);
		deveVerificarSeNomePossuiMaisDe10Letras();
		deveVerificarSeDataNascimentoNaoEMaiorQueDataAtual();
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	private void deveAdicionarEnderecosLista(Endereco endereco) {
		this.enderecos.add(endereco);
	}
	private void deveVerificarSeNomePossuiMaisDe10Letras(){
		if (nome.length() <= 10){
			throw new RuntimeException("O nome precisa possuir mais que 10 caracteres.");
		}
	}
	private void deveVerificarSeDataNascimentoNaoEMaiorQueDataAtual(){
		if(dataNascimento.after(Calendar.getInstance())){
			throw new RuntimeException("Erro! Você nasceu no futuro? Porque a data de nascimento não pode ser maior que a data atual.");
		}
	}
}
