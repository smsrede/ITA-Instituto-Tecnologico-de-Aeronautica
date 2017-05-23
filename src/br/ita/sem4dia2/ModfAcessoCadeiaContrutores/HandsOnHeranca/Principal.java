package br.ita.sem4dia2.ModfAcessoCadeiaContrutores.HandsOnHeranca;

public class Principal {

	public static void main(String[] args) {
		Corrida corridaDaAmizade = new Corrida(2000);
		corridaDaAmizade.adicionaCarro(new CarroSoma("CarroA",10,110));
		corridaDaAmizade.adicionaCarro(new CarroSoma("CarroB",8,110));
		corridaDaAmizade.adicionaCarro(new CarroSoma("CarroC",1.7,110));
		corridaDaAmizade.adicionaCarro(new CarroSoma("CarroD",1.4,90));
		corridaDaAmizade.umDoisTresEJa();

	}

}
