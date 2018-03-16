package ua.ho.godex.fabric.second.ny;

import ua.ho.godex.fabric.second.PizzaIngredientFactory;
import ua.ho.godex.fabric.second.ingredient.cheese.Cheese;
import ua.ho.godex.fabric.second.ingredient.cheese.ReggianoCheese;
import ua.ho.godex.fabric.second.ingredient.clams.Clams;
import ua.ho.godex.fabric.second.ingredient.clams.FreshClams;
import ua.ho.godex.fabric.second.ingredient.dough.Dough;
import ua.ho.godex.fabric.second.ingredient.dough.ThinCrustDough;
import ua.ho.godex.fabric.second.ingredient.pepperoni.Pepperoni;
import ua.ho.godex.fabric.second.ingredient.pepperoni.SlicedPepperoni;
import ua.ho.godex.fabric.second.ingredient.sauce.MarinaraSauce;
import ua.ho.godex.fabric.second.ingredient.sauce.Sauce;
import ua.ho.godex.fabric.second.ingredient.veggies.*;

/**
 * Creator: Pavlenko Bohdan
 * Date: 17.03.2018
 * Project: patterns
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {
                new Garlic(),
                new Onion(),
                new Mushroom(),
                new RedPepper()
        };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
