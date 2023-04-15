package creational.prototype;

import creational.prototype.registry.ShapePrototypeRegistry;
import creational.prototype.shapes.ShapePrototype;

public class DemoRegistry {
    public static void main(String[] args) {
        ShapePrototypeRegistry cache = new ShapePrototypeRegistry();

        ShapePrototype shape1 = cache.get("Big green circle");
        ShapePrototype shape2 = cache.get("Medium blue rectangle");
        ShapePrototype shape3 = cache.get("Medium blue rectangle");

        if (shape1 != shape2 && !shape1.equals(shape2)) {
            System.out.println("Big green circle != Medium blue rectangle (yay!)");
        } else {
            System.out.println("Big green circle == Medium blue rectangle (booo!)");
        }

        if (shape2 != shape3) {
            System.out.println("Medium blue rectangles are two different objects (yay!)");
            if (shape2.equals(shape3)) {
                System.out.println("And they are identical (yay!)");
            } else {
                System.out.println("But they are not identical (booo!)");
            }
        } else {
            System.out.println("Rectangle objects are the same (booo!)");
        }
    }
}
