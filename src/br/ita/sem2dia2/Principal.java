package br.ita.sem2dia2;

public class Principal {

	public static void main(String[] args) {

		// Crie 3 pizzas com ingredientes diferentes
		// Cada pizza com uma quantidade de ingrediente diferente

		// pizza1
		Pizza mussarela = new Pizza();
		mussarela.setNome("Mussarela");
		mussarela.adicionaIngrediente("tomate", 1);
		mussarela.adicionaIngrediente("queijo", 1);

		// pizza2
		Pizza portuguesa = new Pizza();
		portuguesa.setNome("Portuguesa");
		portuguesa.adicionaIngrediente("tomate", 1);
		portuguesa.adicionaIngrediente("azeitona", 1);
		portuguesa.adicionaIngrediente("presunto", 1);
		portuguesa.adicionaIngrediente("queijo", 1);
		portuguesa.adicionaIngrediente("ovo", 1);
		portuguesa.adicionaIngrediente("alho", 1);

		// pizza3
		Pizza calabresa = new Pizza();
		calabresa.setNome("Calabresa");
		calabresa.adicionaIngrediente("azeitona", 1);
		calabresa.adicionaIngrediente("cebola", 1);
		calabresa.adicionaIngrediente("calabresa", 1);

		// coloco as pizzas no carinho
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaPizzaCarrinho(mussarela);
		carrinho.adicionaPizzaCarrinho(portuguesa);
		carrinho.adicionaPizzaCarrinho(calabresa);

		
		//RELATORIOSDE DE SAÍDA:
		
		// imprime valores de cada pizza
		System.out.println("Preço individual separado por pizza:\n");
		System.out.println("Preço da Mussarela: R$" + carrinho.getvalorIndividualPizza(mussarela) + ",00");
		System.out.println("Preço da Portuguesa: R$" + carrinho.getvalorIndividualPizza(portuguesa) + ",00");
		System.out.println("Preço da Calabresa: R$" + carrinho.getvalorIndividualPizza(calabresa) + ",00");

		// imprime o valor total de todas as pizzas juntas no carrinho
		System.out.println("\nValor total de todas as pizzas adicionadas ao carrinho:\n");
		System.out.println("Total: R$" + carrinho.getTotalPrecoCarrinho() + ",00\n");

		// imprime o relatrorio total e individual descriminado sobre as todas
		// porçoes de ingretientes

		System.out.println("===================================================");
		carrinho.quantidadeTotalUtilizadaCadaIngrediente(mussarela);
		carrinho.quantidadeTotalUtilizadaCadaIngrediente(portuguesa);
		carrinho.quantidadeTotalUtilizadaCadaIngrediente(calabresa);

		// imporime a quantidade total de porções de ingredientes adicionados em
		// todas as pizzas:
		System.out.println("Quantidade total de porções de ingredientes adicionados em todas as pizzas: "
				+ carrinho.getQtdeIngrPizzaTotal());
		System.out.println("===================================================");

	}

}
