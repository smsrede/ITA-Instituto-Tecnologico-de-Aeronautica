package br.ita.sem1dia1.IntroducaoJavaOo;

public class Carro {
	public int potencia;
	public int velocidade;
	public String nome;
	
	public void acelerar(){
		this.velocidade += this.potencia;
		
	}
	public void frear(){
		this.velocidade = this.velocidade/2	;
	}
	public int getVelocidade(){
		return velocidade;
	}
	public void imprimir(){
		System.out.println("O carro " + nome + " está na velociadade de " + getVelocidade() + " Km/h");
	}
}
