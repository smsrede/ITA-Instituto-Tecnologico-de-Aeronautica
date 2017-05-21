package br.ita.sem4dia1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteContaCorrente {

	ContaCorrente cc;

	@Before
	public void inicializaConta() {
		//antes de cada teste ele vai criar uma nova contacorrente
		cc = new ContaCorrente();
		cc.deposita(200);
	}

	@Test
	public void testeDeposita() {
		assertEquals(200, cc.saldo);
	}

	@Test
	public void testeSaca() {
		int valorSacado = cc.saca(50);
		assertEquals(150, cc.saldo);
		assertEquals(50, valorSacado);
	}

	@Test
	public void testeSaqueValorMaioQueSaldo() {
		int valorSacado = cc.saca(250);
		assertEquals(200, cc.saldo);
		assertEquals(0, valorSacado);
		
	}

}
