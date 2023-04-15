package creational.factory.abstraite.factories;

import creational.factory.abstraite.families.appbar.AppBar;
import creational.factory.abstraite.families.buttons.Button;
import creational.factory.abstraite.families.table.Table;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface UIFactory {
    AppBar createAppBar();
    Button createButton();
    Table createTable();
}
