package creational.factory.method.creator;

import creational.factory.method.product.Button;
import creational.factory.method.product.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
