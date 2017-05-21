package br.ita.sem2dia2.ModelagemCRC1;

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
		p2.adicionaIngrediente("tomate", 1);
		p2.adicionaIngrediente("cebola", 1);
		p2.adicionaIngrediente("mussarela", 1);
		
		//instancia de carrinho para somar e testar valores de pizzas somadas
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaPizzaCarrinho(p1);
		carrinho.adicionaPizzaCarrinho(p2);
		//verificar somatório de pizzas 1 e 2
		assertEquals(40, carrinho.getTotalPrecoCarrinho());
		//assertTrue((p2.contaIngradienteInstancia != 0)); 
	}
	
	@Test
	public void impedeAdicaoPizzaSemIngrediente(){
		Pizza p3 = new Pizza();
		CarrinhoDeCompras carrinho2 = new CarrinhoDeCompras();
		carrinho2.adicionaPizzaCarrinho(p3);
		//Espero resultado falso (igual a zero), pois NÂO add ingredientes
		assertFalse((p3.contaIngradienteInstancia != 0)); 
	}


}
