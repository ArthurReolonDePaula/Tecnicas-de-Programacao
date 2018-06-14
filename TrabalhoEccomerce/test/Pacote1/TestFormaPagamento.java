package Pacote1;

import org.junit.Assert;
import org.junit.Test;

public class TestFormaPagamento {

	@Test
	public void deveInstanciarFormaPagamento(){
		FormaPagamento formaPagamento = new FormaPagamento();
		formaPagamento.setDescricao("Débito");
		
		Assert.assertEquals("Débito", formaPagamento.getDescricao());
	}
}
