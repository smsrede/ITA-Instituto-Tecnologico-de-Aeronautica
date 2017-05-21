package br.ita.sem4dia1;

public class ContaCorrente {
	int saldo;

	public int saca(int valor) {
		if (valor > this.saldo) {
			return 0;
		} else {
			this.saldo -= valor;
			return valor;
		}
	}

	public void deposita(int valor) {
		this.saldo += valor;
	}

}
