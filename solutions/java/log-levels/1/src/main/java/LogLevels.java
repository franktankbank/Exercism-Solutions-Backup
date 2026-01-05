public class LogLevels {
    
    public static String message(String logLine) {
        String logMessage = logLine.split(":\s")[1].trim();
        return logMessage;
    }

    public static String logLevel(String logLine) {
        String level = logLine.split(":\s")[0].replace("[", "").replace("]", "").toLowerCase().trim();
        return level;
    }

    public static String reformat(String logLine) {
        String logMessage = message(logLine);
        String level = logLevel(logLine);
        String reformattedLine = logMessage + " (" + level + ")";
        return reformattedLine;
    }
}
