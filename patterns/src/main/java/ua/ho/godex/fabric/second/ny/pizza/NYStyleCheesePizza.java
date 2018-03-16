package ua.ho.godex.fabric.second.ny.pizza;

import ua.ho.godex.fabric.second.Pizza;

/**
 * Creator: Pavlenko Bohdan
 * Date: 16.03.2018
 * Project: patterns
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        this.name = "NY Style Sauce and Cheese Pizza";
        this.dough = "Thi Crust Dough";
        this.sauce = "Marinara Sauce";
        this.toppings.add("Greated Reggiano Cheese");
    }
}
