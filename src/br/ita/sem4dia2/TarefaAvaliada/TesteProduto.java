package br.ita.sem4dia2.TarefaAvaliada;

import static org.junit.Assert.*;

import org.junit.Test;


public class TesteProduto {
	
	@Test
	public void testeProdutosIguais() {
		//produtos diferentes códigos iguais
		//validar critério definido no equals() da classe Produto.
		Produto p0 = new Produto(1,"batata",new Float(80));
		Produto p1 = new Produto(2,"tomate",new Float(60));
		Produto p2 = new Produto(1,"batata roxa",new Float(2));
		
		//Testa hashCode()
		assertEquals(p0.hashCode(), p2.hashCode());
		
		//Testa equals()
		assertEquals(true,p0.equals(p2));
		assertEquals(false,p0.equals(p1));
		assertEquals(false,p1.equals(p0));
		assertEquals(false,p1.equals(p2));
		

	}

}