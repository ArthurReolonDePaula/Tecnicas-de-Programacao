package Pacote1;

import org.junit.Assert;
import org.junit.Test;

public class TestFornecedor {
	
	@Test
	public void deveInstanciarFornecedor() {
		Estado estado = new Estado("Rio Grande do Sul", "RS");
		Cidade cidade = new Cidade("Porto Alegre",estado);
		Endereco endereco = new Endereco("Rua dos Alfineiros", "São josé", "91540000", "Residencial", cidade);
		Contato contato = new Contato("85002795", "arthurreolon@gmail.com");
		Fornecedor fornecedor = new Fornecedor("Distribuidora","Distribuidora Tolla.Ltda","03.015.449/0001-24","inscricaoEstadual", endereco, contato);
		
		Assert.assertEquals("Distribuidora", fornecedor.getRazaoSocial());
		Assert.assertEquals("Distribuidora Tolla.Ltda", fornecedor.getNomeFantasia());
		Assert.assertEquals("03.015.449/0001-24", fornecedor.getCnpj());
		Assert.assertEquals("inscricaoEstadual", fornecedor.getInscricaoEstadual());
		Assert.assertEquals(endereco, fornecedor.getEndereco());
	}
}
 