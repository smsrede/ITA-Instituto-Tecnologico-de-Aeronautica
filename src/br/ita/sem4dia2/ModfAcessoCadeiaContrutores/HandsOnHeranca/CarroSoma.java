package br.ita.sem4dia2.ModfAcessoCadeiaContrutores.HandsOnHeranca;

public class CarroSoma extends CarroDeCorrida{
	private int potencia;
	public CarroSoma(String nome, int potencia, int velocidadeMaxima) {
		super(nome,velocidadeMaxima);
		this.potencia = potencia;
	}

	@Override
	public void acelerar() {
		this.velocidade += this.potencia;
		if(velocidade > velocidadeMaxima)
			velocidade = velocidadeMaxima;

	}

}