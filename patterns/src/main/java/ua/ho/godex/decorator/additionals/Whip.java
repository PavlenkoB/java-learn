package ua.ho.godex.decorator.additionals;

import ua.ho.godex.decorator.Beverage;
import ua.ho.godex.decorator.CondimentDecorator;

/**
 * Creator: Pavlenko Bohdan
 * Date: 16.03.2018
 * Project: patterns
 */
public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", " + this.getClass().getSimpleName();
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
