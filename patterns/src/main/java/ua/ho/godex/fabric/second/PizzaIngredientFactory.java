package ua.ho.godex.fabric.second;

import ua.ho.godex.fabric.second.ingredient.cheese.Cheese;
import ua.ho.godex.fabric.second.ingredient.clams.Clams;
import ua.ho.godex.fabric.second.ingredient.dough.Dough;
import ua.ho.godex.fabric.second.ingredient.pepperoni.Pepperoni;
import ua.ho.godex.fabric.second.ingredient.sauce.Sauce;
import ua.ho.godex.fabric.second.ingredient.veggies.Veggies;

/**
 * Creator: Pavlenko Bohdan
 * Date: 17.03.2018
 * Project: patterns
 */
public interface PizzaIngredientFactory {
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClams();
}
