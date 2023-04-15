package creational.prototype.shapes;

import java.util.Objects;

public abstract class ShapePrototype {
    public int x;
    public int y;
    public String color;

    public ShapePrototype() {
    }

    public ShapePrototype(ShapePrototype target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract ShapePrototype clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof ShapePrototype shapePrototype2)) return false;
        return shapePrototype2.x == x && shapePrototype2.y == y && Objects.equals(shapePrototype2.color, color);
    }

}
