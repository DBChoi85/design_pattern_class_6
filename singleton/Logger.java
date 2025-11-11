import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public enum Logger {
    INSTANCE;

    private final String id = UUID.randomUUID().toString();
    private final List<String> logs = new ArrayList<>();

    public void log(String msg) {
        String logMsg = "[LOG] " + msg;
        logs.add(logMsg);
        System.out.println(logMsg);
    }

    public String getId() {
        return id;
    }

    public List<String> getLogs() {
        return logs;
    }
}
