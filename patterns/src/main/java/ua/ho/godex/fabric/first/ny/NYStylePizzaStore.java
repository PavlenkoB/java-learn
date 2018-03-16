package ua.ho.godex.fabric.first.ny;

import ua.ho.godex.fabric.first.Pizza;
import ua.ho.godex.fabric.first.PizzaStore;
import ua.ho.godex.fabric.first.ny.pizza.NYStyleCheesePizza;
import ua.ho.godex.fabric.first.ny.pizza.NYStyleClamPizza;
import ua.ho.godex.fabric.first.ny.pizza.NYStylePepperoniPizza;
import ua.ho.godex.fabric.first.ny.pizza.NYStyleVeggiePizza;

/**
 * Creator: Pavlenko Bohdan
 * Date: 16.03.2018
 * Project: patterns
 */
public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
