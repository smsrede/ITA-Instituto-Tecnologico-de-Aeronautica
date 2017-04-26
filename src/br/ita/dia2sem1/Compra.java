package br.ita.dia2sem1;
/*
exemplos de construtores
mais de um contrutor para a mesma classe
teste de unidades
*/
public class Compra {
	int valorTotal;
	int numeroParcelas;

	// construtor 1 pg a vista
	public Compra(int valor) {
		this.valorTotal = valor;
		this.numeroParcelas = 1;
	}

	// construtor 2 pg a parcelado
	public Compra(int qtdParcelas, int valorParcela) {
		this.numeroParcelas = qtdParcelas;
		valorTotal = valorParcela * qtdParcelas;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public int getNumeroParcelas() {
		return numeroParcelas;
	}

	public int getValorParcela() {
		return valorTotal / numeroParcelas;
	}

}
