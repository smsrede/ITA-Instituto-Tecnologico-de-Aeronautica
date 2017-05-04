package br.ita.sem2dia2;

import java.util.Map.Entry;

public class Principal {

	public static void main(String[] args) {
		
		// Crie 3 pizzas com ingredientes diferentes
		// Cada pizza com uma quantidade de ingredientes diferentes
		
		//pizza1
		Pizza mussarela = new Pizza();
		mussarela.nome = "Mussarela";
		mussarela.adicionaIngrediente("tomate", 1);
		mussarela.adicionaIngrediente("queijo", 1);

		//pizza2
		Pizza portuguesa = new Pizza();
		portuguesa.nome = "Portuguesa";
		portuguesa.adicionaIngrediente("tomate", 1);
		portuguesa.adicionaIngrediente("azeitona", 1);
		portuguesa.adicionaIngrediente("presunto", 1);
		portuguesa.adicionaIngrediente("queijo", 1);
		portuguesa.adicionaIngrediente("ovo", 1);
		portuguesa.adicionaIngrediente("alho", 1);
		
		//pizza3
		Pizza calabresa = new Pizza();
		calabresa.nome = "Calabresa";
		calabresa.adicionaIngrediente("azeitona", 1);
		calabresa.adicionaIngrediente("cebola", 1);
		calabresa.adicionaIngrediente("calabresa", 1);
		
		//coloco as pizzas no carinho
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaPizzaCarrinho(mussarela);
		carrinho.adicionaPizzaCarrinho(portuguesa);
		carrinho.adicionaPizzaCarrinho(calabresa);
		
		
		
		//imprime valores de cada pizza
		System.out.println("Pre�o individual separado por pizza:\n");
		System.out.println("Pre�o da Mussarela: R$" + carrinho.getvalorIndividualPizza(mussarela)+",00");
		System.out.println("Pre�o da Portuguesa: R$" + carrinho.getvalorIndividualPizza(portuguesa)+",00");
		System.out.println("Pre�o da Calabresa: R$" + carrinho.getvalorIndividualPizza(calabresa)+",00");
		
		//imprime o valor total de todas as pizzas juntas no carrinho
		System.out.println("\nValor total de todas as pizzas adicionadas ao carrinho:\n");
		System.out.println("Total: R$" + carrinho.getTotalPrecoCarrinho()+",00\n");
		
		
		//imprime o relatrorio total e individual descriminado sobre as todas por�oes de ingretientes
		
		System.out.println("===================================================");
		carrinho.quantidadeTotalUtilizadaCadaIngrediente(mussarela);
		carrinho.quantidadeTotalUtilizadaCadaIngrediente(portuguesa);
		carrinho.quantidadeTotalUtilizadaCadaIngrediente(calabresa);
		
		System.out.println("Quantidade total de por��es de ingredientes adicionados em todas as pizzas: " + carrinho.getQtdeIngrPizzaTotal());
		System.out.println("===================================================");
		
	}

}