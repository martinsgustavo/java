package control;

import java.io.ObjectInputStream.GetField;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

import model.Funcionario;
import model.Pessoa;
import model.Produto;

public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println("Aula 01 - Java");
		
		Pessoa p1 = new Pessoa();
		p1.ler("Jose", 30, 'M');
		System.out.println("Pessoa: " + p1.retornar());
		
		int id1 = 10;
		Integer id2 = 10;
		
		System.out.println(id1);
		System.out.println(id2);
		
		Produto prod = new Produto();
		
		prod.setNome("Camisa");
		prod.setEstoque(50);
		prod.setValor(65.);
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "br"));
		
		System.out.println("Nome do Produto: " + prod.getNome());
		System.out.println("Estoque: " + prod.getEstoque());
		System.out.println("Total: " + nf.format(prod.calcTotal()));
		
		Funcionario f1 = new Funcionario();
		
		System.out.println("Nome: " + f1.getNome());
		System.out.println("Codigo: " + f1.getCodigo());
		System.out.println("Salario: " + f1.getSalario());
		System.out.println("Admissao: " + f1.getAdmissao());
		
		GregorianCalendar cal = new GregorianCalendar();
		cal.set(2013, 10 - 1, 5);
		
		f1.setNome("Carmen");
		f1.setCodigo(150);
		f1.setSalario(4000.);
		f1.setAdmissao(cal.getTime());
		
		System.out.println("-----------------------------");
		System.out.println("Nome: " + f1.getNome());
		System.out.println("Codigo: " + f1.getCodigo());
		System.out.println("Salario: " + f1.getSalario());
		System.out.println("Admissao: " + f1.getAdmissao());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("------------------------------");
		System.out.println("Nome: " + f1.getNome());
		System.out.println("Codigo: " + f1.getCodigo());
		System.out.println("Salario: " + f1.getSalario());
		System.out.println("Admissao: " + sdf.format(f1.getAdmissao()));
		
		System.out.println("-----------------------------");
		System.out.println("Nome: " + f1.getNome());
		System.out.println("Codigo: " + f1.getCodigo());
		System.out.println("Salario: " + f1.getSalario());
		System.out.println("Admissao" + sdf.format(f1.getAdmissao()));
		System.out.println("Salario Liquido: " + nf.format(f1.SalarioLiquido()));
		
		
	}

}
