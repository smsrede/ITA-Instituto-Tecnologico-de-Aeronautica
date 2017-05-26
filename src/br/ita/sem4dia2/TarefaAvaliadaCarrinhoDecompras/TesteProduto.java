package br.ita.sem4dia2.TarefaAvaliadaCarrinhoDecompras;

import static org.junit.Assert.*;

import org.junit.Test;


public class TesteProduto {
	
	@Test
	public void testeProdutosIguais() {
		
		Produto p0 = new Produto(1,"batata",20);
		Produto p1 = new Produto(2,"tomate",30);
		Produto p2 = new Produto(1,"batata roxa",20);
		
		//Teste hashCode()
		assertEquals(p0.hashCode(), p2.hashCode());
		
		//Teste equals()
		assertEquals(true,p0.equals(p2));
		assertEquals(false,p0.equals(p1));
		assertEquals(false,p1.equals(p0));
		assertEquals(false,p1.equals(p2));
		

	}

}