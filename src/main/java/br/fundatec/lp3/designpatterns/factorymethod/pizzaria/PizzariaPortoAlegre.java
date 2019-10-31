package br.fundatec.lp3.designpatterns.factorymethod.pizzaria;

import br.fundatec.lp3.designpatterns.factorymethod.pizza.Pizza;
import br.fundatec.lp3.designpatterns.factorymethod.pizza.PizzaDeQueijoPOA;

public class PizzariaPortoAlegre extends Pizzaria {

	@Override
	protected Pizza criarPizza(String sabor) {
		
		switch(sabor) {
			case "queijo":
				return new PizzaDeQueijoPOA();
		}
		
		return null;
	}

}
