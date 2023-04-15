package creational.factory.abstraite.families.buttons;

public class IosButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created IosButton.");
    }
}
