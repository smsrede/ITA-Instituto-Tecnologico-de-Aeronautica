package br.ita.sem4dia1;

public class ContaCorrente {
	int saldo;
	
	public void deposita(int valor){
		this.saldo += valor;
	}
	
	public int saca(int valor){
		if(this.saldo < valor){
			return 0;
		}else{
			this.saldo -= valor;
			return this.saldo;
		}
	}
}
