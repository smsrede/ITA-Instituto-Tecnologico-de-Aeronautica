package br.ita.sem2dia1.AprofundandoClassesJava.pontuacao;

public class RegistroPontos {

	private CalculadoraBonus bonus;

	// ao criar o registro de pontos posso passar uma calBonuns
	public RegistroPontos(CalculadoraBonus cb) {
		bonus = cb;
	}

	public void fazerUmComentario(Usuario u) {
		// poderia ser o caso de criar uma cal bonus aqui...
		u.pontos += 3 * bonus.bonus(u);

	}

	public void criarUmTopico(Usuario u) {
		u.pontos += 5 * bonus.bonus(u);

	}

	public void darUmLike(Usuario u) {
		u.pontos += 1 * bonus.bonus(u);
	}

}
