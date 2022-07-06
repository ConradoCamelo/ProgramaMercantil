package Mercantil.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Produto {
	
	private String id;
	private String nome; 
	private double valor;
	
	 private List<Produto> listaProdutos = new ArrayList<Produto>();
	
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}
	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Produtos [nome=" + nome + ", valor=" + valor + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(nome, valor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	
	public void listaProduto () {
		for (Produto produto : listaProdutos) {
			
			System.out.println(produto);
			
		}
	}
	
	public void totalVenda() {
		Venda venda = new Venda();
		double total=0;
		for (int i=0; i<listaProdutos.size();i++) {
			
			if(listaProdutos.get(i).getNome().equals(venda.getListaVendas().get(i).getItem())) {
				total = listaProdutos.get(i).getValor()*venda.getValor();
				System.out.println(total);
			}
		}
		
	}
	

}
