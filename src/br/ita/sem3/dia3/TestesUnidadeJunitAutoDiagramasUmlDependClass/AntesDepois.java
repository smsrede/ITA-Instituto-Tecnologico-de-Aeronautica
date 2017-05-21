package br.ita.sem3.dia3.TestesUnidadeJunitAutoDiagramasUmlDependClass;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AntesDepois {
	@Before
	public void before() {// ser� impresso antes de cada teste
		System.out.println("@before");
	}

	@After
	public void after() {// ser� impresso depois de cada teste
		System.out.println("@after");

	}

	@BeforeClass
	public static void beforeClasse() { //Exigencia do Junit ser est�tico
		System.out.println("@BeforeClass");
	}

	@AfterClass
	public static void afterClasse() { //Exigencia do Junit ser est�tico
		System.out.println("@AfterClass");
	}

	
	@Test
	public void test1() {
		System.out.println("Teste 1");
	}

	@Test
	public void test2() {
		System.out.println("Teste 2");
	}

	@Test
	public void test3() {
		System.out.println("Teste 3");
	}

}
