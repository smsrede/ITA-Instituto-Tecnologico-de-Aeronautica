import static org.junit.Assert.*;

import org.junit.Test;

import br.ita.sem1dia1.IntroducaoJavaOo.Carro;

public class TesteCArro {

	@Test
	public void testAcelerar() {
		Carro c = new Carro();
		c.potencia = 10;
		c.acelerar();
		assertEquals(10, c.getVelocidade());

	}

	@Test
	public void testCarroParado() {
		Carro c = new Carro();
		assertEquals(0, c.getVelocidade());

	}

	@Test
	public void testFrear() {
		Carro c = new Carro();
		c.potencia = 10;
		c.acelerar();
		c.frear();
		assertEquals(5, c.getVelocidade());

	}
	
	@Test
	public void testFrearAteZero() {
		Carro c = new Carro();
		c.potencia = 10;
		c.acelerar();
		c.frear(); //na primeira ele arrendonda para baixo...2
		c.frear();
		c.frear();
		c.frear();
		assertEquals(0, c.getVelocidade());

	}
	
	
	

}
