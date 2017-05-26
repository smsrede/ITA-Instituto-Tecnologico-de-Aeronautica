package br.ita.sem4dia2.TarefaAvaliadaCarrinhoDecompras;

import java.util.HashMap;

/*Crie uma classe CarrinhoDeCompras que armazene em um atributo interno do tipo HashMap
cada produto adicionado no carrinho e sua respectiva quantidade.
O m�todo adicionaProduto() deve receber a instancia do produto e a quantidade. 
Caso o produto j� exista no HashMap, a quantidade deve ser somada a que j� existe no carrinho. 
Deve haver tamb�m um m�todo removeProduto() que tamb�m recebe a instancia do produto e a 
quantidade a ser removida. Observe que produtos de tamanhos diferentes devem ser 
considerados como produtos diferentes no carrinho. O carrinho deve possuir um m�todo 
que calcula o valor total da compra.
*/

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
			else System.out.println("Sem produto no carrinho");
		}
		else System.out.println("Quantidade maior que 0");
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