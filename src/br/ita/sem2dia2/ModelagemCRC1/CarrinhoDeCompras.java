package br.ita.sem2dia2.ModelagemCRC1;

import java.util.Map.Entry;

//O Carrinho n�o pode aceitar que seja adicionada uma pizza sem ingredientes.

public class CarrinhoDeCompras {

	private int total = 0;

	// usado para contabilizar a quantidade individual por pizza
	private int contadorIngredienteIndividual = 0;

	// usado para contabilizar a quantidade total de ingredientes usados em
	// todas as pizzas
	private static int contadorIngredientesTotal = 0;

	public void adicionaPizzaCarrinho(Pizza p) {
		// verifica se h� ingrediente na pizza

		if (p.contaIngradienteInstancia != 0) {
			this.setTotalcarrinho(p);

			// compartilho internamente no carrinho a pizza passada na chamada
		} else {
			System.out.println("Pizza sem ingredientes");
		}
	}

	// Imprime a quantidade utilizada de cada ingrediente

	// soma o valor R$ (pre�o) de todas as pizzas
	private void setTotalcarrinho(Pizza p) {
		this.total += getvalorIndividualPizza(p);
	}

	// retorna o valor R$ (pre�o) individual de cada pizza
	public int getvalorIndividualPizza(Pizza p) {
		return p.getPrecoPizza();
	}
	
	// retorna o valor R$ (pre�o) de todas as pizzas
	public int getTotalPrecoCarrinho() {
		return this.total;
	}

	// retona a quantidade (numero) de por�oes de ingredientes usados em todas
	// as pizzas
	public int getQtdeIngrPizzaTotal() {
		return contadorIngredientesTotal;
	}

	public void quantidadeTotalUtilizadaCadaIngrediente(Pizza p) {

		System.out.println("\nPor��es de ingredientes na pizza de " + p.getNome() + ":");

		for (Entry<String, Integer> entry : p.ingredientesHahs.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
			//variavel para guardar a qtde total individual de  por�oes de cada pizza instanciada
			this.contadorIngredienteIndividual++;
			
			//variavel statica para guardar a qtde total de por�oes de todas as instancias de pizzas
			contadorIngredientesTotal++;
		}

		System.out.println(
				"Quantidade ingredientes na pizza de " + p.getNome() + " = " + this.contadorIngredienteIndividual);
		System.out.println("\n===================================================");
		
		//variavel para guardar a qtde total individual de  por�oes de cada pizza instanciada
		//zerada a cada passagem pelo FOR acima
		this.contadorIngredienteIndividual = 0;
	}

}
