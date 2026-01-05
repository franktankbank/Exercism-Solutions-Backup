public class LogLine {

    private String logLine;
    
    public LogLine(String logLine) {
        this.logLine = logLine;
    }
    private enum Modes {
        LEVEL,
        MESSAGE
    }
    private String split(Modes mode) {
        switch (mode) {
            case LEVEL:
                int a = this.logLine.indexOf("[") + 1;
                int b = this.logLine.indexOf("]");
                return this.logLine.substring(a, b);
            case MESSAGE:
                int n = this.logLine.indexOf(":") + 2;
                return this.logLine.substring(n);
            default:
                return "";
        }
    }
    public LogLevel getLogLevel() {
        String lvl = this.split(Modes.LEVEL);
        switch (lvl) {
            case "TRC":
                return LogLevel.TRACE;
            case "DBG":
                return LogLevel.DEBUG;
            case "INF":
                return LogLevel.INFO;
            case "WRN":
                return LogLevel.WARNING;
            case "ERR":
                return LogLevel.ERROR;
            case "FTL":
                return LogLevel.FATAL;
            default:
                return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
        LogLevel level = this.getLogLevel();
        String part1 = String.valueOf(level.getLogNumber());
        String delim = ":";
        String part2 = this.split(Modes.MESSAGE);
        return new StringBuilder()
            .append(part1)
            .append(delim)
            .append(part2)
            .toString();
    }
}
