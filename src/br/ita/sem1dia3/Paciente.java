package br.ita.sem1dia3;

public class Paciente {

	// atributos
	private double peso;
	private double altura;
	private double imc;

	// modifica atributos para calculo
	Paciente(double kg, double metros) {
		this.peso = kg;
		this.altura = metros;
	}

	// nucleo do calculo baseado na formula
	private double calcularIMC() {
		this.imc = this.peso / (this.altura * this.altura);
		return imc;
	}

	// retorna analise dos dados informados e calculados para geração de
	// relatorio
	String diagnostico() {
		if (calcularIMC() < 16) {
			return "Baixo peso muito grave";
		} else if (calcularIMC() >= 16 && calcularIMC() < 16.99){
				return "Baixo peso grave";
			} else if (calcularIMC() >= 17 && calcularIMC() < 18.49){
					return "Baixo peso";
				} else if (calcularIMC() >= 18.50 && calcularIMC() < 24.99) {
						return "Peso normal";
					} else if(calcularIMC() >= 18.50 && calcularIMC() < 24.99) {
							return "Peso normal";
						} else if (calcularIMC() >= 25 && calcularIMC() < 29.99) {
								return "Sobrepeso";
							} else if (calcularIMC() >= 30 && calcularIMC() < 34.99) {
									return "Obesidade grau I";
								} else if (calcularIMC() >= 35 && calcularIMC() < 39.99) {
										return "Obesidade grau II";
									} else if (calcularIMC() > 40) {
											return "Obesidade grau II";
										}
		return "valores informados fora do padrão";
	}// fim diag()
}// fim classe