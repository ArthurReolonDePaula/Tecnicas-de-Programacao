package Pacote1;

public class Contato {
	private String telefone;
	private String email;

	public Contato(String telefone, String email) {
		this.telefone = telefone;
		this.email = email;
		deveValidarSeEmailContemArroba();
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	private void deveValidarSeEmailContemArroba() {
		if (!email.contains("@")) {
			throw new RuntimeException("E-mail precisa conter o @ para ser válido");
		} 
	}
}
