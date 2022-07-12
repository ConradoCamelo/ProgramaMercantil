package Mercantil.Executavel;

import java.util.ArrayList;
import java.util.List;

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

				List<Venda> vendas = new ArrayList<Venda>();

				int escolha = JOptionPane.showConfirmDialog(null, "Deseja adicionar algum produto?");
				if (escolha == 0) {
					do {

						Venda venda = new Venda();

						String nomeCliente = JOptionPane.showInputDialog("Qual o nome do Cliente ");
						String enderecoEntrega = JOptionPane.showInputDialog("Endereco de Entrega");

						venda.setNomeCliente(nomeCliente);
						venda.setEnderecoEntrega(enderecoEntrega);

						escolha = JOptionPane.showConfirmDialog(null, "Deseja adicionar algum produto?");
						if (escolha == 0) {
							do {

								// Instanciando um Objeto para Lista de Produtos
								Produto produto = new Produto();

								String id = JOptionPane.showInputDialog("Id do Produto");
								String nome = JOptionPane.showInputDialog("Nome do Produto");
								String valor = JOptionPane.showInputDialog("Valor do Produto");

								produto.setId(id);
								produto.setNome(nome);
								produto.setValor(Double.valueOf(valor));

								venda.getProdutos().add(produto);

								escolha = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais um produto?");

							} while (escolha == 0);
						}
						vendas.add(venda);
						escolha = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais uma Venda?");
					} while (escolha == 0);
				}

				// Modulo de Impressão
				System.out.println("Dados da Venda ");
				for (Venda venda : vendas) {

					System.out.println(venda.toString());
					System.out.println("---------------------------------------");
				}

			} else {
				JOptionPane.showMessageDialog(null, "Autenticação incorreta!");
			}

		} catch (NumberFormatException e) {
			// Instanciando para aparecer no Console (Janela Usuário)
			StringBuilder saida = new StringBuilder();

			// Imprimi Erro no Console Java
			e.printStackTrace();

			// Mensagem do Erro ou Caus
			System.out.println("Mensagem " + e.getMessage());

			// Mensagens que vão aparecer no Console
			for (int i = 0; i < e.getStackTrace().length; i++) {
				saida.append("Classe de Erro: " + e.getStackTrace()[i].getClassName());
				saida.append("Método de Erro: " + e.getStackTrace()[i].getMethodName());
				saida.append("Linha de Erro: " + e.getStackTrace()[i].getLineNumber());
			}

			JOptionPane.showMessageDialog(null, "Erro de Conversão de número: " + saida.toString());

		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Opa um null Pointer Exception: " + e.getClass());

			// Apresenta Qualquer Tipo de Erro (Extrema Importância)
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro Inesperado" + e.getClass().getName());
		} // Finally Sempre é Executado ocorrendo erros ou não
		finally {
			JOptionPane.showMessageDialog(null, "Venda Finalizada");
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