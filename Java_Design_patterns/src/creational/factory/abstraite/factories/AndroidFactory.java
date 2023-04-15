package creational.factory.abstraite.factories;

import creational.factory.abstraite.families.appbar.AndroidAppBar;
import creational.factory.abstraite.families.appbar.AppBar;
import creational.factory.abstraite.families.buttons.AndroidButton;
import creational.factory.abstraite.families.buttons.Button;
import creational.factory.abstraite.families.table.AndroidTable;
import creational.factory.abstraite.families.table.Table;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class AndroidFactory implements UIFactory {
    @Override
    public AppBar createAppBar() {
        return new AndroidAppBar();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Table createTable() {
        return new AndroidTable();
    }
}
