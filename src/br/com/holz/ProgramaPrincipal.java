package br.com.holz;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		Pessoa pessoa4 = new Pessoa();
		
		pessoa1.setNome("Carlos");
		pessoa1.setAnoDeNascimento(2001);
		pessoa1.setSexo("M");
		
		pessoa2.setNome("Victor");
		pessoa2.setAnoDeNascimento(2004);
		pessoa2.setSexo("M");
		
		pessoa3.setNome("Johnatan");
		pessoa3.setAnoDeNascimento(1990);
		pessoa3.setSexo("M");
		
		pessoa4.setNome("Gabriel");
		pessoa4.setAnoDeNascimento(2004);
		pessoa4.setSexo("M");
		
		System.out.println("---- Pessoa 1 ----");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getAnoDeNascimento());
		System.out.println(pessoa1.getSexo());
		System.out.println("\n");
		
		System.out.println("---- Pessoa 2 ----");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getAnoDeNascimento());
		System.out.println(pessoa2.getSexo());
		System.out.println("\n");
		
		System.out.println("---- Pessoa 3 ----");
		System.out.println(pessoa3.getNome());
		System.out.println(pessoa3.getAnoDeNascimento());
		System.out.println(pessoa3.getSexo());
		System.out.println("\n");
		
		System.out.println("---- Pessoa 4 ----");
		System.out.println(pessoa4.getNome());
		System.out.println(pessoa4.getAnoDeNascimento());
		System.out.println(pessoa4.getSexo());
	}
}
