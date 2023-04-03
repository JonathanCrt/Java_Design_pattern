package creational.factory.method;

import creational.factory.method.factory.DialogFactory;
import creational.factory.method.factory.HtmlDialogFactory;
import creational.factory.method.factory.WindowsDialogFactory;

public class Demo {
    private static DialogFactory dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialogFactory();
        } else {
            dialog = new HtmlDialogFactory();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.render();
    }
}
