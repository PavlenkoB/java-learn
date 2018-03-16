package ua.ho.godex.strategy;

/**
 * Creator: Pavlenko Bohdan
 * Date: 16.03.2018
 * Project: patterns
 */
public abstract class Character {
    protected WeaponBehavior weapon;

    public abstract void fight();

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
