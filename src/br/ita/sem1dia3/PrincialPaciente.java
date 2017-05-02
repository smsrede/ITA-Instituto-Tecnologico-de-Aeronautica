package br.ita.dia3sem1;

public class PrincialPaciente {

	public static void main(String[] args) {
		
		//Instanciando e criando variaveis de referncia para o obj Paciente
		Paciente p1 = new Paciente(80, 1.88);
		Paciente p2 = new Paciente(60, 1.50);
		Paciente p3 = new Paciente(50, 1.90);
		
		//imprime os resultados
		System.out.println("Paciente 1: " + p1.diagnostico());
		System.out.println("Paciente 2: " + p2.diagnostico());
		System.out.println("Paciente 3: " + p3.diagnostico());

	}

}
