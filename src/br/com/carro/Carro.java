/*
* Crie uma classe chamada Carro com os seguintes atributos:
* 
* Marca;
* Modelo;
* Ano;
* QtdPortas;
* 
* Configure a visivilidade dos atributos para PRIVATE;
* 
* Crie os métodos GETs e SETs para cada atributo;
* 
* Crie uma classe ProgramaPrincipal e instâncie 5 objetos do tipo Carro;
* 
* Atribua dados para cada objeto e imprima os dados no final.
*/

package br.com.carro;

public class Carro {
	
	private String marca;
	private String modelo;
	private int ano;
	private int qtdportas;
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getQtdportas() {
		return qtdportas;
	}
	
	public void setQtdportas(int qtdportas) {
		this.qtdportas = qtdportas;
	}
}
