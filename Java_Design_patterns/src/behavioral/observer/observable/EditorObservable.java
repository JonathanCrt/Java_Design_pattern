package behavioral.observer.observable;

import java.io.File;

public class EditorObservable {
    public EventObservableManager events;
    private File file;

    public EditorObservable() {
        this.events = new EventObservableManager("open", "save");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notifyListeners("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notifyListeners("save", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }
}
