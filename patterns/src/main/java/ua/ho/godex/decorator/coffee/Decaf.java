package ua.ho.godex.decorator.coffee;

import ua.ho.godex.decorator.Beverage;

/**
 * Creator: Pavlenko Bohdan
 * Date: 16.03.2018
 * Project: patterns
 */
public class Decaf extends Beverage {
    public Decaf() {
        this.setDescription(this.getClass().getSimpleName());
    }

    @Override
    public double cost() {
        return 1.80;
    }
}
