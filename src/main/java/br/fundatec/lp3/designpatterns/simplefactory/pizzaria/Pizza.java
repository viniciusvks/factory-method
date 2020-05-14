package br.fundatec.lp3.designpatterns.simplefactory.pizzaria;

public abstract class Pizza {

	public abstract void preparar();
	
	public void cozinhar() {
		System.out.println("Assando por 25 min. a 350 graus");
	}
	
	public void cortar () {
		System.out.println("Cortando em fatias diagonais");
	}
	
	public void embalar() {
		System.out.println("Acomodando na caixa da pizzaria");
	}
	
	public abstract String getSabor();
	
}
