package br.ita.sem4dia2.ModfAcessoCadeiaContrutores.modificadorAcesso;

public class Referencia {
	 
	int modificadorDefault;
	public int modificadorPublico;
	protected int modificadorProtegido;
	private int modificadorPrivado;
	
	public void testeacessoPropriaClasse(){
		
		this.modificadorDefault = 0;
		this.modificadorPublico = 0;
		this.modificadorProtegido = 0;
		this.modificadorPrivado = 0;

	}

}
