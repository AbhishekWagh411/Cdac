package com.day7.assi7;

public class Pizza {
public static void main(String[] args) {
	PizzaIngredientFactory pz[]= new PizzaIngredientFactory[2];
	pz[0]= new USPizzaIngredientFactory();
	pz[1]= new IndianPizzaIngredientFactory();
	
	for (PizzaIngredientFactory pizzaIngredientFactory : pz) {
		System.out.println(pizzaIngredientFactory.createDough().toString());
		System.out.println(pizzaIngredientFactory.createSauce().toString());
		System.out.println(pizzaIngredientFactory.createCheese().toString());
		System.out.println(pizzaIngredientFactory.createPepperoni().toString());
		System.out.println(pizzaIngredientFactory.createClams().toString());
		System.out.println();
	}
}
}
