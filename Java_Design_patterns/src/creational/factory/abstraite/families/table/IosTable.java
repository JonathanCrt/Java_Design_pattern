package creational.factory.abstraite.families.table;

/**
 * All products families have the same varieties (Android/Windows).
 * This is another variant of a table.
 */
public class IosTable implements Table {
    @Override
    public void paint() {
        System.out.println("You have created IosTable.");
    }
}
