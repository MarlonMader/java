package br.com.holz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
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
		
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		
		System.out.println("----- PESSOAS COM FOR -----");
		for(int i = 0; i < pessoas.size(); i++) {
			System.out.println(pessoas.get(i));
			System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
		}
		
		System.out.println("\n");
		
		System.out.println("----- PESSOAS CADASTRADAS -----");
		for(Pessoa people : pessoas) {
			System.out.println(people);
			System.out.println("##################");
		}
		
		System.out.println("\n");
		
		System.out.println("---- PESSOAS COM FOREACH ----");
		pessoas.forEach(aluno -> {
			System.out.println(aluno);
			System.out.println("******************");
		});
		
		System.out.println("\n");
		
		Scanner tec = new Scanner (System.in);
		
		MetodoController metodoController = new MetodoController();
		
		System.out.println("---- TABUADA ----");
		metodoController.multiplicar();
		
		System.out.println("\n");
		
		System.out.println("----- SOMA DE DOIS VALORES -----");
		System.out.println("A soma dos valores é: " + metodoController.somar());
		
		System.out.println("\n");
		
		System.out.println("----- SUBTRAÇÃO DE VALORES POR PARÂMETRO -----");
		System.out.print("Informe o primeiro valor: ");
		int valor1 = tec.nextInt();
		System.out.print("Informe o segundo valor: ");
		int valor2 = tec.nextInt();
		
		System.out.println("A subtração dos valores é: " + metodoController.subtrair(valor1, valor2));
	}
}