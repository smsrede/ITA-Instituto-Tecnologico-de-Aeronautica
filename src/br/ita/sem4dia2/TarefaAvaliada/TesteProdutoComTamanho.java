package br.ita.sem4dia2.TarefaAvaliada;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteProdutoComTamanho {

	@Test
	public void testaProdutosComTamanhoIguais() {
		ProdutoComTamanho p0 = new ProdutoComTamanho(0,"torta", new Float(70), 42);
		ProdutoComTamanho p1 = new ProdutoComTamanho(0,"torta", new Float(70), 43);
		ProdutoComTamanho p2 = new ProdutoComTamanho(0,"torta", new Float(70), 44);

		//hashCode()
		assertEquals(p0.hashCode(),p2.hashCode());
		
		//equals()
		assertEquals(false,p0.equals(p2));
		assertEquals(false,p0.equals(p1));
		

	}

}