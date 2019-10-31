package br.fundatec.lp3.designpatterns.factorymethod;

import br.fundatec.lp3.designpatterns.factorymethod.pizza.Pizza;
import br.fundatec.lp3.designpatterns.factorymethod.pizzaria.Pizzaria;
import br.fundatec.lp3.designpatterns.factorymethod.pizzaria.PizzariaPortoAlegre;
import br.fundatec.lp3.designpatterns.factorymethod.pizzaria.PizzariaSP;

public class App {
	
    public static void main( String[] args ) {
    	
    	Pizzaria pizzariaPoa = new PizzariaPortoAlegre();
    	Pizzaria pizzariaSP = new PizzariaSP();
    	
    	Pizza pizzaDeQueijoPoa = pizzariaPoa.pedirPizza("queijo");
    	System.out.println("Saindo uma " + pizzaDeQueijoPoa.getName());
    	
    	System.out.println("");
    	
    	Pizza pizzaDeQueijoSP = pizzariaSP.pedirPizza("queijo");
    	System.out.println("Saindo uma " + pizzaDeQueijoSP.getName());
        
    }
    
}
