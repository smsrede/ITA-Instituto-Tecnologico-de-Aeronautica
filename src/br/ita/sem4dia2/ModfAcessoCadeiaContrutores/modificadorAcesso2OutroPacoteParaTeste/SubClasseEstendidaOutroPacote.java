package br.ita.sem4dia2.ModfAcessoCadeiaContrutores.modificadorAcesso2OutroPacoteParaTeste;

import br.ita.sem4dia2.ModfAcessoCadeiaContrutores.modificadorAcesso.Referencia;

public class SubClasseEstendidaOutroPacote extends Referencia{
	
	public void testeAcesso(){
		
		//modificadorDefault = 0;
		modificadorPublico = 0;
		modificadorProtegido = 0;
		//modificadorPrivado = 0;
	}

}
