package tools;

public class InputHelper {
    public static int parseInt(String input) throws Exception {
        int parseVal = Integer.parseInt(input);
        if (parseVal <= 0) {
            throw new Exception("Invalid value");
        }

        return parseVal;
    }

    public static double parseDouble(String input) throws Exception {
        double parseVal = Double.parseDouble(input);
        if (parseVal <= 0) {
            throw new Exception("Invalid value");
        }

        return parseVal;
    }
}
