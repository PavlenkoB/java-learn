package ua.ho.godex.fabric.second.chicago;

import ua.ho.godex.fabric.second.Pizza;
import ua.ho.godex.fabric.second.PizzaStore;
import ua.ho.godex.fabric.second.chicago.pizza.ChicagoStyleCheesePizza;
import ua.ho.godex.fabric.second.chicago.pizza.ChicagoStyleClamPizza;
import ua.ho.godex.fabric.second.chicago.pizza.ChicagoStylePepperoniPizza;
import ua.ho.godex.fabric.second.chicago.pizza.ChicagoStyleVeggiePizza;

/**
 * Creator: Pavlenko Bohdan
 * Date: 16.03.2018
 * Project: patterns
 */
public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
