package model;

public class Pessoa {
	
	private String nome;
	private int idade;
	private char sexo;
	
	public void ler(String nome, int idade, char sexo){
		
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public String retornar(){
		
		return nome + ", " + idade + ", " + this.sexo;
	}

}
