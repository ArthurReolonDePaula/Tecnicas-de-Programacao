package Pacote1;

import org.junit.Assert;
import org.junit.Test;

public class TestEndereco {

	@Test
	public void deveInstanciarEndereco() {
		Estado estado = new Estado("Rio Grande do Sul", "RS");
		Cidade cidade = new Cidade("Porto Alegre",estado);
		Endereco endereco = new Endereco("Rua dos Alfineiros", "São josé", "91540000", "Residencial", cidade);
		Assert.assertEquals("Rua dos Alfineiros",endereco.getRua());
		Assert.assertEquals("São josé",endereco.getBairro());
		Assert.assertEquals("91540000", endereco.getCep());
		Assert.assertEquals("Residencial", endereco.getTipo());
		Assert.assertEquals(cidade, endereco.getCidade());
		
	}
}