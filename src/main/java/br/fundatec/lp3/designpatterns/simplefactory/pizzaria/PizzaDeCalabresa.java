package br.fundatec.lp3.designpatterns.simplefactory.pizzaria;

public class PizzaDeCalabresa extends Pizza {

	@Override
	public void preparar() {
		
		System.out.println("Preparando pizza de calabresa");
		System.out.println("Preparando massa");
		System.out.println("Adicionando calabresa");
		
	}

	@Override
	public String getSabor() {
		return "calabresa";
	}

}
