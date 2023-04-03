package creational.factory.method.creator;

import creational.factory.method.product.Button;
import creational.factory.method.product.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
