package br.ita.sem4dia1.heranca;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteContaEspecial extends TesteContaCorrente{

	@Before
	public void inicializaConta() {
		cc = new ContaEspecial(100);
		cc.deposita(200);
	}
	
	@Test
	public void testeSaqueValorMaioQueSaldo() {
		int valorSacado = cc.saca(350);
		assertEquals(200, cc.saldo);
		assertEquals(0, valorSacado);
		
	}
	
	@Test
	public void testeSaqueValorDentroDoLimite() {
		int valorSacado = cc.saca(250);
		assertEquals(-50, cc.saldo);
		assertEquals(250, valorSacado);
		
	}
}
