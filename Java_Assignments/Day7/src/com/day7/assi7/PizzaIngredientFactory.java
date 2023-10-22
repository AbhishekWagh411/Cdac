package com.day7.assi7;

class Dough {
	
	@Override
	public String toString() {
		return "Dough []";
	}
	
}
class Sauce{

	@Override
	public String toString() {
		return "Sauce []";
	}
	
}
class Cheese{

	@Override
	public String toString() {
		return "Cheese []";
	}
	
}
class Pepperoni{

	@Override
	public String toString() {
		return "Pepperoni []";
	}
	
}
class Clams{

	@Override
	public String toString() {
		return "Clams []";
	}
	
}


public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Pepperoni createPepperoni();
	public Clams createClams();

}
