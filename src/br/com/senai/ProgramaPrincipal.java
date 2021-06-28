package br.com.senai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.senai.loja.Venda;
import br.com.senai.loja.VendaController;
import br.com.senai.pessoa.Pessoa;
import br.com.senai.pessoa.PessoaController;
import br.com.senai.produto.Produto;
import br.com.senai.produto.ProdutoController;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		List<Pessoa> pessoas = new ArrayList<>();
		List<Produto> produtos = new ArrayList<Produto>();
		List<Venda> vendas = new ArrayList<Venda>();

		Produto produto = new Produto ("Abacate",2.5,35,2.5*35);
		
		produtos.add(produto);
				
		
		PessoaController pessoaController = new PessoaController();
		ProdutoController produtoController = new ProdutoController();
		VendaController vendaController = new VendaController();

		boolean sair = false;

		do {
			
				System.out.print("\n");
				System.out.println("|-------------- MENU PRINCIPAL ---------------|");
				System.out.println("|1 -> Menu Pessoas                            |");
				System.out.println("|2 -> Menu Produtos                           |");
				System.out.println("|3 -> Menu Vendas                             |");
				System.out.println("|0 -> Sair                                    |");
				System.out.print("|---------------------------------------------|");
				System.out.println("\n");
				System.out.print("Informe a opção desejada: ");	
				
				
				int opcao= tec.nextInt();
			switch (opcao) {
			
			case 1:
				pessoaController.menu(pessoas);
				break;
				
			case 2:
				produtoController.menu(produtos);
				break;
			case 3:
				vendaController.menu(produtos, pessoas);
				break;
			case 0:
				sair = true;
				
				break;

			default:
				System.out.println("\n");
				System.out.println("Opção Inválida!!");
				
				break;

			}
		} while (!sair);

		System.out.println("\n");
		System.out.println("Sistema Finalizado!!!");
	}
}