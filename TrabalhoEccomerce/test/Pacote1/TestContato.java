package Pacote1;

import org.junit.Assert;
import org.junit.Test;

public class TestContato {

	@Test
	public void deveInstanciarContato() {
		Contato contato = new Contato("85002795", "arthurreolon@gmail.com");
		Assert.assertEquals("85002795", contato.getTelefone());
		Assert.assertEquals("arthurreolon@gmail.com", contato.getEmail());
	}
	@Test (expected = RuntimeException.class)
	public void deveDarErroSeOemailNaoTiverArroba(){
		new Contato("85002795", "arthurreolongmail.com");
	}
}
