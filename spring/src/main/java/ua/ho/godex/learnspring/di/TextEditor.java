package ua.ho.godex.learnspring.di;

/**
 * Creator: Pavlenko Bohdan
 * Date: 09.05.2018
 * Project: patterns
 */
public class TextEditor {
    private SpellChecker spellChecker;

    // a getter method to return spellChecker
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    // a setter method to inject the dependency.
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker.");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
