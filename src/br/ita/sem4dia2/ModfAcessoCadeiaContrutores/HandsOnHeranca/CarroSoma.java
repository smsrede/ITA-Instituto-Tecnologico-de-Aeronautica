package br.ita.sem4dia2.ModfAcessoCadeiaContrutores.HandsOnHeranca;

public class CarroSoma extends CarroDeCorrida{
	private double potencia;
	public CarroSoma(String nome, double d, int velocidadeMaxima) {
		super(nome,velocidadeMaxima);
		this.potencia = d;
	}

	@Override
	public void acelerar() {
		this.velocidade += this.potencia;
		if(velocidade > velocidadeMaxima)
			velocidade = velocidadeMaxima;

	}

}