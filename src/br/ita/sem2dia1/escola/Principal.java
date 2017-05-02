package br.ita.sem2dia1.escola;

//passo 1 programamos de forma estruturada para comparar
//passo 2 programamos de forma O.O para comparar

public class Principal {

	public static void main(String[] args) {
		Aluno samuel = new Aluno();
		samuel.bim1=60;
		samuel.bim2=80;
		samuel.bim3=70;
		samuel.bim4=70;
		
		
		//fica mais intuitivo perguntar ao aluno "o que ele sabe fazer?"
		//Quais seus metodos
		//vc passou de ano?
		System.out.println(samuel.media());
		System.out.println(samuel.passouDeAno());
		
		
		//Estruturado:
		/*	
		System.out.println(samuel.mediaAluno(VerificadoraDeNotas));
		System.out.println(VerificadoraDeNotas.passouDeAno(samuel));
        */
	}

}
