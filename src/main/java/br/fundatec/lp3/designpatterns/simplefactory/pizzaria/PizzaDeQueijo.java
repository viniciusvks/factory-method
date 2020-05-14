package br.fundatec.lp3.designpatterns.simplefactory.pizzaria;

public class PizzaDeQueijo extends Pizza {

	@Override
	public void preparar() {
		
		System.out.println("Preparando pizza de queijo");
		System.out.println("Preparando massa");
		System.out.println("Adicionando queijo");
		
	}

	@Override
	public String getSabor() {
		return "queijo";
	}

}
