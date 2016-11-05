package model;

public class Fibonacci {

	//1 1 2 3 5 8 13 21...x
	
	private int atual = 1;
	private int proximo;
	private int anterior;
	public int calculaSequencia (int valorEmFibo){
		int i;
		for (i = 1; i < valorEmFibo; i++){
			proximo = anterior + atual;
			anterior = atual;
			atual = proximo;
		}
		return atual;
	}
	public static void main(String[] args){
		Fibonacci f = new Fibonacci();
		
		int valorSequencia = 30;
		System.out.println(f.calculaSequencia(valorSequencia));
	}
	
}
