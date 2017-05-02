package br.ita.sem2dia1.estaticaVsInstancia;

public class Somador {
	String nome;
	int valorInstancia = 0;
	static int valorEstatica = 0;

	void somar() {
		valorInstancia++;
		valorEstatica++;
	}

	void imprimir(){
		System.out.println("O Somador + " +this.nome+ ": Var-Intancia= " +valorInstancia+ " -- Var-Estatica= " +valorEstatica);
	}

}
