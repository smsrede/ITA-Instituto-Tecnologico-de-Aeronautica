package br.ita.sem4dia2.ModfAcessoCadeiaContrutores.CadeiaDeConstrutores;

public class Pricipal {

	public static void main(String[] args) {
		//note que, embora seja chamado o LaDeBaixo
		//ele imporime primeiro o Pai de Todos laaa em cima
		//pois la de baixo, antes de executar
		//chama o do meio, e o do meio, antes de executar
		//chama o pai de todos.
		//ai 1. paidetodos retorna com exec��o
		//2.do meio retorna com execu��o
		//3.la de baixo executa
		LaDeBaixo obj = new LaDeBaixo();

	}

}
