package br.com.senai.endereco;

public class Endereco extends Cidade {

	//ATRIBUTOS
	private String nomeDaRua;
	private String bairro;
	private String complemento;
	private String numero;
	
	public String getNomeDaRua() {
		return nomeDaRua;
	}
	
	public void setNomeDaRua(String nomeDaRua) {
		this.nomeDaRua = nomeDaRua;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}	
}