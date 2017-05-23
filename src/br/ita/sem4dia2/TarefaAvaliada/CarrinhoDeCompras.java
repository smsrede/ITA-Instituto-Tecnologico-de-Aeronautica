package br.ita.sem4dia2.TarefaAvaliada;

import java.util.HashMap;

public class CarrinhoDeCompras {

	private HashMap<Produto,Integer> listaDeProdutos;
	private Double totalCompra;
	
	public CarrinhoDeCompras(){
		listaDeProdutos = new HashMap<Produto,Integer>();
		totalCompra = 0.00;
	}
	
	public void adicionaCarrinho(Produto produto,int quantidade){
		if(quantidade > 0){
			if(listaDeProdutos.containsKey(produto))
				listaDeProdutos.put(produto, listaDeProdutos.get(produto) + quantidade);
			else listaDeProdutos.put(produto, quantidade);
			totalCompra += produto.getPreco() * quantidade;
		}
		else System.out.println("A quantidade do produto a ser adicionada deve ser maior que zero!");
	}
	
	public void removeCarrinho(Produto produto,int quantidade){
		if(quantidade > 0){
			if(listaDeProdutos.containsKey(produto)){
				listaDeProdutos.put(produto, listaDeProdutos.get(produto) - quantidade);
				totalCompra -= produto.getPreco() * quantidade;
				if(listaDeProdutos.get(produto) <= 0)
					listaDeProdutos.remove(produto);
			}
			else System.out.println("O produto não existe no carrinho!");
		}
		else System.out.println("A quantidade do produto a ser removida deve ser maior que zero!");
	}

	public HashMap<Produto, Integer> getListaDeProdutos() {
		return listaDeProdutos;
	}
	
	public Double getTotalCompra() {
		return totalCompra;
	}

	public void setListaDeProdutos(HashMap<Produto, Integer> listaDeProdutos) {
		this.listaDeProdutos = listaDeProdutos;
	}
	
	public void setTotalCompra(Double totalCompra) {
		this.totalCompra = totalCompra;
	}
	
}