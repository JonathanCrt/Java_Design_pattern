package creational.factory.abstraite.families.buttons;

/**
 * All products families have the same varieties (Android/Windows).
 * This is another variant of a button.
 */
public class AndroidButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created AndroidButton.");
    }
}
