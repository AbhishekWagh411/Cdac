package com.day7.assi7;

public class USPizzaIngredientFactory implements PizzaIngredientFactory{
	
	@Override
	public Dough createDough() {
		System.out.println("USPizzaIngredientFactory");
		return new Dough();
	}

	@Override
	public Sauce createSauce() {
		return new Sauce();
	}

	@Override
	public Cheese createCheese() {
		return new Cheese();
	}

	@Override
	public Pepperoni createPepperoni() {
		return new Pepperoni();
	}

	@Override
	public Clams createClams() {
		return new Clams();
	}

}
