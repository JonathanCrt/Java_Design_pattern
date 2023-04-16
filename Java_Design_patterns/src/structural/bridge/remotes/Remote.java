package structural.bridge.remotes;

/**
 * Common interface for all remotes (implementation hierarchy)
 *
 */
public interface Remote {
    void power();

    void volumeDown();

    void volumeUp();

    void channelDown();

    void channelUp();
}
