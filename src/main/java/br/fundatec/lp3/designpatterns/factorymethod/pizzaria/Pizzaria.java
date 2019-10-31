package br.fundatec.lp3.designpatterns.factorymethod.pizzaria;

import br.fundatec.lp3.designpatterns.factorymethod.pizza.Pizza;

public abstract class Pizzaria {
	
	public Pizza pedirPizza(String sabor) {
		
		Pizza pizza = criarPizza(sabor);
		
		pizza.preparar();
		pizza.cozinhar();
		pizza.cortar();
		pizza.embalar();
		
		return pizza;
		
	}
	
	protected abstract Pizza criarPizza(String sabor);

}
