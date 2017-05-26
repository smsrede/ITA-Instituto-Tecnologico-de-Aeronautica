package br.ita.sem4dia3;

public class CompraParcelada extends Compra {

	double taxaJuros;
	int qtdParcelas;

	public CompraParcelada(double valorCompra, int qtdParcelas, double taxaJuros) {

		super(valorCompra);
		this.valorCompra = valorCompra;
		this.qtdParcelas = qtdParcelas;
		this.taxaJuros = taxaJuros / 100;
	}

	@Override
	public double total() {

		valorTotalCompraPrazo = valorCompra * (Math.pow(1 + this.taxaJuros, this.qtdParcelas));

		return valorTotalCompraPrazo;
	}
}
