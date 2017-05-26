package br.ita.sem4dia3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteCompraPrazo {
	
	Compra compra;
	

	@Test
	public void compraUmaParcela() {
		compra = new CompraParcelada(100, 1, 10);
		assertEquals(110.00, compra.total(), 0.1);
	}
	
	@Test
	public void compraDuasParcelas() {
		compra = new CompraParcelada(100, 2, 10);
		assertEquals(121.00, compra.total(), 0.1);
	}
	
	@Test
	public void compraCincoParcelas() {
		compra = new CompraParcelada(100, 5, 10);
		assertEquals(161.05, compra.total(), 0.1);
	}
	
	@Test
	public void compraDezParcelas() {
		compra = new CompraParcelada(100, 10, 10);
		assertEquals(259.37, compra.total(), 0.1);
	}

}
