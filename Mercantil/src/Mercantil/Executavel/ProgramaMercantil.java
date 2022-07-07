package Mercantil.Executavel;

import javax.swing.JOptionPane;

import Mercantil.classes.Gerente;
import Mercantil.classes.Produto;
import Mercantil.classes.Venda;

public class ProgramaMercantil {

	public static void main(String[] args) {
		try {
		
		String login = JOptionPane.showInputDialog("Informe o Login");
		String senha = JOptionPane.showInputDialog("Informe a Senha");

		Gerente gerente = new Gerente();
		gerente.setLogin(login);
		gerente.setSenha(senha);

		if (gerente.autenticar()) {

			JOptionPane.showMessageDialog(null, "Seja Bem-Vindo ao Programa Mercantil");

			Venda venda = new Venda();

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja adicionar algum produto?");
			if (escolha == 0) {
				do {
					// Instanciando um Objeto para Lista de Produtos
					Produto produto = new Produto();

					String id = JOptionPane.showInputDialog("Adicione um Id do Produto");
					String nome = JOptionPane.showInputDialog("Adicione o nome do Produto");
					String valor = JOptionPane.showInputDialog("Qual o valor do Produto");

					produto.setId(id);
					produto.setNome(nome);
					produto.setValor(Double.valueOf(valor));

					venda.getProduto().getListaProdutos().add(produto);

					escolha = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais um produto");
				} while (escolha == 0);

			}

			do {
				// Instanciando um Objeto para Lista de Produtos
				Venda venda1 = new Venda();

				String nomeCliente = JOptionPane.showInputDialog("Qual o nome do Cliente ");
				String descricaoVenda = JOptionPane.showInputDialog("Descriação da Venda");
				String enderecoEntrega = JOptionPane.showInputDialog("Endereco de Entrega");
				JOptionPane.showMessageDialog(null, venda.getProduto().getListaProdutos());
				String produtoVenda = JOptionPane.showInputDialog("Digite o Produto");
				String quant = JOptionPane.showInputDialog("Quantidade");

				venda1.setNomeCliente(nomeCliente);
				venda1.setDescricaoVenda(descricaoVenda);
				venda1.setEnderecoEntrega(enderecoEntrega);
				venda1.setQuant(Integer.valueOf(quant));
				venda1.setItem(produtoVenda);
				venda.getListaVendas().add(venda1);

				escolha = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais uma venda");
			} while (escolha == 0);

			// Modulo de Impressão
			System.out.println("Lista com todos os Produtos incluidos");
			venda.getProduto().listaProduto();
			System.out.println("Dados da Venda ");
			venda.ListadeVendas();
			venda.getProduto().totalVenda();

		} else {
			JOptionPane.showMessageDialog(null, "Autenticação incorreta!");
		}
		
		
		}catch (Exception e) {
			//Instanciando para aparecer no Console (Janela Usuário)
			StringBuilder saida = new StringBuilder();
			
			//Imprimi Erro no Console Java 
			e.printStackTrace();
			
			//Mensagem do Erro ou Caus
			System.out.println("Mensagem " + e.getMessage());
			
			//Mensagens que vão aparecer no Console
			for (int i = 0; i<e.getStackTrace().length; i++) {
				saida.append("Classe de Erro: " + e.getStackTrace()[i].getClassName());
				saida.append("Método de Erro: " + e.getStackTrace()[i].getMethodName());
				saida.append("Linha de Erro: " + e.getStackTrace()[i].getLineNumber());
			}
			
		}
		
		}// <--- fim main
	}

/*
 * List <Produto> produtos = new ArrayList<Produto>();
 * 
 * //Instanciando Produtos
 * 
 * for (int i=0; i<=1; i++) {
 * 
 * Produto produto1 = new Produto();
 * 
 * String nomeProduto = JOptionPane.showInputDialog("Qual o nome do Produto?");
 * String precoProduto = JOptionPane.showInputDialog("Qual o preço do Produto");
 * 
 * produto1.setNome(nomeProduto);
 * produto1.setValor(Double.valueOf(precoProduto));
 * 
 * produtos.add(produto1);
 * 
 * }
 * 
 * for (Produto produto : produtos) {
 * 
 * System.out.println(produto);
 * 
 * }
 * 
 * }
 */