package ua.ho.godex.strategy;

import ua.ho.godex.strategy.character.Character;
import ua.ho.godex.strategy.character.King;
import ua.ho.godex.strategy.weapon.AxeBehavior;
import ua.ho.godex.strategy.weapon.BowAndArrowBehavior;

/**
 * Creator: Pavlenko Bohdan
 * Date: 16.03.2018
 * Project: patterns
 */
public class RunStrategy {
    public static void main(String[] args) {
        Character character1 = new King();
        character1.setWeapon(new AxeBehavior());
        character1.fight();

        character1.setWeapon(new BowAndArrowBehavior());
        character1.fight();
    }
}
