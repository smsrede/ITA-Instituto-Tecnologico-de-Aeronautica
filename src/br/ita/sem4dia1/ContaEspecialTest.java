package br.ita.sem4dia1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ContaEspecialTest extends ContaCorrenteTest{

	@Before
	public void inicializaConta() {
		cc = new ContaEspecial(100);
		cc.deposita(200);
	}
	
	@Test
	public void testeSacaValorAlemSaldoLmite() {
		int valorSacado = cc.saca(350);
		assertEquals(200, cc.saldo);
		assertEquals(0, valorSacado);
		
	}
}
