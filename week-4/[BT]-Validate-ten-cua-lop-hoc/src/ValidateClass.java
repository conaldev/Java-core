import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    private Pattern pattern;
    private Matcher matcher;

    public boolean isClassName(String input){
        pattern = Pattern.compile("^[CAP][0-9]{4}[GHIKLM]$");
        matcher = pattern.matcher(input);
        boolean isValid = matcher.matches();
        return isValid;
    }
}
