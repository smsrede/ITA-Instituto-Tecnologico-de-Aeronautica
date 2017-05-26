package br.ita.sem4dia2.TarefaAvaliadaCarrinhoDecompras;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteProdutoComTamanho {

	@Test
	public void testaProdutosComTamanhoIguais() {
		ProdutoComTamanho p0 = new ProdutoComTamanho(0,"torta", 20, 42);
		ProdutoComTamanho p1 = new ProdutoComTamanho(0,"torta", 20, 43);
		ProdutoComTamanho p2 = new ProdutoComTamanho(0,"torta", 20, 44);

		//hashCode()
		assertEquals(false, p0.hashCode(),p2.hashCode());
		
		//equals()
		assertEquals(false,p0.equals(p2));
		assertEquals(false,p0.equals(p1));
		

	}

	private void assertEquals(boolean b, boolean equals) {
		// TODO Auto-generated method stub
		
	}

	private void assertEquals(boolean b, int hashCode, int hashCode2) {
		// TODO Auto-generated method stub
		
	}

}