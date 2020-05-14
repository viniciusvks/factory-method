package br.fundatec.lp3.designpatterns.simplefactory;

import br.fundatec.lp3.designpatterns.simplefactory.pizzaria.FactoryDePizzaSimples;
import br.fundatec.lp3.designpatterns.simplefactory.pizzaria.Pizza;
import br.fundatec.lp3.designpatterns.simplefactory.pizzaria.Pizzaria;

public class App {
	
    public static void main( String[] args ) {
    	
    	FactoryDePizzaSimples factory = new FactoryDePizzaSimples();
        Pizzaria pizzaria = new Pizzaria(factory);
        
        Pizza pizzaDeQueijo = pizzaria.pedirPizza("queijo");
        System.out.println("Saindo pizza de " + pizzaDeQueijo.getSabor());
        
        System.out.println("");
        
        Pizza pizzaDeCalabresa = pizzaria.pedirPizza("calabresa");
        System.out.println("Saindo pizza de " + pizzaDeCalabresa.getSabor());
        
    }
    
}
