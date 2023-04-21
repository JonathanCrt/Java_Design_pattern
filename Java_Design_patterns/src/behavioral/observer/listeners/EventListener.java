package behavioral.observer.listeners;

import java.io.File;

public interface EventListener {
    void onUpdate(String eventType, File file);
}
