import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
    private Pattern pattern;
    private Matcher matcher;
    private static String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public ValidateAccount(){
    }
    public boolean validAccount(String input){
        pattern = Pattern.compile(ACCOUNT_REGEX);
        matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
