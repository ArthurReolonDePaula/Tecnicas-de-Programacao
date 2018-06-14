package Pacote1;

import org.junit.Assert;
import org.junit.Test;

public class TestProduto {

	@Test
	public void deveInstanciarProduto() {
		Produto produto = new Produto("Placa de video", 850.00);
		produto.setDescricao("Otima");
		
		Assert.assertEquals("Placa de video", produto.getNome());
		Assert.assertEquals(new Double(850.00), produto.getValor());
		Assert.assertEquals("Otima",produto.getDescricao());
	}
	@Test (expected = RuntimeException.class)
	public void deveDarErroDizendoQueValorEMenorOuIgualAzero(){
		new Produto("Placa de Video", 00.00);
	}
}
