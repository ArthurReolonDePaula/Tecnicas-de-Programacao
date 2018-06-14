package Pacote1;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;

public class TestCliente {
	
	@Test
	public void deveCriarCliente() {
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.add(Calendar.YEAR, -10);
		
		Estado estado = new Estado("Rio Grande do Sul", "RS");
		Cidade cidade = new Cidade("Porto Alegre", estado);
		Endereco endereco = new Endereco("Rua dos Alfineiros", "São josé", "91540000", "Residencial", cidade);
		Contato contato = new Contato("85002795", "arthurreolon@gmail.com");
		Cliente cliente = new Cliente("Yuri Rodrigues", "030.135.765-29", contato, dataNascimento, endereco);
		cliente.setRg("rg");
		Assert.assertEquals("Yuri Rodrigues", cliente.getNome());
		Assert.assertEquals("030.135.765-29", cliente.getCpf());
		Assert.assertEquals(contato, cliente.getContato());
		Assert.assertEquals(dataNascimento, cliente.getDataNascimento());
		Assert.assertEquals("rg", cliente.getRg());

	}
	@Test (expected = RuntimeException.class)
	public void deveDarErroDizendoQueNomeNaoTemMaisDe10Caracteres(){
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.add(Calendar.YEAR, -10);
		
		Estado estado = new Estado("Rio Grande do Sul", "RS");
		Cidade cidade = new Cidade("Porto Alegre", estado);
		Endereco endereco = new Endereco("Rua dos Alfineiros", "São josé", "91540000", "Residencial", cidade);
		Contato contato = new Contato("85002795", "arthurreolon@gmail.com");
		
		new Cliente ("Yuri", "030.135.765-29", contato, dataNascimento, endereco);
	}
	@Test (expected = RuntimeException.class)
	public void deveDarErroSeDataNascimentoForMaiorQueDataAtual(){
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.add(Calendar.YEAR, 10);
		
		Estado estado = new Estado("Rio Grande do Sul", "RS");
		Cidade cidade = new Cidade("Porto Alegre", estado);
		Endereco endereco = new Endereco("Rua dos Alfineiros", "São josé", "91540000", "Residencial", cidade);
		Contato contato = new Contato("85002795", "arthurreolon@gmail.com");
		new Cliente ("Yuri Rodrigues","030.135.765-29", contato, dataNascimento, endereco);
	}
}
