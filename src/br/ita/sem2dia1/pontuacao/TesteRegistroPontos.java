package br.ita.sem2dia1.pontuacao;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteRegistroPontos {

	@Test
	public void pontosCriarTópico() {
		Usuario u = new Usuario();
		u.nome = "Samuel";
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 5);
	}
	@Test
	public void pontosCriarTópicoVIP() {
		Usuario u = new Usuario();
		u.nome = "Samuel";
		u.vip = true;
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 25);
	}
	@Test
	public void pontosBonusDoDia() {
		Usuario u = new Usuario();
		u.nome = "Samuel";
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia = 3;
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 15);
	}
	@Test
	public void pontosBonusDoDiaVIP() {
		Usuario u = new Usuario();
		u.nome = "Samuel";
		u.vip = true;
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia = 2;
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 50);
	}
	

}
