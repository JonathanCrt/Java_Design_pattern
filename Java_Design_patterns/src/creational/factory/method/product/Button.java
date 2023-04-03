package creational.factory.method.product;

/**
 * Common interface (represents Product) for all buttons (Concrete ProductX).
 */
public interface Button {
    void render();
    void onClick();
}
