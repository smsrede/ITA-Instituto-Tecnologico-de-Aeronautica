package br.ita.sem4dia1;

public class ContaEspecial extends ContaCorrente{
	int limite;
	
	ContaEspecial (int limite){
		this.limite = limite;
	}
	//eu posso sobre escrever um metodo que já existe na sub class
	//estou especializando ele
	public int saca(int valor) {
		if (valor > (this.saldo + this.limite)) {
			return 0;
		} else {
			this.saldo -= valor;
			return valor;
		}
	}
}
