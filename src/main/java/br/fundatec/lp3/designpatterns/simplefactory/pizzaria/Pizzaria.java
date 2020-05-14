package br.fundatec.lp3.designpatterns.simplefactory.pizzaria;

public class Pizzaria {
	
	private FactoryDePizzaSimples factory;
	
	public Pizzaria(FactoryDePizzaSimples factory) {
		this.factory = factory;
	}
	
	public Pizza pedirPizza(String sabor) {
		
		Pizza pizza = factory.criarPizza(sabor);
		
		pizza.preparar();
		pizza.cozinhar();
		pizza.cortar();
		pizza.embalar();
		
		return pizza;
	}

}
