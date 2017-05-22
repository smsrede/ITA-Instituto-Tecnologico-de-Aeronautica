package br.ita.sem4dia2.ModfAcessoCadeiaContrutores.modificadorAcesso2OutroPacoteParaTeste;

import br.ita.sem4dia2.ModfAcessoCadeiaContrutores.modificadorAcesso.Referencia;

public class ClassOutroPacoteDiferente {
	//aqui chamos os atrib e metodos de outro pacote
	//instancio a classe referencia para teste
	
	public void testeAcesso(){
		Referencia r = new Referencia();
		//r.modificadorDefault = 0;
		r.modificadorPublico = 0;
		//r.modificadorProtegido = 0;
		//r.modificadorPrivado = 0;
	}
}
