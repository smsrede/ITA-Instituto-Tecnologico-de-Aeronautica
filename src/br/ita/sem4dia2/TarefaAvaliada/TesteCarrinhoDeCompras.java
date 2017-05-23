package br.ita.sem4dia2.TarefaAvaliada;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteCarrinhoDeCompras {

	private CarrinhoDeCompras carrinho;
	private static Produto p1;
	private static ProdutoComTamanho p2;
	
	@Before
	public void inicializaCarrinho(){
		carrinho = new CarrinhoDeCompras();
	}
	
	@BeforeClass
	public static void inicializaProd(){
		p1 = new Produto(0,"blusa",new Float(60));
		p2 = new ProdutoComTamanho(0,"bermuda",new Float(110),40);
	}
	
	@Test
	public void testeRemover(){
		carrinho.adicionaCarrinho(p1, 5);
		carrinho.adicionaCarrinho(p2, 5);
		carrinho.removeCarrinho(p1, 1);
		carrinho.removeCarrinho(p2, 3);
		assertEquals(new Double(460),carrinho.getTotalCompra());
		
		System.out.println();
		System.out.println("Testando Remo��o:");
		
		for(Map.Entry<Produto, Integer> listaAposRemocao : carrinho.getListaDeProdutos().entrySet()){
			System.out.println(listaAposRemocao.getKey().getNome() + " - " + listaAposRemocao.getValue());
		}
	}
	
	@Test
	public void testeAdd(){
		carrinho.adicionaCarrinho(p2, 2);
		//Produto com quantidade zero n�o � adicionado
		carrinho.adicionaCarrinho(p1, 0);
		assertEquals(new Double(220),carrinho.getTotalCompra());
		
		System.out.println();
		System.out.println("Testando Adi��o:");
		
		for(Map.Entry<Produto, Integer> listaAposAdicao : carrinho.getListaDeProdutos().entrySet()){
			System.out.println(listaAposAdicao.getKey().getNome() + " - " + listaAposAdicao.getValue());
		}
	}
	
	@Test
	public void testaTotalCompra() {
		carrinho.adicionaCarrinho(p1, 1);
		carrinho.adicionaCarrinho(p2, 1);
		assertEquals(new Double(170),carrinho.getTotalCompra());
		
		System.out.println();
		System.out.println("Testando Compra:");
		
		for(Map.Entry<Produto, Integer> listaTotalCompra : carrinho.getListaDeProdutos().entrySet()){
            System.out.println(listaTotalCompra.getKey().getNome() + " - " + listaTotalCompra.getValue());
        }
	}
}