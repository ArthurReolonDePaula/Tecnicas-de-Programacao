package Pacote1;

public abstract class Pessoa {
	
	Contato contato;

	public Pessoa(Contato contato) {
		super();
		this.contato = contato;
	}

	public Contato getContato() {
		return contato;
	}
	


}
