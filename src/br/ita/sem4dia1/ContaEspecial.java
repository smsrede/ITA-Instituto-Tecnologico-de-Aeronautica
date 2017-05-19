package br.ita.sem4dia1;

public class ContaEspecial extends ContaCorrente{
	int limite;
	
	ContaEspecial (int limite){
		this.limite = limite;
	}
	
	//estou especializando um metodo da super classe
	public int saca(int valor){
		//repare que representei com THIS o saldo que é herdado da superclass
		if(valor > (this.saldo + this.limite)){
			return 0;
		}else{
			this.saldo -= valor;
			return this.saldo;
		}
	}
}
