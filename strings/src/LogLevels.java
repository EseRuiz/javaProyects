public class LogLevels {

    public static String message(String logLine) {
        String[] lista = logLine.split(":");
        String res = lista[1];
        return (res.trim());
    }

    public static String logLevel(String logLine) {
        String[] lista = logLine.split(":");
        String res = lista[0].replaceAll("[^\\w+]", "");
        return res.toLowerCase();

    }

    public static String reformat(String logLine) {
        String[] log = logLine.split(":");
        String msg = log[0].replaceAll("[^\\w+]", "");
        String msg2 = log[1].trim();
        return (msg2 + " (" + msg.toLowerCase() + ")");

    }
}
