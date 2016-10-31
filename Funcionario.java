package model;

import java.util.Date;

public class Funcionario {

	private Integer codigo;
	private String nome;
	private Double salario;
	private Date admissao;
	
	public Funcionario(){
		
		System.out.println("FUNCIONARIO INSTANCIADO");
		setNome("n/d");
		setSalario(800.);
		setAdmissao(new Date());
		
		Double cod = Math.random();
		setCodigo((int) (cod * 10000));
		
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Date getAdmissao() {
		return admissao;
	}

	public void setAdmissao(Date admissao) {
		this.admissao = admissao;
	}
	
	public Double SalarioLiquido(){
		if (getSalario() == null)
			return 0.;
		if (getSalario() < 1500)
			return getSalario() * 0.91;
		else if (getSalario() < 3500)
			return getSalario() * 0.83;
		else
			return getSalario() * 0.72;
		
	}
}
