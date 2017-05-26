package br.ita.sem4dia2.TarefaAvaliadaCarrinhoDecompras;

public class Produto {

	private int codigo;
	private String nome;
	private int preco;

	/*
	 * Sobrescreva os m�todos equals() e hashCode() de Object (veja se��o sobre
	 * esses m�todos), de forma a serem considerados iguais instancias de
	 * Produto que possuam o mesmo c�digo.
	 */

	// Atributos para equals() e o hashCode()
	protected boolean prodIguais;
	private Produto prod;

	public Produto(int cod, String nome, int preco) {
		this.codigo = cod;
		this.preco = preco;
		this.nome = nome;
	}

	public boolean equals(Object o) {
		prod = (Produto) o;
		if (this.getCodigo() == prod.getCodigo())
			prodIguais = true;
		else
			prodIguais = false;
		return prodIguais;
	}

	public int hashCode() {
		if (prodIguais)
			return prod.hashCode();
		else
			return super.hashCode();
	}

	//:GETs
	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public float getPreco() {
		return preco;
	}

	//:SETs
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

}