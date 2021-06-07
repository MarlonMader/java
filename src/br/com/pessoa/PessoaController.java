package br.com.pessoa;

import java.util.List;
import java.util.Scanner;

public class PessoaController {

	private Scanner tec;
	
	public PessoaController(){
		tec = new Scanner(System.in);
	}
	
	public int leOpcao(){
		System.out.print("Informe a opção desejada -> ");
		return tec.nextInt();
	}
	
	public void menu() {
		System.out.println("|-------------- MENU --------------|");
		System.out.println("|1 -> Cadastrar Pessoas            |");
		System.out.println("|2 -> Lista de Pessoas Cadastradas |");
		System.out.println("|9 -> Sair do Sistema              |");
		System.out.println("|----------------------------------|");
		System.out.println("\n");
	}
	
	public Pessoa cadastrarPessoa() {
		Pessoa pessoa = new Pessoa();
		
		System.out.println("---- Cadastrar Pessoas ----");
		System.out.println("\n");
		
		System.out.print("Informe o seu nome: ");
		tec.nextLine();
		pessoa.setNome(tec.nextLine());
		
		System.out.print("Informe o seu Ano de Nascimento: ");
		pessoa.setAnoDeNascimento(tec.nextInt());
		
		System.out.print("Informe a sua altura: ");
		pessoa.setAltura(tec.nextDouble());
		System.out.println("\n");
		
		return pessoa;
	}
	
	public List<Pessoa> listarPessoas(List<Pessoa> pessoas){
		System.out.println("\n");
		System.out.println("---- PESSOAS CADASTRADADS ----");
		System.out.println("\n");
		
		System.out.printf("| %20s | %4s | %5s | %4s |\n" , "Nome" , "Ano" , "Idade" , "Altura");
		
		for(int i = 0; i < pessoas.size(); i++) {
			System.out.printf("| %20s | %4d | %5d | %6.2f |\n" , 
					pessoas.get(i).getNome(),
					pessoas.get(i).getAnoDeNascimento(),
					pessoas.get(i).getIdade(),
					pessoas.get(i).getAltura());
		}
		System.out.println("\n");
		return pessoas;
	}
}