public class LogMessage {
    private String machineId;
    private String description;

    /** Precondition: message is a valid log message. */
    public LogMessage(String message) {
        int idx = message.indexOf(":");
        machineId = message.substring(0, idx);
        description = message.substring(idx + 1, message.length());
    }

    /** Returns true if the description in this log message properly contains keyword;
     *  false otherwise.
     */
    public boolean containsWord(String keyword) {
        int idx = description.indexOf(keyword);
        int l = keyword.length();
        if (idx == -1) return false;
        if (idx + keyword.length() < description.length()) {
            if (!description.substring(idx + l, idx + l + 1).equals(" ")) return false;
        }
        if (idx > 0) {
            if (!description.substring(idx - 1, idx).equals(" ")) return false;
        }
        return true;
    }

    public String getMachineId() { return machineId; }
    public String getDescription() { return description; }
    // There may be instance variables, constructors, and methods that are not shown.

    public static void main(String[] args) {
        LogMessage log1 = new LogMessage("Webserver:disk offline");
        LogMessage log2 = new LogMessage("SERVER1:file not found");

        System.out.println(log1.containsWord("disk"));
        System.out.println(log2.containsWord("disk"));
    }
}