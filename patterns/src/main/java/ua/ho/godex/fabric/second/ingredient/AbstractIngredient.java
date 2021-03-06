package ua.ho.godex.fabric.second.ingredient;

/**
 * Creator: Pavlenko Bohdan
 * Date: 17.03.2018
 * Project: patterns
 */
public interface AbstractIngredient {
    default String getDescription() {
        return this.getClass().getSimpleName();
    }
}
