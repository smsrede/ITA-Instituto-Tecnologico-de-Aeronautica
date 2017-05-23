package br.ita.sem4dia2.TarefaAvaliada;

public class ProdutoComTamanho extends Produto {

	private int tamanho;
	
	//Atributo para equals() e o hashCode()
	private ProdutoComTamanho prod;
	
	public ProdutoComTamanho(int codigo, String nome, float preco, int tamanho) {
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