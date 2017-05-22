package br.ita.sem4dia2.ModfAcessoCadeiaContrutores.CadeiaDeConstrutores;

public class DoMeio extends PaiDeTodos {

	public DoMeio() {
		super(" - Parametro passado no meio");  //-  chama implicitamente se pai de todos esta vazio
		//caso tenha parametro DEVE constar SUPER() aqui e DEVE
		//contar parametros
		//Ele cria Default (VAZIO) como em pai de todos ha parametros
		//da erro. Por isso, precisa cria-lo para poder passar o parametro
		//NECESSARIO
		System.out.println("Construtor DoMeio");
	}
	

}
