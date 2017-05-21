package br.ita.sem2dia2.ModelagemCRC1;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class TestePizza {
	
	@AfterClass
	//apos os testes o contador de ingredientes � zerado
	public static void afterClasse() {
		Pizza.zeraRegistroTotalIngredientes();
	}
	
	@Test
	//Esse m�todo de teste cria uma pizza e pergunta se o valor dessa pizza, com esses ingredientes custa 20.
	public void verificaValorPizzaQtdIngrediente() {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("tomate", 1);
		p1.adicionaIngrediente("cebola", 1);
		p1.adicionaIngrediente("mussarela", 1);
		//para esse quantidade de ingrediente temos um pre�o de 20
		assertEquals(20, p1.getPrecoPizza());
	}
	@Test
	public void registroIngredienteFuncionou(){
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("tomate", 1);
		p2.adicionaIngrediente("cebola", 1);
		p2.adicionaIngrediente("or�gno", 1);
		p2.adicionaIngrediente("pimenta", 1);
		//para 4 ingredientes esperamos que retorne 4
		assertEquals(4, p2.contaIngradienteInstancia); 
		
	}
	

}
