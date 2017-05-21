package br.ita.sem2dia3.ModelagemCRC2;

import java.util.HashMap;

public class HashMapBasico {
	
	static HashMap<String, Integer> ingredientesHahs = new HashMap<String, Integer>();
	public static void main(String[] args) {
		
		
		ingredientesHahs.put("mussarela", 3);
		ingredientesHahs.put("portugueza", 6);
		ingredientesHahs.put("calabreza", 9);
		
		
		int valores1 = ingredientesHahs.get("mussarela");
		int valores2 = ingredientesHahs.get("portugueza");
		int valores3 = ingredientesHahs.get("calabreza");
		int total = 0;
		total += valores1;
		total += valores2;
		total += valores3;
		
		System.out.println(total);

	}

}
