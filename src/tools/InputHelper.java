package tools;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputHelper {

    public static boolean isDoubleNumber (String inputValue) {
        Pattern pattern = Pattern.compile("^(\\d*\\.?\\d*)$");

        Matcher matcher = pattern.matcher(inputValue);
        return matcher.find();
    }
}
