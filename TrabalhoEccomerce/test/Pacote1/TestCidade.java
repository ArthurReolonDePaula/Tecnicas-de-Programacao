package Pacote1;

import org.junit.Assert;
import org.junit.Test;

public class TestCidade {

	@Test
	public void deveInstanciarCidade(){
		Estado estado = new Estado("Rio Grande do Sul", "RS");
		Cidade cidade = new Cidade("Porto Alegre", estado);
		
		Assert.assertEquals("Porto Alegre", cidade.getNome());
		Assert.assertEquals(estado, cidade.getEstado());
	}
}
