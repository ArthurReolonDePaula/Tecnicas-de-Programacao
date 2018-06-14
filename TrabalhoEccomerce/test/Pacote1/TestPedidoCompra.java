package Pacote1;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;

public class TestPedidoCompra {

	@Test
	public void deveInstanciarPedidoCompra() {
		Estado estado = new Estado("Rio Grande do Sul", "RS");
		Cidade cidade = new Cidade("Porto Alegre", estado);
		Contato contato = new Contato("85002795","arthurreolon@gmail.com");
		
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.add(Calendar.YEAR, -10);
		
		Endereco enderecoCliente = new Endereco("Rua dos Alfineiros", "São josé", "91540000","Residencial", cidade);
		Cliente cliente =  new Cliente("Yuri Rodrigues", "030.135.765-29", contato, dataNascimento, enderecoCliente);
		
		Endereco enderecoFornecedor = new Endereco("Rua X", "Bairro Y", "92569000","Comercial", cidade);
		Fornecedor fornecedor = new Fornecedor("Distribuidora","Distribuidora Tolla.Ltda","03.015.449/0001-24","inscricaoEstadual", enderecoFornecedor, contato);
		
		FormaPagamento formaPagamento = new FormaPagamento();
		
		Endereco enderecoEntrega = new Endereco("Rua M", "Bairro Z", "91560000","Entrega", cidade);
		
		PedidoCompra pedidoCompra = new PedidoCompra(cliente, fornecedor, enderecoEntrega, formaPagamento);
		pedidoCompra.setValorItens(850.00);
		pedidoCompra.setValorFrete(5.00);
		pedidoCompra.setValorTotal(855.00);
		
		Assert.assertEquals(cliente, pedidoCompra.getCliente());
		Assert.assertEquals(fornecedor, pedidoCompra.getFornecedor());
		Assert.assertEquals(enderecoEntrega, pedidoCompra.getEnderecoEntrega());
		Assert.assertEquals(formaPagamento, pedidoCompra.getFormapagamento());
	}
}
