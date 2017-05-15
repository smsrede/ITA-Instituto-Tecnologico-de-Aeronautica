package br.ita.sem2dia2;

//import usado para o Mapa de pizzas e quantidade de ingredientes
import java.util.HashMap;

public class Pizza {
	
	//usada no relatório de saída final
	private String nome;

	// para contabilizar quais ingrediente e qtde
	public HashMap<String, Integer> ingredientesHahs = new HashMap<String, Integer>();
	// public static HashMap<String, Integer> ingredientesHahs2 = new
	// HashMap<String, Integer>();

	// armazena a quantidade individual de cada instancia de pizza
	public int contaIngradienteInstancia = 0;

	// armazena a quantidade de ingredientes de todas as pizzas
	private static int contaIngredienteTotal = 0;

	// adiciona pizza e quantidade de porção de ingrediente usada na pizza ao
	// HashMap

	public void adicionaIngrediente(String i, int qtde) {

		// contabiliza uso total de ingredientes de todas as pizzas
		//ESTATICA
		contaIngredienteTotal++;

		// armazena no MAP cada porção de ingrediente e a quantidade dos tipos
		// usados nas pizza
		this.ingredientesHahs.put(i, qtde);

		// contabiliza uso de ingredientes individuais por pizza instanciada
		this.contaIngradienteInstancia += this.ingredientesHahs.get(i);

	}
	
	// retona o calculo do preco da pizza
	public int getPrecoPizza() {
		int preco = 0;
		if (this.contaIngradienteInstancia <= 2) {
			preco = 15;
		} else if (this.contaIngradienteInstancia >= 3 && this.contaIngradienteInstancia <= 5) {
			preco = 20;
		} else if (this.contaIngradienteInstancia > 5) {
			preco = 23;
		}
		return preco;
	}

	// retorna a qtde total de ingredientes de todas as pizzas
	public static int getIngredienteTotalPizza() {
		return contaIngredienteTotal;
	}

	// retorn o nome da pizza
	public String getNome() {
		return nome;
	}

	// muda o valor da variável local - nome.
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static void  zeraRegistroTotalIngredientes(){
		
		contaIngredienteTotal = 0;
		
	}

}
