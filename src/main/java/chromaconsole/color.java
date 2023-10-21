package chromaconsole;

public class color {
    public static String text(int r, int g, int b) {
        if (style.enabled == true){
            return String.format("\033[38;2;%d;%d;%dm", r, g, b);
        }
        else {
            return "";
        }
    }

    public static String text(String color) {
        if (style.enabled == true){
            // Remove any leading '#' if present
            if (color.startsWith("#")) {
                color = color.substring(1);
            }

            int r, g, b;

            if (color.length() == 3) {
                // Handle formats like "RGB" (e.g., "000")
                r = Integer.parseInt(color.substring(0, 1) + color.substring(0, 1), 16);
                g = Integer.parseInt(color.substring(1, 2) + color.substring(1, 2), 16);
                b = Integer.parseInt(color.substring(2, 3) + color.substring(2, 3), 16);
            } else if (color.length() == 6) {
                // Handle formats like "RRGGBB" (e.g., "000000")
                r = Integer.parseInt(color.substring(0, 2), 16);
                g = Integer.parseInt(color.substring(2, 4), 16);
                b = Integer.parseInt(color.substring(4, 6), 16);
            } else {
                throw new IllegalArgumentException("Invalid color format");
            }

            return text(r, g, b);
        }
        else {
            return "";
        }
    }

    public static String background(int r, int g, int b) {
        if (style.enabled == true){
            return String.format("\033[48;2;%d;%d;%dm", r, g, b);
        }
        else {
            return "";
        }
    }

    public static String background(String color) {
        if (style.enabled == true){
            // Remove any leading '#' if present
            if (color.startsWith("#")) {
                color = color.substring(1);
            }

            int r, g, b;

            if (color.length() == 3) {
                // Handle formats like "RGB" (e.g., "000")
                r = Integer.parseInt(color.substring(0, 1) + color.substring(0, 1), 16);
                g = Integer.parseInt(color.substring(1, 2) + color.substring(1, 2), 16);
                b = Integer.parseInt(color.substring(2, 3) + color.substring(2, 3), 16);
            } else if (color.length() == 6) {
                // Handle formats like "RRGGBB" (e.g., "000000")
                r = Integer.parseInt(color.substring(0, 2), 16);
                g = Integer.parseInt(color.substring(2, 4), 16);
                b = Integer.parseInt(color.substring(4, 6), 16);
            } else {
                throw new IllegalArgumentException("Invalid color format");
            }

            return background(r, g, b);
        }
        else {
            return "";
        }
    }
}
