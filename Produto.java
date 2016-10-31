package model;

public class Produto {
	
	private String nome;
	private Integer estoque;
	private Double valor;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getEstoque() {
		return estoque;
	}
	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public Double calcTotal(){
		
		if (getEstoque() == null || getValor() == null){
			return 0.;
		}
		
		return getEstoque() * getValor();
	}
}
