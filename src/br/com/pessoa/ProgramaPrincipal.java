package br.com.pessoa;

import java.util.ArrayList;
import java.util.List;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		PessoaController pessoaController = new PessoaController();
		
		boolean sair = false;
		
		do {
			
			pessoaController.menu();
			
			int opcao = pessoaController.leOpcao();
					
			switch(opcao) {
			case 1:
				System.out.println("\n");
				pessoas.add(pessoaController.cadastrarPessoa());
				break;
				
			case 2:
				if(pessoaController.listarPessoas(pessoas).isEmpty()) {
					System.out.println("A lista está vazia, cadastre alguma pessoa!");
					System.out.println("\n");
				}
				else{
					pessoaController.listarPessoas(pessoas);
				}
				break;
			case 9:
				sair = true;
				break;
				
			default:
				System.out.println("\n");
				System.out.println("Opção Inválida!!");
				break;
				
			}
		}while(!sair);
		
		System.out.println("\n");
		System.out.println("Sistema Finalizado!!!");
	}
}	