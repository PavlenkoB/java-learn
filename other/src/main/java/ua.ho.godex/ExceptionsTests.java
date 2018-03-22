package ua.ho.godex;

/**
 * Creator: Pavlenko Bohdan
 * Date: 22.03.2018
 * Project: java-learn
 */
public class ExceptionsTests {
    public static void main(String[] args) {
        try {
            throw new Exception("Qwerty");
        } catch (Error e) {
            System.out.println("We got error" + e.getClass().getSimpleName());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("We got error" + e.getClass().getSimpleName());
            e.printStackTrace();
        }
    }
}
