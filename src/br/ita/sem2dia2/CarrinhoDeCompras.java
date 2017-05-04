package br.ita.sem2dia2;

import java.util.Map.Entry;

//O Carrinho não pode aceitar que seja adicionada uma pizza sem ingredientes.

public class CarrinhoDeCompras {

	private int total = 0;

	// usado para contabilizar a quantidade individual por pizza
	private int contadorIngredientesIndividual = 0;
	// usado para contabilizar a quantidade total de ingredientes usados em todas as pizzas
	private int contadorIngredientesTotal = 0;

	public void adicionaPizzaCarrinho(Pizza p) {
		// verifica se há ingrediente na pizza

		if (p.contaIngradienteInstancia != 0) {
			this.setTotalcarrinho(p);

			// compartilho internamente no carrinho a pizza passada na chamada
		} else {
			System.out.println("Pizza sem ingredientes");
		}
	}

	// Imprime a quantidade utilizada de cada ingrediente

	// soma o valor de todas as pizzas
	private void setTotalcarrinho(Pizza p) {
		this.total += getvalorIndividualPizza(p);
	}

	// retorna o valor (preço) total de todas as pizzas
	public int getTotalPrecoCarrinho() {
		return this.total;
	}

	// retorna o valor individual de cada pizza
	public int getvalorIndividualPizza(Pizza p) {
		return p.getPrecoPizza();
	}

	public int getQtdeIngrPizzaTotal() {
		return this.contadorIngredientesTotal;
	}
	
	public void quantidadeTotalUtilizadaCadaIngrediente(Pizza p) {
		
		System.out.println("\nPorções de ingredientes na pizza de " + p.nome + ":");
		
		for (Entry<String, Integer> entry : p.ingredientesHahs.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
			this.contadorIngredientesIndividual++;
			this.contadorIngredientesTotal++;
		}
		
		System.out.println("Quantidade ingredientes na pizza de " + p.nome + " = "
				+ this.contadorIngredientesIndividual);
		System.out.println("\n===================================================");
		
		this.contadorIngredientesIndividual = 0;
	}

}
