package com.company;

public class ChicagoPizzaStore extends PizzaStore {
	@Override
	protected Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		}
//		else if (type.equals("veggie")) {
//			return new NYStyleVeggiePizza();
//		}
//		else if (type.equals("clam")) {
//			return new NYStyleClamPizza();
//		}
//		else if (type.equals("pepperoni")) {
//			return new NYStylePepperoniPizza();
//		}
		else {
			return null;
		}
	}
}
