package creational.prototype.registry;

import creational.prototype.shapes.Circle;
import creational.prototype.shapes.Rectangle;
import creational.prototype.shapes.ShapePrototype;

import java.util.HashMap;
import java.util.Map;

public class ShapePrototypeRegistry {
    private final Map<String, ShapePrototype> cache = new HashMap<>();

    public ShapePrototypeRegistry() {
        Circle circle = new Circle();
        circle.x = 5;
        circle.y = 7;
        circle.radius = 45;
        circle.color = "Green";

        Rectangle rectangle = new Rectangle();
        rectangle.x = 6;
        rectangle.y = 9;
        rectangle.width = 8;
        rectangle.height = 10;
        rectangle.color = "Blue";

        cache.put("Big green circle", circle);
        cache.put("Medium blue rectangle", rectangle);
    }

    public ShapePrototype put(String key, ShapePrototype shape) {
        cache.put(key, shape);
        return shape;
    }

    public ShapePrototype get(String key) {
        return cache.get(key).clone();
    }
}
