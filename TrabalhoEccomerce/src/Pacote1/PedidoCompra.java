package Pacote1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class PedidoCompra {

	private Calendar dataCompra;

	private Cliente cliente;

	private Fornecedor fornecedor;

	private Endereco enderecoEntrega;

	private FormaPagamento formapagamento;

	private double valorFrete;
	private double valorItens;
	private double valorTotal;
	
	private Produto produto;
	private List<Produto> produtos;

	public PedidoCompra(Cliente cliente, Fornecedor fornecedor, Endereco enderecoEntrega,
			FormaPagamento formaPagamento) {
		this.cliente = cliente;
		this.fornecedor = fornecedor;
		this.enderecoEntrega = enderecoEntrega;
		this.formapagamento = formaPagamento;
		this.produtos = new ArrayList<>();
		deveAdicionarItensAlista(produto);
	}

	public Calendar getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Calendar dataCompra) {
		this.dataCompra = dataCompra;
	}

	public double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}

	public double getValorItens() {
		return valorItens;
	}

	public void setValorItens(double valorItens) {
		this.valorItens = valorItens;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public FormaPagamento getFormapagamento() {
		return formapagamento;
	}

	public List<Produto> getProduto() {
		return produtos;
	}
	
	private void deveAdicionarItensAlista(Produto produto){
		this.produtos.add(produto);
	}
	
}
