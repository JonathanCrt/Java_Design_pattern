package creational.factory.method.factory;

import creational.factory.method.product.Button;
import creational.factory.method.product.HtmlButton;

public class HtmlDialogFactory extends DialogFactory {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
