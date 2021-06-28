package br.com.senai.loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.senai.pessoa.Pessoa;
import br.com.senai.pessoa.PessoaController;
import br.com.senai.produto.Produto;
import br.com.senai.produto.ProdutoController;

public class VendaController {

	private Scanner tec;
	private ProdutoController produtoController;
	private PessoaController pessoaController;
	
	List<Venda> vendas = new ArrayList<>();
	
	public VendaController() {
		tec=new Scanner(System.in);
		produtoController = new ProdutoController();
		pessoaController = new PessoaController();
	}
	
	public int leOpcao() {
		System.out.print("> ");
		return tec.nextInt();
	}
	public void menu(List<Produto>produtos, List<Pessoa> pessoas) {
		System.out.print("\n");
		System.out.println("|-------------- MENU ---------------|");
		System.out.println("|1 -> Cadastrar Venda               |");
		System.out.println("|2 -> Lista vendas                  |");
		System.out.println("|---------------------------------- |");
		System.out.print("\n");
		System.out.print("Informe a Opção desejada: ");
		int opcao = tec.nextInt();
		switch(opcao) {
		
		case 1:
			vendas.add(cadastrarVenda(produtos, pessoas));
			break;
		case 2:
			listarVenda(vendas);
			break;
		default:
			break;
		}
		
		
		
	}
	public  List<Venda> listarVenda(List<Venda> vendas) {
		
		System.out.println("--- VENDAS REALIZADAS ---");
		
		System.out.printf("| %10s | %10s | %4s | %6s | \n",
				"Cliente", "Produto", "Qtd" , "Valor"
				);
		
		for(int i = 0; i < vendas.size(); i++){
			System.out.printf("| %10s | %10s | %4d | %6.2f | \n",
					vendas.get(i).getPessoa().getNome(),
					vendas.get(i).getProduto().getNomeDoProduto(),
					vendas.get(i).getQuantidade(),
					vendas.get(i).getValor()
					);
		}
		
		return vendas;
	}
	public Venda cadastrarVenda(List<Produto> produtos, List<Pessoa> pessoas) {
		
		if(produtos.isEmpty()|| pessoas.isEmpty()) {
			System.out.println("Impossivel realizar vendas sem Produtos ou pessoas Cadastradas.");
			return null;
		}
		
		produtoController.listarProdutos(produtos);
		pessoaController.listarPessoas(pessoas);
		
		Venda venda = new Venda();
		Produto produto = new Produto();
		Pessoa pessoa = new Pessoa();
		
		System.out.print("Informe o Id da pessoa:");
		int idPessoa = tec.nextInt();
		
		pessoa.setNome(pessoas.get(idPessoa).getNome());
		pessoa.setAltura(pessoas.get(idPessoa).getAltura());
		pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
		
		
		venda.setPessoa(pessoa);
		
		System.out.print("Informe o ID do produto: ");
		int idProduto = tec.nextInt()-1;
		
		produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
		produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
		produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());
		produto.setValorTotalDoProduto(produtos.get(idProduto).getValorTotalDoProduto());
		
		venda.setProduto(produto);
		
		System.out.println("Informe a quantidade desejada: ");
		venda.setQuantidade(tec.nextInt());
		
		venda.setValor(produto.getValorUnitarioDoProduto()* venda.getQuantidade());
		
		return venda;
		
	}
}
	
