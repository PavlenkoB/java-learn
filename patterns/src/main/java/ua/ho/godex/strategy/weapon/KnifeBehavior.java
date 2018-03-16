package ua.ho.godex.strategy.weapon;

import ua.ho.godex.strategy.WeaponBehavior;

/**
 * Creator: Pavlenko Bohdan
 * Date: 16.03.2018
 * Project: patterns
 */
public class KnifeBehavior implements WeaponBehavior {
    @Override
    public String useWeapon() {
        return "Nice " + this.getClass().getSimpleName();
    }
}
