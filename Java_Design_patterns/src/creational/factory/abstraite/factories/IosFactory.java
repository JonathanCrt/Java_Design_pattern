package creational.factory.abstraite.factories;

import creational.factory.abstraite.families.appbar.AppBar;
import creational.factory.abstraite.families.appbar.IosAppBar;
import creational.factory.abstraite.families.buttons.Button;
import creational.factory.abstraite.families.buttons.IosButton;
import creational.factory.abstraite.families.table.IosTable;
import creational.factory.abstraite.families.table.Table;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class IosFactory implements UIFactory {
    @Override
    public AppBar createAppBar() {
        return new IosAppBar();
    }

    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Table createTable() {
        return new IosTable();
    }
}
