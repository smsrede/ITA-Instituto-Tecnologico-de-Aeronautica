package br.ita.sem2dia2;

//importei para usar o HashMap
import java.util.HashMap;
import java.util.Map.Entry;

public class Pizza {
	
	public String nome;
	
	//para contabilizar quais ingrediente e qtde
	public HashMap<String, Integer> ingredientesHahs = new HashMap<String, Integer>();
	//public static HashMap<String, Integer> ingredientesHahs2 = new HashMap<String, Integer>();
	
	//armazena a quantidade individual de cada instancia de pizza
	public int contaIngradienteInstancia = 0;


	
	//armazena a quantidade de ingredientes de todas as pizzas
	private static int contaIngredienteTotal = 0;
	
	public void adicionaIngrediente(String i, int qtde) {
		//contabiliza uso total de ingredientes
		contaIngredienteTotal++;
		
		//armazena num MAP cada ingrediente e sua quantidade de porção por pizza;
		this.ingredientesHahs.put(i, qtde);
		this.contaIngradienteInstancia += this.ingredientesHahs.get(i);
	}

	// calcula o preco da pizza
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
	
	
	public static int getIngredienteTotalPizza(){
		return contaIngredienteTotal;
	}


}
