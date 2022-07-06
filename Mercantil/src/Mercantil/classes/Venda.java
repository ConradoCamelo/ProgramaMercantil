package Mercantil.classes;

import java.util.ArrayList;
import java.util.List;

public class Venda {

	private String nomeCliente;
	private String descricaoVenda;
	private String enderecoEntrega;
	private double valor;
	private int quant;
	private String item;
	double total;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	private Produto produto = new Produto();
	private List<Venda> listaVendas = new ArrayList<Venda>();

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Venda> getListaVendas() {
		return listaVendas;
	}

	public void setListaVendas(List<Venda> listaVendas) {
		this.listaVendas = listaVendas;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getDescricaoVenda() {
		return descricaoVenda;
	}

	public void setDescricaoVenda(String descricaoVenda) {
		this.descricaoVenda = descricaoVenda;
	}

	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	

	@Override
	public String toString() {
		return "Venda [nomeCliente=" + nomeCliente + ", descricaoVenda=" + descricaoVenda + ", enderecoEntrega="
				+ enderecoEntrega + ", valor=" + valor + ", quant=" + quant + ", item=" + item + "]";
	}

	public void ListadeVendas() {
		for (Venda venda : listaVendas) {

			System.out.println(venda.toString());

		}

	}
	
	

}
