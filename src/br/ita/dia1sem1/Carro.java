package br.ita.dia1sem1;

public class Carro {
	int potencia;
	int velocidade;
	String nome;
	
	void acelerar(){
		this.velocidade += this.potencia;
		
	}
	void frear(){
		this.velocidade -= this.velocidade/2	;
	}
	int getVelocidade(){
		return velocidade;
	}
	void imprimir(){
		System.out.println("O carro " + nome + " está na velociadade de " + getVelocidade() + " Km/h");
	}
}
