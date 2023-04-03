package creational.factory.method.creator;

import creational.factory.method.product.Button;

/**
 * Base factory class (Creator). Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 */
public abstract class Dialog {
    public void render() {
        Button okButton = createButton();
        okButton.onClick();
        okButton.render();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects. Important returned type is interface type
     */
    public abstract Button createButton();
}
