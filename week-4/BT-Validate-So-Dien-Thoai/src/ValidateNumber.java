import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNumber {
    private Pattern pattern;
    private Matcher matcher;

    public boolean isValidNumber(String input){
        pattern = Pattern.compile("^\\([0-9]{2}\\)[-]{1}\\([0-9]{10}\\)");
        matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
