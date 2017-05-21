package br.ita.sem2dia1.AprofundandoClassesJava.escola;

//passo 1 programamos de forma estruturada para comparar
//passo 2 programamos de forma O.O para comparar

public class VerificadoraDeNotas {
	
	/* Exemplo de como seria estruturado:
	 * Classe movida para dentro de Aluno
	 * 
	public static int mediaAluno(Aluno a){
		int total = 0;
		total += a.bim1;
		total += a.bim2;
		total += a.bim3;
		total += a.bim4;
		
		return total /4;
	}
	*/
	
	
	/* Exemplo de como seria estruturado:
	 * Classe movida para dentro de Aluno
	 * 
	public static boolean passouDeAno(Aluno a){
		int media = a.mediaAluno(a);
		if(media >= 60)
			return true;
		return false;
	}
	 */
	
}
