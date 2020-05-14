package br.fundatec.lp3.designpatterns.simplefactory.pizzaria;

public class FactoryDePizzaSimples {
	
	public Pizza criarPizza(String sabor) {
		
		Pizza pizza = null;
		
		switch(sabor) {
			
			case "queijo":
				pizza = new PizzaDeQueijo();
				break;
			case "calabresa":
				pizza = new PizzaDeCalabresa();
				break;
		
		}
				
		return pizza;
		
	}

}
