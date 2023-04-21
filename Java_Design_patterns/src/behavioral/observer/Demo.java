package behavioral.observer;

import behavioral.observer.listeners.EmailNotificationListener;
import behavioral.observer.listeners.LogOpenListener;
import behavioral.observer.observable.EditorObservable;

public class Demo {
    public static void main(String[] args) {
        EditorObservable editor = new EditorObservable();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
