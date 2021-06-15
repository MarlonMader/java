package br.com.senai.loja;

import java.util.List;
import java.util.Scanner;

import br.com.senai.produto.Produto;

public class ProdutoController {

	private Scanner tec;

	public ProdutoController() {
		tec = new Scanner(System.in);
	}

	public int leOpcao() {
		System.out.print("Informe a opção desejada -> ");
		return tec.nextInt();
	}

	public void menu() {
		System.out.println("|3 -> Cadastrar Produtos            |");
		System.out.println("|4 -> Lista de Produtos Cadastrados |");
		System.out.println("|9 -> Sair do Sistema               |");
		System.out.println("|-----------------------------------|");
		System.out.println("\n");
	}

	public Produto cadastrarProduto() {
		Produto produto = new Produto();

		System.out.println("---- Cadastrar Produtos ----");
		System.out.println("\n");

		System.out.print("Informe o nome do produto: ");
		produto.setNomeDoProduto(tec.nextLine());

		System.out.print("Informe o valor unitário do produto: ");
		produto.setValorUnitarioDoProduto(tec.nextDouble());

		System.out.print("Informe a quantidade do produto: ");
		produto.setQuantidadeDoProduto(tec.nextInt());
		
		produto.setValorTotalDoProduto(produto.getValorUnitarioDoProduto()*produto.getQuantidadeDoProduto());
		
		System.out.println("\n");

		return produto;
	}

	public List<Produto> listarProdutos(List<Produto> produtos){
		System.out.println("\n");
		System.out.println("----------------- PRODUTOS CADASTRADOS ---------------");
		System.out.println("\n");
		
		System.out.printf("| %20s | %20s | %20s | %20s | \n" ,
				"Nome do Produto" , "Valor Unitário" , "Quantidade" , "Valor Total");
		
		for(int i = 0; i < produtos.size(); i++) {
			System.out.printf("| %20s | %20s | %20s | %20s | \n" , 
					produtos.get(i).getNomeDoProduto(),
					produtos.get(i).getValorUnitarioDoProduto(),
					produtos.get(i).getQuantidadeDoProduto(),
					produtos.get(i).getValorTotalDoProduto());
		}
		System.out.println("\n");
		
		return produtos;
	}
}