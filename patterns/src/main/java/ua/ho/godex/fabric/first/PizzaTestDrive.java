package ua.ho.godex.fabric.first;

import ua.ho.godex.fabric.first.chicago.ChicagoStylePizzaStore;
import ua.ho.godex.fabric.first.ny.NYStylePizzaStore;

/**
 * Creator: Pavlenko Bohdan
 * Date: 16.03.2018
 * Project: patterns
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan order a " + pizza.getName());
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel order a " + pizza.getName());
    }
}
