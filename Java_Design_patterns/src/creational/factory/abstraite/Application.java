package creational.factory.abstraite;

import creational.factory.abstraite.factories.UIFactory;
import creational.factory.abstraite.families.appbar.AppBar;
import creational.factory.abstraite.families.buttons.Button;
import creational.factory.abstraite.families.table.Table;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private final AppBar appBar;
    private final Button button;
    private final Table table;

    public Application(UIFactory uiFactory) {
        this.appBar = uiFactory.createAppBar();
        this.button =  uiFactory.createButton();
        this.table = uiFactory.createTable();
    }

    public void paintAll() {
        this.appBar.paint();
        this.button.paint();
        this.table.paint();
    }
}
