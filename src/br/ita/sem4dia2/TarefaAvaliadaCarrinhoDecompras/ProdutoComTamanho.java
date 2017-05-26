package br.ita.sem4dia2.TarefaAvaliadaCarrinhoDecompras;

/*Crie uma classe chamada ProdutoComTamanho que estenda a classe Produto.
Essa classe deve possuir uma informa��o adicional de tamanho. 
Um exemplo seria o tamanho de uma roupa ou a numera��o de um cal�ado. 
M�todo equals() e hashCode() devem ser sobrescritos de forma que um produto com mesmo
c�digo e tamanhos diferentes s�o considerados diferentes.
*/

public class ProdutoComTamanho extends Produto {

	private int tamanho;
	
	//Atributo para equals() e o hashCode()
	private ProdutoComTamanho prod;
	
	public ProdutoComTamanho(int codigo, String nome, int preco, int tamanho) {
		super(codigo,nome,preco);
		this.tamanho = tamanho;
	}
	
	public boolean equals(Object o){
		prod = (ProdutoComTamanho) o;
		if(super.equals(prod) && this.getTamanho() == prod.getTamanho())
			prodIguais = true;
		else prodIguais = false;
		return prodIguais;
	}
	
	public int hashCode(){
		if(prodIguais)
			return prod.hashCode();
		else return this.getCodigo() + this.getTamanho();
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public int getTamanho() {
		return tamanho;
	}

}