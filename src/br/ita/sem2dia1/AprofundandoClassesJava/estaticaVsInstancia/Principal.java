package br.ita.sem2dia1.AprofundandoClassesJava.estaticaVsInstancia;

public class Principal {

	public static void main(String[] args) {
		Somador s1 = new Somador();
		s1.nome = "somador 1";
		
		Somador s2 = new Somador();
		s2.nome = "somador 2";
		//Somador s3 = new Somador();
		//s3.nome = "somador 3";
		 
		for (int i = 0; i < 3; i++) {
			s1.somar(); //at� aqui n faz dif pois chamei o met somar 1x
			s2.somar(); //aqui chamei o met somar 2x..para a inst � zerado mas, para var static continua valendo.
			//s3.somar();
			//a variavel estatica dentro do metodo somar � chamadada varias vezes ..
			//ou seja..� chamada em OBJETO1, OBJETO2....[
			//quando � estatica os obj compartilham o conte�do
		}
		
		s2.somar();
		
		s1.imprimir();
		s2.imprimir();
		//s3.imprimir();

	}

}
