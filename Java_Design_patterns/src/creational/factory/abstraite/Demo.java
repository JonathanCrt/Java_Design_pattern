package creational.factory.abstraite;

import creational.factory.abstraite.factories.AndroidFactory;
import creational.factory.abstraite.factories.IosFactory;
import creational.factory.abstraite.factories.UIFactory;

public class Demo {

    /**
     * Application picks the factory type and creates it in runtime (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        UIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("android")) {
            factory = new AndroidFactory();
        } else {
            factory = new IosFactory();
        }
        return new Application(factory);
    }


    public static void main(String[] args) {
        Application app = configureApplication();
        app.paintAll();
    }
}
