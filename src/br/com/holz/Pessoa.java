package br.com.holz;

public class Pessoa {
	
	//ATRIBUTOS
	private String nome;
	private int anoDeNascimento;
	private String sexo;
	
	//MÉTODOS
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAnoDeNascimento() {
		return anoDeNascimento;
	}
	
	public void setAnoDeNascimento(int anoDeNascimento) {
		this.anoDeNascimento = anoDeNascimento;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nNascimento: " + anoDeNascimento + "\nSexo: " + sexo;
	}
}