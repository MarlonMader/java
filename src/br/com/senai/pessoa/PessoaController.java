package br.com.senai.pessoa;

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
		System.out.println("|-------------- MENU ---------------|");
		System.out.println("|1 -> Cadastrar Pessoas             |");
		System.out.println("|2 -> Lista de Pessoas Cadastradas  |");
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
		
		System.out.print("Informe o País que você mora: ");
		tec.nextLine();
		pessoa.setNomeDoPais(tec.nextLine());
		
		System.out.print("Informe a Sigla do País que você vive: ");
		pessoa.setSiglaDoPais(tec.nextLine());
		
		System.out.print("Informe o Estado em que você reside: ");
		pessoa.setNomeDoEstado(tec.nextLine());
		
		System.out.print("Informe o UF: ");
		pessoa.setUf(tec.nextLine());
		
		System.out.print("Informe a Cidade que você reside: ");
		pessoa.setNomeDaCidade(tec.nextLine());
		
		System.out.print("Informe o nome da Rua que você mora: ");
		pessoa.setNomeDaRua(tec.nextLine());
		
		System.out.print("Informe o Bairro: ");
		pessoa.setBairro(tec.nextLine());
		
		System.out.print("Complemento: ");
		pessoa.setComplemento(tec.nextLine());
		
		System.out.print("Número: ");
		pessoa.setNumero(tec.nextLine());
		System.out.println("\n");
		
		return pessoa;
	}
	
	public List<Pessoa> listarPessoas(List<Pessoa> pessoas){
		System.out.println("\n");
		System.out.println("----------------- PESSOAS CADASTRADADS ---------------");
		System.out.println("\n");
		
		System.out.printf("| %20s | %4s | %5s | %4s | %10s | %10s | %15s| %2s | %15s | %17s | %20s| %10s| %5s| \n" ,
				"Nome" , "Ano" , "Idade" , "Altura", "País" , "Sigla Páis", "Estado" , "UF" , "Cidade" , "Rua" , "Bairro" , "Complemento" , "Número");
		
		for(int i = 0; i < pessoas.size(); i++) {
			System.out.printf("| %20s | %4d | %5d | %6.2f | %10s | %10s | %10s | %2s | %13s | %10s | %10s | %10s | %5s| \n" , 
					pessoas.get(i).getNome(),
					pessoas.get(i).getAnoDeNascimento(),
					pessoas.get(i).getIdade(),
					pessoas.get(i).getAltura(),
					pessoas.get(i).getNomeDoPais(),
					pessoas.get(i).getSiglaDoPais(),
					pessoas.get(i).getNomeDoEstado(),
					pessoas.get(i).getUf(),
					pessoas.get(i).getNomeDaCidade(),
					pessoas.get(i).getNomeDaRua(),
					pessoas.get(i).getBairro(),
					pessoas.get(i).getComplemento(),
					pessoas.get(i).getNumero());
		}
		System.out.println("\n");

		return pessoas;
	}
}