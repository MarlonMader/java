package br.com.holz;

import java.util.Scanner;

public class MetodoController {

	Scanner tec = new Scanner (System.in);
	
	//Nomes de função são sempre VERBOS (multiplicar);
	public void multiplicar() {
		
		System.out.print("Informe o valor: ");
		int valor = tec.nextInt();
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(valor + " X " + i + " = " + (valor * i));
		}
	}
	
	//Nomes de função são sempre VERBOS (somar);
	public int somar() {
		System.out.print("Informe o primeiro valor: ");
		int valor1 = tec.nextInt();
		System.out.print("Informe o segundo valor: ");
		int valor2 = tec.nextInt();
		
		int resultado = valor1 + valor2;
		
		return resultado;
	}
	
	//Nomes de função são sempre VERBOS (subtrair);
	public int subtrair (int valor1, int valor2) {
		int resultado = valor1 - valor2;
		
		return resultado;
	}
}