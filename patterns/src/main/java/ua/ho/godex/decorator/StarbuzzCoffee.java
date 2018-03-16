package ua.ho.godex.decorator;

import ua.ho.godex.decorator.additionals.Mocha;
import ua.ho.godex.decorator.additionals.Soy;
import ua.ho.godex.decorator.additionals.Whip;
import ua.ho.godex.decorator.coffee.DarkRoast;
import ua.ho.godex.decorator.coffee.Espresso;
import ua.ho.godex.decorator.coffee.HouseBlend;

/**
 * Creator: Pavlenko Bohdan
 * Date: 16.03.2018
 * Project: patterns
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        ShowBeverageInfo(espresso);

        Beverage beverageDR = new DarkRoast();
        beverageDR = new Mocha(beverageDR);
        beverageDR = new Mocha(beverageDR);
        beverageDR = new Whip(beverageDR);
        ShowBeverageInfo(beverageDR);

        Beverage beverageHB = new HouseBlend();
        beverageHB = new Soy(beverageHB);
        beverageHB = new Mocha(beverageHB);
        beverageHB = new Whip(beverageHB);
        ShowBeverageInfo(beverageHB);
    }

    static void ShowBeverageInfo(Beverage beverage) {
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
