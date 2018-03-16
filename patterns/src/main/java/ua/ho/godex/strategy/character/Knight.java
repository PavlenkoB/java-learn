package ua.ho.godex.strategy.character;

import ua.ho.godex.strategy.Character;

/**
 * Creator: Pavlenko Bohdan
 * Date: 16.03.2018
 * Project: patterns
 */
public class Knight extends Character {
    @Override
    public void fight() {
        System.out.println(this.getClass().getSimpleName() + " use " + this.weapon.useWeapon());
    }
}
