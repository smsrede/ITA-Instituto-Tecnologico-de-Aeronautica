package br.ita.sem2dia2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCarrinhoDeCompras {

	@Test
	public void verificaPrecoPizzaSomaCorreto() {
		//pizza 1 para soma
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("tomate", 1);
		p1.adicionaIngrediente("cebola", 1);
		p1.adicionaIngrediente("mussarela", 1);
		
		//pizza 2 para soma
		Pizza p2 = new Pizza();
		p1.adicionaIngrediente("tomate", 1);
		p1.adicionaIngrediente("cebola", 1);
		p1.adicionaIngrediente("mussarela", 1);
		
		//instancia de carrinho para somar e testar valores de pizzas somadas
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaPizzaCarrinho(p1);
		carrinho.adicionaPizzaCarrinho(p2);
		
		//verificar somatório de pizzas 1 e 2
		
		assertEquals(20, carrinho.getvalorIndividualPizza(p1));
		assertEquals(20, carrinho.getvalorIndividualPizza(p2));
		assertEquals(40, carrinho.getTotalPrecoCarrinho());
	}

}
