static class LogLine
{
    public static string Message(string logLine)
    {
        int indexOfColon = logLine.IndexOf(':');
        return logLine.Substring(indexOfColon + 1).Trim();
    }

    public static string LogLevel(string logLine)
    {
        int indexOfBeginning = logLine.IndexOf('[');
        int indexOfEnd = logLine.IndexOf(']');

        return logLine.Substring(indexOfBeginning + 1, indexOfEnd - indexOfBeginning - 1).ToLower();
    }

    public static string Reformat(string logLine)
    {
        string logLevel = LogLevel(logLine);
        string message = Message(logLine);

        return $"{message} ({logLevel})";

    }
}
