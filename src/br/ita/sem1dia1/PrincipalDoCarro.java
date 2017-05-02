package br.ita.dia1sem1;

public class PrincipalDoCarro {
	
	public static void main(String[] args) {
		//instanciar a classe Carro
		Carro c1 = new Carro();
		//iniciar as variávies de Carro (atributo)
		c1.potencia = 10;
		c1.nome = "corcel";
		c1.velocidade = 0;
		
		Carro c2 = new Carro();
		//iniciar as variávies de Carro (atributo)
		c2.potencia = 5;
		c2.nome = "fusca";
		c2.velocidade = 0;
		
		
		c1.acelerar();
		c1.imprimir();
		c1.acelerar();
		c1.imprimir();
		c1.acelerar();
		c1.imprimir();
		c1.frear();
		c1.imprimir();
		c1.frear();
		c1.imprimir();
		c1.frear();
		c1.imprimir();
		c2.imprimir();
	}
}
