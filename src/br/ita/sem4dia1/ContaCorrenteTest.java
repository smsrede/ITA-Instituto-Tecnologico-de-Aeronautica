package br.ita.sem4dia1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ContaCorrenteTest {

	ContaCorrente cc;

	@Before
	public void inicializaConta() {
		new ContaCorrente();
		cc.deposita(200);
	}

	@Test
	public void testeDeposita() {
		assertEquals(200, cc.saldo);
	}

	@Test
	public void testeSaca() {
		assertEquals(150, cc.saca(50));
	}

	@Test
	public void testeSacaValorAlemSaldo() {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(200);
		cc.saca(250);
		assertEquals(200, cc.saldo);
	}

}
