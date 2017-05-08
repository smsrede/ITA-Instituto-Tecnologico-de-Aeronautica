package br.ita.sem1dia2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCompra {

	@Test
	public void compraAVista() {
		Compra c = new Compra(500);
		/*
		 * O junit é sempre ao contrário
		 * - sempre o que espero primeiro
		*/
		assertEquals(1, c.getNumeroParcelas());
		assertEquals(500, c.getValorTotal());
		//e o valor total tb 500(uma só)
		assertEquals(500, c.getValorParcela());
		
	}	
	@Test
	public void compraAParcelado() {
		Compra c = new Compra(4, 1000);
		/*
		 * O junit é sempre ao contrário
		 * - sempre o que espero primeiro
		*/
		assertEquals(4, c.getNumeroParcelas());
		assertEquals(4000, c.getValorTotal());
		//e o valor total tb 500(uma só)
		assertEquals(1000, c.getValorParcela());
		
	}	
}
