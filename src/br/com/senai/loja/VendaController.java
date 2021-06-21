package br.com.senai.loja;

import java.util.Scanner;

import br.com.senai.pessoa.Pessoa;

public class VendaController {

	
private Scanner tec;
	
	public VendaController(){
		tec = new Scanner(System.in);
	}
	
	public int leOpcao(){
		System.out.print("Informe a opção desejada -> ");
		return tec.nextInt();
	} 
}	
