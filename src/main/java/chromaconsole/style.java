package chromaconsole;

public class style {
    public static boolean enabled = true;

    public static void disable() {
        style.enabled = false;
    }

    public static void enable() {
        style.enabled = true;
    }

    public static String bold() {
        if (enabled == true){
            return "\033[1m";
        }
        else {
            return "";
        }
    }

    public static String italic() {
        if (enabled == true){
            return "\033[3m";
        }
        else {
            return "";
        }
    }

    public static String underline() {
        if (enabled == true){
            return "\033[4m";
        }
        else {
            return "";
        }
    }

    public static String strikethrough() {
        if (enabled == true){
            return "\033[9m";
        }
        else {
            return "";
        }
    }

    public static String negative() {
        if (enabled == true){
            return "\033[7m";
        }
        else {
            return "";
        }
    }

    public static String normal() {
        if (enabled == true){
            return "\033[22m";
        }
        else {
            return "";
        }
    }

    public static String reset() {
        if (enabled == true){
            return "\033[0m";
        }
        else {
            return "";
        }
    }

    public static String minecraft(String... args) {
        if (enabled == true){
            String symbol = "§";

            String[] codes = {
                "0", color.text("#000"),
                "1", color.text("#00a"),
                "2", color.text("#0a0"),
                "3", color.text("#0aa"),
                "4", color.text("#a00"),
                "5", color.text("#a0a"),
                "6", color.text("#fa0"),
                "7", color.text("#aaa"),
                "8", color.text("#555"),
                "9", color.text("#55f"),
                "a", color.text("#5f5"),
                "b", color.text("#5ff"),
                "c", color.text("#f55"),
                "d", color.text("#f5f"),
                "e", color.text("#ff5"),
                "f", color.text("#fff"),
                "l", bold(),
                "m", strikethrough(),
                "n", underline(),
                "o", italic(),
                "r", reset()
            };

            String text = args.length == 2 ? args[1] : args[0];
            for (int i = 0; i < codes.length; i += 2) {
                text = text.replace(symbol + codes[i], codes[i + 1]);
            }
            return text;
        }
        else {
            return "";
        }
    }
}
