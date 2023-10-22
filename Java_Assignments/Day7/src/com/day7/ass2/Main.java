package com.day7.ass2;
 abstract class Beverages{
	public void addMilk() {
		System.out.println("adding Milk");
	}
	abstract void addIngredients();
}
 class Coffee extends Beverages{

	@Override
	void addIngredients() {
		System.out.println("adding ingredients for Coffee");
	}
 }
 class Tea extends Beverages{

	@Override
	void addIngredients() {
	System.out.println("adding ingredients for tea");	
	}
	 
 }
 class FruitJuice extends Beverages{

	@Override
	void addIngredients() {
		System.out.println("adding ingredients for Fruit juice");
	}
	 
 }
public class Main{
public static void main(String[] args) {
	Beverages b1[]= new Beverages[3];
	b1[0]= new Coffee();
	b1[1]= new Tea();
	b1[2]= new FruitJuice();
	for (Beverages beverages : b1) {
		beverages.addMilk();
		beverages.addIngredients();
	}
	
	
	
}
}
