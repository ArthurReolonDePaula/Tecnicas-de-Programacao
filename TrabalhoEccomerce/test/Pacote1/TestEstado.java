package Pacote1;

import org.junit.Assert;
import org.junit.Test;

public class TestEstado {

	@Test
	public void deveInstanciarEstado() {
		Estado estado = new Estado("Rio Grande do Sul", "RS");
		Assert.assertEquals("Rio Grande do Sul", estado.getNome());
		Assert.assertEquals("RS", estado.getSigla());
	}
}
