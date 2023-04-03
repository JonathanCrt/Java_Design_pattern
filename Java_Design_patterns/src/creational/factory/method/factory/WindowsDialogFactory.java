package creational.factory.method.factory;

import creational.factory.method.product.Button;
import creational.factory.method.product.WindowsButton;

public class WindowsDialogFactory extends DialogFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
