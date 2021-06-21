package br.com.senai.pessoa;

import java.util.List;
import java.util.Scanner;

import com.sun.javafx.collections.SetAdapterChange;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLBoundOperation.ANONYMOUS;

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
		System.out.println("|3 -> Editar Pessoa                 |");
		System.out.println("|4 -> Excluir Pessoa                |");
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
		
		System.out.printf("| %2s | %15s | %20s | %20s | %20s | %20s| %21s | %23s | %20s | %30s | %30s | %30s | %21s | %30s | \n" , "Id" ,
				"Nome" , "Ano" , "Idade" , "Altura", "País" , "Sigla Páis", "Estado" , "UF" , "Cidade" , "Rua" , "Bairro" , "Complemento" , "Número");
		
		for(int i = 0; i < pessoas.size(); i++) {
			System.out.printf("| %2d | %15s | %20s | %20s | %20s | %20s| %21s | %23s | %20s | %30s | %30s | %30s | %21s | %30s | \n" , 
					i + 1,
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
	
	public List<Pessoa> editarPessoas(List<Pessoa> pessoas) {
		
		Pessoa pessoa = new Pessoa();
		
		listarPessoas(pessoas);
		
		System.out.println("Informe o ID da pessoa para editar -> ");
		int idPessoa = tec.nextInt() - 1;
		System.out.println("\n");
		
		System.out.println("|--- CAMPOS A SEREM EDITADOS ---|");
		System.out.println("|1 -> Nome da pessoa            |");
		System.out.println("|2 -> Ano de Nascimento         |");
		System.out.println("|3 -> Altura                    |");
		System.out.println("\n");
		System.out.println("Informe o campo que deseja editar -> ");
		int opcao = tec.nextInt();
		System.out.println("\n");
		
		switch (opcao) {
		
		case 1:
			System.out.println("---- Editar o nome da pessoa cadastrada ----");
			System.out.println("\n");
			System.out.println("Informe o novo nome da pessoa ");
			pessoa.setNome(tec.next());
			
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			
			pessoas.set(idPessoa, pessoa);
			System.out.println("\n");
			break;
			
		case 2:
			System.out.println("---- Editar o Ano de nascimetno da pessoa ----");
			System.out.println("\n");
			System.out.println("Informe o Ano de nascimento da pessoa: ");
			pessoa.setAnoDeNascimento(tec.nextInt());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			
			
			pessoas.set(idPessoa, pessoa);
			
			System.out.println("\n");
			break;
			
		case 3:
			System.out.println("---- Editar a altura da pessoa ----");
			System.out.println("\n");
			System.out.println("Informe a altura da pessoa: ");
			pessoa.setAltura(tec.nextDouble());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			
			pessoas.set(idPessoa, pessoa);
			
			System.out.println("\n");
			break;
			
			default:
				System.out.println("Opcao invalida!!!!");
				break;
		}
		
		return pessoas;
	}
	
	public void excluirPessoa(List<Pessoa> pessoas) {
		listarPessoas(pessoas);
		
		if(pessoas.isEmpty()) {
			return;
		}
		
		System.out.println("--- EXCLUIR PESSOA ---");
		
		System.out.println("Informe o Id da pessoa para excluir: ");
		int idPessoa = tec.nextInt() - 1;
		
		if(pessoas.size() <= idPessoa) {
			System.out.println("Produto não cadastrado.");
			return;
		}
	 
		pessoas.remove(idPessoa);
		
	}
}